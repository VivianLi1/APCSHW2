public class MyLinkedList{

    LNode current;
    LNode head;
    
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

    public int getSize(){
	int counter = 0;
	while(current != null){
	    counter++;
	}
	return counter;
    }
    
    public void add(int value){
	if(current == null){
	    head.setValue(value);
	}
    }
    
    public static void main(String[] args){
	MyLinkedList test = new MyLinkedList();
	test.add(10);
	System.out.println(test.toString());
	System.out.println(test.getSize());
    }
}

    
