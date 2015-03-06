import java.util.*;
import java.io.*;

public class Sorts{
    
    public static void mergesort(int[] arr){
        if(arr.length < 1){
	    throw new IndexOutOfBoundsException("Invalid Array Size");
	}

	int length1 = arr.length/2;
	int length2 = length1;

	if(arr.length % 2 == 1){
	    length2 += 1;
	}

	int[] arr1 = new int[length1];
	int[] arr2 = new int[length2];
	
	for(int i = 0; i < length1; i++){
	    arr1[i] = arr[i];
	}

	for(int i = length1; i < length1 + length2; i++){
	    arr2[i - length1] = arr[i];
	}

	if(arr1.length > 1)
	    mergesort(arr1);
	if(arr2.length > 1)
	    mergesort(arr2);

	int i = 0, j = 0, k = 0;
	while(arr1.length != j && arr2.length != k){
	    if(arr1[j] < arr2[k]){
		arr[i] = arr1[j];
		i++;
		j++;
	    } else{
		arr[i] = arr2[k];
		i++;
		k++;
	    }
	}

	while(arr1.length != j){
	    arr[i] = arr1[j];
	    i++;
	    j++;
	}
	while(arr2.length != k){
	    arr[i] = arr2[k];
	    i++;
	    k++;
	}
    }

    public static void main(String[] args){
	Random rand = new Random();
	int[] arr = new int[4000000];
	for(int i = 0; i < 4000000; i++){
	    arr[i] = rand.nextInt(20000);
	}
	//System.out.println(Arrays.toString(arr));
	//mergesort(arr);
	Arrays.sort(arr);
	//System.out.println(Arrays.toString(arr));
	
    }
    

}

