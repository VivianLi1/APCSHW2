public class TreeNode<E>{

    private TreeNode<E> left, right;
    private E data;

    public TreeNode(E d){
	this(d, null, null);
    }

    public TreeNode(E d, TreeNode<E> l, TreeNode<E> r){
	setData(d);
	setLeft(l);
	setRight(r);
    }

    public void setData(E d){
	data = d;
    }

    public void setRight(TreeNode<E> r){
	right = r;
    }

    public void setLeft(TreeNode<E> l){
	left = l;
    }

    public TreeNode<E> getRight(){
	return right;
    }

    public TreeNode<E> getLeft(){
	return left;
    }
    /*
    public boolean hasRight(){
return 
    */
    public E getData(){
	return (E)data;
    }
	
}
