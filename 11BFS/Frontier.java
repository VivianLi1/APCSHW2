public class Frontier{

    DEQ<Coordinate> deq;

    public Frontier(){
	deq = new DEQ<Coordinate>();
    }

    public void addFirst(Coordinate c){
	deq.addFirst(c);
    }

    public void addLast(Coordinate c){
	deq.addLast(c);
    }

    public Coordinate removeFirst(){
	deq.removeFirst();
    }

    public Coordinate removeLast(){
	deq.removeLast();
    }
}
