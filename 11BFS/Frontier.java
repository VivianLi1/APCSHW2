public class Frontier{

    DEQ<Coordinate> deq;
    int mode;
    //1 = DFS
    //2 = BFS

    public Frontier(int m){
	deq = new DEQ<Coordinate>();
	mode = m;
    }

    public void add(Coordinate c){
	if(m == 1){
	    deq.addFirst(c);
	}else{
	    deq.addLast(c);
    }

    public Coordinate removeFirst(){
	deq.removeFirst();
    }

    public Coordinate removeLast(){
	deq.removeLast();
    }
}
