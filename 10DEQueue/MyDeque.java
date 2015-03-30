import java.util.*;
import java.io.*;

public class MyDeque<T>{

    private Object[] arr;
    private int head, tail, size;

    public MyDeque(){
	arr = new Object[10];
	size = 0;
	head = 0;
	tail = head + (size - 1);
    }
    
    public void addFirst(T value){
	if(size == arr.length){
	    resize(arr.length*2);
	}
	head--;
	if(head == -1){
	    head = arr.lengt - 1;
	}
	arr[head] = value;
	size++;
    }

    public void addLast(T value){
	if(size == arr.length){
	    resize(arr.length * 2);
	}
	if(tail > arr.lengt){
	    tail = 0;
	}
	arr[tail] = value;
	size++;
	    
    }
    
    public T removeFirst(){
	T temp = arr[head];
	arr[head] = null;
	head++;
	return (T)temp;
    }

    public T removeLast(){
	T temp = arr[tail];
	arr[tail] = null;
	tail--;
	return (T)temp;
    }
    
    
    public T getFirst(){
	return (T)arr[head];
    }

    public T getLast(){
	return (T)arr[tail];
    }

    public void resize(int newSize){
	Object[] copy = new Object[newSize];
	if(head < tail){
	    for(int i = head; i <= tail; i++){
		copy[i] = arr[i];
	    }
	    else{
		for(int i = head; i < arr.length; i++){
		    copy[i] = arr[i];
		}
		for(int i = 0; i <= tail; i++){
		    copy[i+ arr.length] = arr[i];
		}
		tail += arr.length;
	    }
	    arr = copy;
	}
	
    }

}

    
