import java.util.*;
import java.io.*;

public class MyDeque<T>{

    private Object[] arr;
    private int head, tail;
    private int size = 0;
    
    public void addFirst(T value){
	
    }

    public void addLast(T value){
    }

    /*
    public T removeFirst(){
    }

    public T removeLast(){
    }

    public T getFirst(){
    }

    public T getLast(){
    }
    */

    public void resize(){
	Object[] copy = Arrays.copyOf(arr, size * 2);
	arr = copy;
    }

}

    
