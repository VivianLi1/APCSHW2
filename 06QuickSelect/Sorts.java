import java.util.*;
import java.io.*;

public class Sorts{

    Random rand = new Random();
    
    public static int partition(int[] ary, int si, int ei){
	int[] d = new int[ary.length];
	
	int start = si;
	int end = ei;
	int pivot = ary[rand.nextInt(ei - si + 1) + si];
	int keep;
	
	for(int i = si; i <= ei; i++){
	    if(ary[i] < pivot){
		d[start] = ary[i];
		start++;
	    }else if(ary[i] > pivot){
		d[end] = ary[i];
		end--;
	    }
	    keep = d[start];
	    d[start] = d[end];
	    d[end] = keep;
	    start++;
	    end--;
	}
	return keep;
    }

    public static void quicksort(int[] arr){
	int start = 0;
	int end = a.length - 1;
	int keep = partition(arr, start, end);
	if(start < keep - 1){
	    quicksort(arr, start, keep - 1);
	}
	if(keep < end){
	    quicksort(arr, keep, end);
	}
    }
	

    public static void main(String[] args){
	int size = Integer.parseInt(args[0]);
	int range = Integer.parseInt(args[1]);

	Random rand = new Random();
	int[] a = new int[size];
	
	for(int i = 0; i < a.length; i++){
	    a[i] = rand.nextInt(range);
	}
	
	System.out.println(Arrays.toString(a));
	
    }
}
