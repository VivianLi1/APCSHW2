import java.util.*;

public class MyStack<T>{

    private MyLinkedList<T> current = new MyLinkedList<T>();

    public boolean empty(){
	return current == null;
    }

    public T peek(){
	if(empty()){
	    throw new EmptyStackException();
	}else{
	    return current.get(0);
	}
    }

    public T pop(){
	if(empty()){
	    throw new EmptyStackException();
	}else{
	    T temp = current.get(0);
	    current.remove(0);
	    return temp;
	}
    }

    public T push(T o){
	current.add(0,o);
	return o;
    }
    /*
    public static void main(String[] args){
	MyStack<Integer> test = new MyStack<Integer>();
	test.push(1);
	System.out.println(test.peek());
    }
    */
}
