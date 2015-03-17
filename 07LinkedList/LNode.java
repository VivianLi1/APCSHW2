public class LNode<T>{

    private LNode<T> next;
    private T value;

    public LNode(T v){
	setValue(v);
	setNext(null);
    }

    public LNode(T v, LNode<T> next){
	setValue(v);
	setNext(next);
    }

    public LNode(){
	setValue(null);
	setNext(null);
    }
    
    public void setNext(LNode<T> n){
	next = n;
    }

    public LNode<T> getNext(){
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
