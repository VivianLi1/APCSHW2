import java.io.*;
import java.util.*;

public class BTree<E>{

    public static final int PRE_ORDER = 0;
    public static final int IN_ORDER = 1;
    public static final int POST_ORDER = 2;

    private TreeNode<E> root;
    Random rand = new Random(123);

    public BTree(){
	root = new TreeNode<E>(null);
    }

    public void add(E data){
	TreeNode<E> added = new TreeNode<E>(data);
	add(root, added);
    }

    public void add(TreeNode<E> curr, TreeNode<E> bn){
	//int pos = rand.nextInt(2);
	if(curr.getLeft() == null && curr.getRight() == null){
	    if(rand.nextInt(2) == 0)
		curr.setLeft(bn);
	    else
		curr.setRight(bn);
	}
	else if(!(curr.getRight() == null) && curr.getLeft() == null){
	    curr.setLeft(bn);
	}
	else if(!(curr.getLeft() == null) && curr.getRight() == null){
	    curr.setRight(bn);
	}else{
	    if(rand.nextInt(2) == 0)
		add(curr.getLeft(), bn);
	    else
		add(curr.getRight(), bn);
	}
	    
    }

    public void traverse(int mode){
	if(mode == PRE_ORDER)
	    preOrder(root);
	else if(mode == IN_ORDER)
	    inOrder(root);
	else
	    postOrder(root);
	System.out.println();
    }

    public void preOrder(TreeNode<E> curr){
    }

    public void inOrder(TreeNode<E> curr){
    }

    public void postOrder(TreeNode<E> curr){
    }

    public int getHeight(){
	return getHeight(root);
    }
    
    public int getHeight(TreeNode<E> curr){
	return (curr.
    }

    private String getLevel(TreeNode<E> curr, int level, int currLevel){
	return "";
    }

    public String toString(){
	return "";
    }
    
    public static void main(String[] args){
	
    	BTree<Integer> t = new BTree<Integer>();

	for ( int i=0; i < 8; i++ ) 
	    t.add( i );
	System.out.println( "Pre-order: ");
	t.traverse( PRE_ORDER );
	System.out.println( "In-order: ");
	t.traverse( IN_ORDER );
	System.out.println( "Post-order: ");
	t.traverse( POST_ORDER );
	System.out.println( "Height: " + t.getHeight() );

	System.out.println( t );
    } 
}
