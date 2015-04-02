public class Frontier{

    DEQ deq = new DEQ();

    public Frontier(){
    }

    public void add(Coordinate c){
	deq.addFirst(c);
    }

    public void remove(){
	deq.removeLast();
    }
    /*
    public Coordinate get(){
	return deq.getL
    }

    */
}
