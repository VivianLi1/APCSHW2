import java.util.*;

public class MyHeap{

    private int[] arr;
    private boolean isMax;

    public String name(){
	return "li.vivian";
    }

    public MyHeap(boolean isMax2){
	arr = new int[2];
	arr[0] = 0;
	isMax = isMax2;
    }
    
    public MyHeap(){
	this(true);	
    }

    public String toString(){
	return "";
    }

    public int remove(){
	return 0;
    }

    public void add(int num){
	if(arr[0] == 0){
	    arr[1] = num;
	}
	int ind = emptyIndex();
	arr[ind] = num;
	int i = ind;
	while(arr[i] < arr[i - 1]){
	    arr[i - 1] = arr[i];
	    arr[i] = arr[i - 1];
	    i--;
	}
    }
    

    public void resize(){
	if(arr[0] == arr.length - 1){
	    arr = Arrays.copyOf(arr, arr[0] * 2);
	}
    }

    public boolean compare(int i, int j){
	if(isMax){
	    return arr[i] > arr[j];
	}
	else{
	    return arr[i] < arr[j];
	}
    }
    
    public void swap(int ind){
	int parent = getParent(ind);
	int t = arr[ind];
	arr[ind] = arr[parent];
	arr[parent] = t;
    }

    public void getLeft(int ind){
	return ind * 2;
    }

    public void getRight(int ind){
	return ind * 2 + 1;
    }

    public void getParent(int node){
	return node / 2;
    }
    
    public int peek(){
	return arr[1];
    }
    
    /*
    private int emptyIndex(){
	int i = 1;
	while(arr[i] != null){
	    i++;
	}
	return i;
    }
    */
	
    public static void main(String[] args){
    }
}

	    
