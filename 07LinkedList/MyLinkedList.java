public class MyLinkedList{

    LNode current;
    LNode head;
    int size = 0;

    public MyLinkedList(){
	head = new LNode(null);
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
	/*
	int counter = 0;
	while(current != null){
	    counter++;
	}
	return counter;
	*/
	return size;
    }
    
    public void add(int value){
	LNode temp = new LNode(value);
	current = head;
	while(current.getNext() != null){
	    current = current.getNext();
	}
	current.setNext(temp);
	size++;
    }

    public void add(int value, int index){
    }

    public void remove(int index){
    }

    
    public static void main(String[] args){
	MyLinkedList test = new MyLinkedList();
	for(int i = 0; i < 10; i++){
	    test.add(i);
	}
	System.out.println(test.toString());
	System.out.println(test.size());
    }
}

    
