public class Coordinate{

    private int r, c;

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
}
