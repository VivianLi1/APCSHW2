public class Coordinate{

    private int r, c;
    private Coordinate last;

    public Coordinate(int r, int c){
	setr(r);
	setc(c);
    }

    public void setr(int rr){
	r = rr;
    }

    public void setc(int cc){
	c = cc;
    }

    public int getr(){
	return r;
    }

    public int getc(){
	return c;
    }

    public void setLast(Coordinate last_){
	last = last_;
    }

    public Coordinate getLast(){
	return last;
    }
	
}
