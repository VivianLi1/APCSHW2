import java.util.*;

public class MyStack<T>{

    private LinkedList<T> current = new LinkedList<T>();

    public boolean empty(){
	return current.size() == 0;
    }

    public T peek(){
	if(empty()){
	    throw new EmptyStackException();
	}else{
	    return current.getFirst();
	}
    }

    public T pop(){
	if(empty()){
	    throw new EmptyStackException();
	}else{
	    T temp = current.getFirst();
	    current.remove();
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
