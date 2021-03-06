// Most of this isn't mine.
// MyDeque is a buggy mess so using another deque as placeholder for now.


import java.util.*;

class DEQ<T> implements Iterable<T> {
    
    private class Node<T> {
	public Node<T> left, right;
	private final T item;

	public Node(T item) {
	    if (item == null) { throw new NullPointerException(); }
	    this.item = item;
	}

	public void connectRight(Node<T> other) {
	    this.right = other;
	    other.left = this;
	}
    }

    private class DEQIterator implements Iterator<T> {

	private Node<T> curr = head;

	public boolean hasNext() {
	    return curr != null;
	}
	public void remove() {
	    throw new UnsupportedOperationException();
	}
	public T next() {
	    if (!hasNext()) { throw new NoSuchElementException(); }
	    T item = curr.item;
	    curr = curr.right;
	    return item;
	}
    }

    private Node<T> head, tail;
    private int size;
    private int[] priorCount = new int[15];

    public Iterator<T> iterator() {
	return new DEQIterator();
    }


    public DEQ() {
    }

    public int size() {
	return size;
    }

    public boolean isEmpty() {
	return size() == 0;
    }

    public void checkInvariants() {
	assert size >= 0;
	assert size > 0 || (head == null && tail == null);
	assert (head == null && tail == null) || (head != null && tail != null);
    }


    public void addFirst(T item) {
	Node<T> prevHead = head;
	Node<T> newHead = new Node<T>(item);
	if (prevHead != null) {
	    newHead.connectRight(prevHead);
	} else {
	    tail = newHead;
	}
	head = newHead;
	size++;
	checkInvariants();
    }

    public void addLast(T item) {
	Node<T> newTail = new Node<T>(item);
	Node<T> prevTail = tail;
	if (prevTail != null) {
	    prevTail.connectRight(newTail);
	} else {
	    head = newTail;
	}
	tail = newTail;
	size++;
	checkInvariants();
    }

    public T removeFirst() {
	if (isEmpty()) {
	    throw new java.util.NoSuchElementException();
	}
	size--;
	Node<T> prevHead = head;
	head = prevHead.right;
	prevHead.right = null;
	if (head != null) {
	    head.left = null;
	}
	checkInvariants();
	return prevHead.item;
    }

    public T removeLast() {
	if (isEmpty()) {
	    throw new java.util.NoSuchElementException();
	}
	size--;
	Node<T> prevTail = tail;
	tail = prevTail.left;
	prevTail.left = null;
	if (tail != null) tail.right = null;
	checkInvariants();
	return prevTail.item;
    }

    
    //new methods for priority queue
    public void add(T item, int priority){
	addLast(item);
        tail++;
	priorBox[tail] = priority;	
	size++;
    }

    public T removeSmallest(){
	if(isEmpty()){
	    throw new NoSuchElementException();
	}
	Node<T> mark = head;
	int i=0;
	while(i != size){
	    if(mark.compareTo(right) > 0){
	        mark = right;
	    }
	    head = head.right;
	}	
   }
}
