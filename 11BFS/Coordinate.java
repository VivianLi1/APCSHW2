public class Coordinate{

    private int x, y;
    private Coordinate last;

    public Coordinate(int x, int y){
	setX(x);
	setY(y);
    }

    public void setX(int xx){
	x = xx;
    }

    public void setY(int yy){
	y = yy;
    }

    public int getX(){
	return x;
    }

    public int getY(){
	return y;
    }

    public void setLast(Coordinate last_){
	last = last_;
    }

    public Coordinate getLast(){
	return last;
    }
	
}
