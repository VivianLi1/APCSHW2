import java.util.*;
import java.io.*;

public class QuickSelect{
    
    public static int quickSelect(int[] ary, int si, int ei, int index){
	int[] d = new int[ary.length];
	Random rand = new Random();
	
	int start = si;
	int end = ei;
	int pivot = ary[rand.nextInt(ei - si + 1) + si];
	
	for(int i = si; i <= ei; i++){
	    if(ary[i] < pivot){
		d[start] = ary[i];
		start++;
	    }else if(ary[i] > pivot){
		d[end] = ary[i];
		end++;
	    }
	}
	int keep;
	d[start] = pivot;
	if(start == index){
	    keep = d[start];
	} else{
	    System.arraycopy(d, 0, ary, 0, d.length);
	    if(index < start){
		keep = quickSelect(ary, si, start - 1, index);
	    }
	    else{
		keep = quickSelect(ary, start + 1, ei, index);
	    }
	    
	}
	return keep;
    }

    public static void quicksort(int[] arr){
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
	System.out.println(quickSelect(a, 0, 10, 2));
    }
}
