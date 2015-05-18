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
	return arr.toString();
    }

    public int remove(){
	return 0;
    }

    public void add(int num){
	resize();
	arr[0] = arr[0] + 1;
	arr[arr[0]] = num;
        if(isMax){
	    pushUp();
	}else{
	    pushDown();
	}
    }

    public void pushUp(){
	int lastInd = arr[0];
	int last = arr[lastInd];
	int parentLast = arr[getParentInd(lastInd)];
        while(parentLast > last){
	    swap(lastInd);
	    lastInd = getParentInd(lastInd);
	    last = arr[lastInd];
	    parentLast = arr[getParentInd(lastInd)];
	}
    }

    public void pushDown(){
    }

    public void resize(){
	if(arr[0] >= arr.length - 1){
	    arr = Arrays.copyOf(arr, arr[0] * 2);
	}
    }
    /*
      public boolean compare(int i, int j){
      if(isMax){
      return arr[i] > arr[j];
      }
      else{
      return arr[i] < arr[j];
      }
      }
    */
    public void swap(int ind){
	int parent = getParentInd(ind);
	int t = arr[ind];
	arr[ind] = arr[parent];
	arr[parent] = t;
    }

    public int getLeftInd(int ind){
	return ind * 2;
    }

    public int getRightInd(int ind){
	return ind * 2 + 1;
    }

    public int getParentInd(int ind){
	return ind / 2;
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
	MyHeap testMax = new MyHeap();
	MyHeap testMin = new MyHeap(false);

	testMax.add(10);
	System.out.println(testMax);
    }
}

	    
