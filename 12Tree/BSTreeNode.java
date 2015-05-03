import java.io.*;
import java.util.*;

public class BSTreeNode<T extends Comparable<? super T>> {

    private T data;
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;
    //private int tally;

    public BSTreeNode( T d ) {
 
	data = d;
	left = right = null;
	//tally = 0;
    }
    
    //accessors
    public T getData() {
	return data;
    }
    public BSTreeNode<T> getLeft() {
	return left;
    }
    public BSTreeNode<T> getRight() {
	return right;
    }

    //mutators
    public void setData( T d ) {
	data = d;
    }
    public void setLeft( BSTreeNode<T> l ) {
	left = l;
    }
    public void setRight( BSTreeNode<T> r ) {
	right = r;
    }
    /*
    public void setTally(int t){
	tally = t;
    }
    */

    public String toString(){
	return data.toString();
    }
}
