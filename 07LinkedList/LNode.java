public class LNode{

    private LNode next;
    private int value;

    public LNode(int v){
	next = null;
	value = v;
    }

    public LNode(int v, LNode n);
	next = n;
	value = v;
    }
    
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
