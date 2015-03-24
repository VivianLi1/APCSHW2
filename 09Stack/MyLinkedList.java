import java.util.*;
import java.io.*;

public class MyLinkedList<T> implements Iterable<T>{

    private LNode<T> current, head, tail, n;
    private int size = 0;

    public String name(){
	return "li.vivian";
    }

    public MyLinkedList(){
	head = null;
	tail = head;
    }
    
    public String toString(){
	LNode temp;
	String s = "[ ";
	//current = head;
	temp = head;
	while(temp != null){
	    s += temp.getValue() + ", ";
	    temp = temp.getNext();
	}
	return s.substring(0, s.length() - 1) + " ]";
    }

    public int size(){
	return size;
    }
    
    public void add(T value){
	if(size == 0){
	    head = new LNode<T>(value);
	    tail = head;
	    current = head;
	}else{
	    LNode<T> temp = new LNode<T>(value);
	    tail.setNext(temp);
	    tail = tail.getNext();
	}
	size++;
    }

    public void add(int index, T value){
	T temp;
	current = head;
	if(outOfBounds(index)){
	    throw new IndexOutOfBoundsException();
	}else{
	    while(index > 0){
		index--;
		current = current.getNext();
	    }
	    temp = current.getValue();
	    current.setValue(value);
	    current.setNext(new LNode<T>(temp, current.getNext()));
	    size++;
	}
    }

    public T remove(int index){
	T keep = null;
	current = head;
	if(outOfBounds(index)){
	    throw new IndexOutOfBoundsException();
	}
	if(index == 0){
	    keep = head.getValue();
	    head = head.getNext();
	}else{
	    while(index > 1){
		index--;
		current = current.getNext();
	    }
	    if(index == size - 1){
		tail = current;
	    }
	    keep = current.getNext().getValue();
	    current.setNext(current.getNext().getNext());
	    size--;
	} 
	return keep;  
    }

    public int indexOf(T value){
	int index = 0;
	while(current.getNext() != null){
	    if(current.getValue() == value){
		return index;
	    }
	    current = current.getNext();
	    index++;
	}
	return index;
    }

    public T get(int index){
	current = head;
	if(outOfBounds(index)){
	    throw new IndexOutOfBoundsException();
	}else{
	    while(index > 0){
		index--;
		current = current.getNext();
	    }
	    return current.getValue();
	}
    }

    public T set(int index, T value){
	T keep = null;
	current = head;
	if(!(outOfBounds(index))){
	    while(index > 0){
		index--;
		current = current.getNext();
	    }
	    keep = current.getValue();
	    if(index == size - 1){
		tail.setValue(value);
	    }
	    current.setValue(value);
	}
	return keep;
    }

    private boolean outOfBounds(int index){
	return (index < 0 || index >= size());
    }

    public class MLLIterator<T> implements Iterator<T>{
	private LNode<T> current;
	
	public MLLIterator(LNode<T> n){
	    current = n;
	}
	
	public T next(){
	    current = current.getNext();
	    if(current.getValue() == null){
		throw new NoSuchElementException();
	    }
	    return current.getValue();
	}

	public boolean hasNext(){
	    boolean b = false;
	    if(current.getNext() != null){
		b = true;
	    }
	    return b;
	}

	public void remove(){
	    throw new UnsupportedOperationException();
	}
    }

    public Iterator<T> iterator(){
	return new MLLIterator<T>(n);
    }
    
    /*
    public static void main(String[] args){
	MyLinkedList test = new MyLinkedList();
	for(int i = 0; i < 10; i++){
	    test.add(i);
	    }
	    System.out.println(test.toString());
	    System.out.println(test.size());
	    }
    */
    
}


    
