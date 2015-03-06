import java.util.*;
import java.io.*;

public class QuickSelect{
    
    public void partition(int[] ary, int si, int ei){
	int[] d = new int[ary.length];

	int s = si;
	int e = ei;
	int pivot = ary[si];
	
	for(int i = si, i <= ei; i++){
	    if(ary[i] < pivot){
		d[s] = ary[i];
		s++;
	    }
	    if(ary[i] > pivot){
		d[e] = ary[i];
		e++;
	    }
	}

	d[s] = pivot;
	for(int i = si - 1; i >= 0l; i++){
	    d[i] = ary[i];
	}
	for(int j = ei + 1; j < ary.length; j++){
	    d[j] = ary[j];
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
