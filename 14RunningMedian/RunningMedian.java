import java.util.*;

public class RunningMedian{

    MyHeap maxHeap = new MyHeap();
    MyHeap minHeap = new MyHeap(false);

    private double  median;

    public String name(){
	return "vivian.li";
    }
	    
    public RunningMedian(){
	median = 0;
    }

    public void add(int value){
	if(maxHeap.size() == 0 && minHeap.size() == 0){ 
	    maxHeap.add(value);
	}
	findHeap(value).add(value);
    }

    private MyHeap findHeap(int value){
	if(value > median){
	    return minHeap;
	}else{
	    return maxHeap;
	}
    }

    private void findNewMedian(){
	median = maxHeap.peek() + minHeap.peek() / 2;	    
    }

    private double getMedian(){
	return median;
    }

    public void add(int value){
	if(value > median){
	    minHeap.add(value);
	}else{
	    maxHeap.add(value);
	}
	findNewMedian();
    }

    public static void main(String[] args){
    }
    
}
