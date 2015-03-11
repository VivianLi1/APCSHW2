public class LNode{

    private LNode next;
    private int value;

    public void setNext(LNode n){
	next = n;
    }

    public LNode getNext(){
	return next;
    }

    public void setValue(int v){
	value = v;
    }

    public int getValue(){
	return value;
    }

    public String toString(){
	String s = value + " ";
	return s;
    }
}
