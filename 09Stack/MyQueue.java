import java.util.*;

public class MyQueue<T>{

    MyLinkedList<T> current;

    public T dequeue(){
	if(current == null){
	    throw new NoSuchElementException();
	}
	T keep = current.get(0);
	current.remove(0);
	return keep;
    }

    public boolean enqueue(T o){
	current.add(o);
	return true;
    }
}
