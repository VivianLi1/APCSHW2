import java.util.*;

public class RunningMedian{

    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    private double  median;

    public RunningMedian(){
	median = 0;
    }

    public void add(int value){
	if(maxHeap.size() == 0 && minHeap.size() == 0){ 
	    maxHeap.add(value);
	}
	findHeap(value).add(value);
    }

    private PriorityQueue<Integer> findHeap(int value){
	if(value > median){
	    return minHeap;
	}else{
	    return maxHeap;
	}
    }

    private void findNewMedian(){
	int meanInd = (maxHeap.size() + minHeap.size() + 1) / 2;
    }

    private double getMedian(){
	return median;	
    }

    public static void main(String[] args){
    }
    
}
