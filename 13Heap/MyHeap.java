import java.util.*;

public class MyHeap{

    private int[] arr;

    public String name(){
	return "li.vivian";
    }
    
    public MyHeap(){
	//default creates MaxHeap
	arr = new int[2];
	arr[0] = 0;
    }

    public MyHeap(boolean isMax){
	super();
	if(!isMax){
	    
	}
    }

    public String toString(){
	return "";
    }

    public int remove(){
	return 0;
    }

    /*
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
    */
    
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

	    
