public class MyLinkedList{

    LNode current;
    LNode head;
    LNode tail;
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
	return size;
    }
    
    public void add(int value){
	add(size() - 1, value);
	size++;
    }

    public void add(int value, int index){
	LNode temp = new LNode;
	current = head;
	if(!(outOfBounds(index))){
	    while(index > 0){
		index--;
		current = current.getNext();
	    }
	    temp.setValue(value);
	    temp.setNext(current.getNext());
	    current.setNext(temp);
	    size++;
	}
    }

    public void remove(int index){
	current = head;
	if(!(outOfBounds(index))){
	    while(index > 1){
		index--;
		current = current.getNext();
	    }
	    //int temp = current.getNext().getValue();
	    current.setNext(current.getNext().getNext());
	    size--;
	}   
    }

    public int get(int index){
	current = head;
	if(!(outOfBounds(index))){
	    while(index > 0){
		index--;
		current = current.getNext();
	    }
	    return current.getValue();
	}
    }

    public void set(int index, int value){
	current = head;
	if(!(outofBounds(index))){
	    while(index > 0){
		index--;
		current = current.getNext();
	    }
	    current.setValue(value);
	}
    }

    private boolean outOfBounds(int index){
	return (index < 0 || index > size());
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

    
