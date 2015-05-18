import java.util.*;

public class MyHeap{

    private int[] arr;
    private boolean isMax;

    public String name(){
	return "li.vivian";
    }

    public MyHeap(boolean isMax2){
	arr = new int[10];
	arr[0] = 0;
	isMax = isMax2;
    }
    
    public MyHeap(){
	this(true);	
    }

    public String toString(){
	return Arrays.toString(arr);
    }

    public int remove(){
	return 0;
    }

    public void add(int num){
	resize();
	arr[0] = arr[0] + 1;
	arr[arr[0]] = num;
	if(arr[0] > 1){
	    if(isMax){
		pushUp();
	    }else{
		pushDown();
	    }
	}
    }

    public void pushUp(){
	int ind = arr[0];
        while(getParentInd(ind) > 1 && arr[ind] > getParent(ind)){
	    swap(ind, getParentInd(ind));
	    ind = getParentInd(ind);
	}
    }

    public void pushDown(){
	int ind = 1;
	while(getLeftInd(ind) <= arr[0]){
	    int small = getSmall(getLeft(ind), getRight(ind));
	    if(arr[ind] > small){
		swap(ind, small);
	    }
	    ind = small;
	}
    }

    private int getSmall(int one, int two){
	if(one < two){
	    return one;
	}else{
	    return two;
	}
    }
    
    public void resize(){
	if(arr[0] >= arr.length - 1){
	    arr = Arrays.copyOf(arr, arr.length * 2);
	}
    }
 
    public void swap(int ind, int ind2){
	int t = arr[ind];
	arr[ind] = arr[ind2];
	arr[ind2] = t;
    }

    public int getLeftInd(int ind){
	return ind * 2;
    }

    public int getLeft(int ind){
        int l = getLeftInd(ind);
	return arr[l];
    }

    public int getRightInd(int ind){
	return ind * 2 + 1;
    }

    public int getRight(int ind){
	int r = getRightInd(ind);
	return arr[r];
    }

    public int getParentInd(int ind){
	return ind / 2;
    }

    public int getParent(int ind){
	int i = getParentInd(ind);
	return arr[i];
    }
    
    public int peek(){
	return arr[1];
    }

    public int size(){
	return arr[0];
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
	testMax.add(99);
	//testMax.add(0);
	//testMax.add(11);
	System.out.println(testMax);
    }
}

	    
