import java.util.*;
import java.io.*;

public class Frontier{

    MyDeque<Coordinate> deq;
    int mode;
    //1 = DFS
    //2 = BFS
    //3 = Best
    //4 = A*
    int endx, endy;
    
    public Frontier(int m){
	deq = new MyDeque<Coordinate>();
	mode = m;
    }

    public Frontier(int m, int xx, int yy){
	this(m);
	endx = xx;
	endy = yy;
    }

    public void add(Coordinate c){
	int cx = c.getX();
	int cy = c.getY();
	
	if(mode == 1){
	    deq.addFirst(c);
	}
	if(mode == 2){
	    deq.addLast(c);
	}
	if(mode == 3){
	    deq.add(c, Math.abs(endx - cx) + Math.abs(endy - cy));
	}
	/*
	if(mode = 4){
	    deq.add(c, Math.abs(endx - cx) + Math.abs(endy - cy));
	}
	*/
    }

    public Coordinate remove(){
	if(mode == 1 || mode == 2){
	    return deq.removeLast();
	} else {
	    return deq.removeSmallest();
	}
    }

    public boolean hasNext(){
	return deq.size() == 0;
    }
}
