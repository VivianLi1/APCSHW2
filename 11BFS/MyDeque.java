import java.util.*;
import java.io.*;

public class MyDeque<T>{

    private Object[] arr;
    private int head, tail, size;
    private int[] priorCount; 

    public MyDeque(){
	arr = new Object[10];
	size = 0;
	head = 0;
	tail = head + (size - 1);
	priorCount = new int[15];
    }

    public int size(){
	return size;
    }
    
    public void addFirst(T value){
	resize();	
	head--;
	if(head == -1){
	    head = arr.length - 1;
	}
	arr[head] = value;
	size++;
    }

    public void addLast(T value){
	resize();
	if(tail >= arr.length){
	    tail = tail % arr.length;
	}
	arr[tail] = value;
	size++;
	    
    }
    
    public T removeFirst(){
	@SuppressWarnings("unchecked")
	T temp = (T)arr[head];
	arr[head] = null;
	head++;
	return (T)temp;
    }

    public T removeLast(){
	@SuppressWarnings("unchecked")
	T temp = (T)arr[tail];
	arr[tail] = null;
	tail--;
	return (T)temp;
    }
    
    
    public T getFirst(){
	@SuppressWarnings("unchecked")
        T temp = (T)arr[head];
	return (T)temp;
    }

    public T getLast(){
	@SuppressWarnings("unchecked")
        T temp = (T)arr[tail];
	return (T)temp;
    }

    public void resize(){
	if(size == arr.length){
	    Object[] copy = new Object[size * 2];
	    int[] priorCountCopy = new int[size * 2];
	    if(head <= tail){
		for(int i = head; i < tail; i++){
		    copy[i] = arr[i];
		    priorCountCopy[i] = priorCount[i];
		}
	    }else{
		for(int i = head; i < arr.length; i++){
		    copy[i] = arr[i];
		    priorCountCopy[i] = priorCount[i];

		}
		for(int i = 0; i < tail; i++){
		    copy[i] = arr[i];
		    priorCountCopy[i] = priorCount[i];

		}
	    }
	    arr = copy;
	    priorCount = priorCountCopy;
	    head = 0;
	    tail = size - 1;
	}
    }

    public void add(T value, int priority){
	addLast(value);
	resize();
	priorCount[tail] = priority;
    }

    public T removeSmallest(){
	int minInd = head;
	for(int i = 0; i < size; i++){
	    int temp = (i + head) % arr.length;
	    if(priorCount[temp] < priorCount[minInd]){
		minInd = temp;
	    }
	}
	@SuppressWarnings("unchecked")
	T minVal = (T)arr[minInd];
	arr[minInd] = arr[head];
	arr[head] = null;
	priorCount[minInd] = priorCount[head];
	size--;
	head = (head + 1) % arr.length;
	return (T)minVal;
    }
}

    
