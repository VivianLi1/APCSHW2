import java.util.*;
import java.io.*;

public class Frontier{

    DEQ<Coordinate> deq;
    Iterator deqIt;
    int mode = 1;
    //1 = DFS
    //2 = BFS

    public Frontier(int m){
	deq = new DEQ<Coordinate>();
	deqIt = deq.iterator();
	mode = m;
    }

    public void add(Coordinate c){
	if(mode == 1){
	    deq.addFirst(c);
	}else{
	    deq.addLast(c);
	}
    }

	/*
    public Coordinate removeFirst(){
	deq.removeFirst();
    }
	*/

    public Coordinate remove(){
	return deq.removeLast();
    }

    public boolean hasNext(){
	return deqIt.hasNext();
    }
}
