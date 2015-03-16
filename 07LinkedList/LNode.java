public class LNode<T>{

    private LNode next;
    private T value;

    public LNode(T v){
	setValue(v);
    }
    
    public void setNext(LNode<T> n){
	next = n;
    }

    public LNode getNext(){
	return next;
    }

    public void setValue(T v){
	value = v;
    }

    public T getValue(){
	return value;
    }

    public String toString(){
	String s = value + " ";
	return s;
    }
}
