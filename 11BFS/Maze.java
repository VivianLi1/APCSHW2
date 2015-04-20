import java.util.*;
import java.io.*;

public class Maze{
    private char[][]maze;
    private int maxx,maxy;
    private int startx,starty;
    //Terminal keycodes to clear the terminal, or hide/show the cursor
    private String clear =  "\033[2J";
    private String hide =  "\033[?25l";
    private String show =  "\033[?25h";

    public int[] solutionCoordinates;

    public Maze(String filename){
	startx = -1;
	starty = -1;
	//read the whole maze into a single string first
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));

	    //keep reading next line
	    while(in.hasNext()){
		String line = in.nextLine();
		if(maxy == 0){
		    //calculate width of the maze
		    maxx = line.length();
		}
		//every new line add 1 to the height of the maze
		maxy++;
		ans += line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: " + filename + " could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}

	//copy from the single string to a 2D array
	maze = new char[maxx][maxy];
	for(int i = 0; i < ans.length(); i++){
	    char c = ans.charAt(i);
	    maze[i % maxx][i / maxx] = c;
	    if(c == 'S'){
		startx = i % maxx;
		starty = i / maxx;
	    }
	}
    }

    //terminal specific character to move the cursor
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }
    

    private String color(int foreground,int background){
	return ("\033[0;" + foreground + ";" + background + "m");
    }

    public void clearTerminal(){
	System.out.println(clear);
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    public String toString(){
	return toString(false);
    }
    
    public String toString(boolean animate){
	String ans = "Solving a maze that is " + maxx + " by " + maxy + "\n";
	for(int i = 0; i < maxx * maxy; i++){
	    if(i % maxx == 0 && i != 0){
		ans += "\n";
	    }
	    char c =  maze[i % maxx][i / maxx];
	    if(c == '#'){
		ans += color(38,47)+c;
	    }else{
		ans += color(32,40)+c;
	    }
	}
	if(animate){
	    return hide + go(0,0) + ans + "\n" + show + color(37,40);
	}else{
	    return ans;
	}
    }
    
    public boolean solve(){
	if(startx < 0){
	    System.out.println("No starting point 'S' found in maze.");
	    return false;
	}else{
	    maze[startx][starty] = ' ';
	    return solve(startx,starty);
	}
    }

    public boolean solve(int x,int y){
	System.out.println(this);
	wait(20);
	if(maze[x][y] == 'E'){
	    return true;
	}
	if(maze[x][y] == ' '){
	    //mark the floor with @
	    maze[x][y] = '@';
	    //recursion ho!!
	    if( solve(x + 1, y) || solve( x, y + 1) ||
		solve(x - 1, y) || solve(x, y - 1)){
		return true;
	    }
	    //replace the @ with a .
	    maze[x][y] = '.';
	}
	return false;//by default the maze didn't get solved
    }

    public boolean solveBFS(boolean animate){
	return solve(animate, 2);
    }

    public boolean solveDFS(boolean animate){
	return solve(animate, 1);
    }

    public boolean solveBest(boolean animate){
	return solve(animate, 3);
    }

    public boolean solveAStar(boolean animate){
	return solve(animate, 4);
    }
	    
    public boolean solve(boolean animate, int mode){

	Frontier rest = new Frontier(mode);
	Coordinate start = new Coordinate(startx, starty);

	rest.add(start);

	boolean solved = false;
	while(!solved && rest.hasNext()){
	    if(animate && !solved){
		System.out.println(toString(true));
	    }
	    
	    Coordinate next = rest.remove();
	    if(maze[next.getX()][next.getY()] == 'E'){
		solved = true;
		//addCoordinatesToSolutionArray(next);

		maze[next.getX()][next.getY()] = 'x';
		for(Coordinate p : getNeighbors(next)){
		    rest.add(p);
		}
	    }
	}
	return solved;
    }
	    
    
    public boolean solveBFS(){
	return solveBFS(false);	
    }

    public boolean solveDFS(){
	return solveDFS(false);
    }

    public boolean solveBest(){
	return solveBest(false);
    }

    public boolean solveAStar(){
	return solveAStar(false);
    }

    public void addCoordinatesToSolutionArray(Coordinate n){
	while(n != null){
	}
    }
   
    public boolean isOutOfBounds(int x, int y){
	return (x < 0 || y < 0 || x >= maxx || y >= maxy);
    }

    public boolean isBadSpace(int x, int y){
	return (maze[x][y] == '#' || maze[x][y] == '*');
    }

    public ArrayList<Coordinate> getNeighbors(Coordinate n){
	int x = n.getX();
	int y = n.getY();
	ArrayList<Coordinate> neighbors = new ArrayList<Coordinate>();
	ArrayList<Coordinate> possibilities = new ArrayList<Coordinate>();
	Coordinate poss1 = new Coordinate(x + 1, y);
	Coordinate poss2 = new Coordinate(x - 1, y);
	Coordinate poss3 = new Coordinate(x, y + 1);
	Coordinate poss4 = new Coordinate(x, y - 1);
	possibilities.add(poss1);
	possibilities.add(poss2);
	possibilities.add(poss3);
	possibilities.add(poss4);

	for(Coordinate p: possibilities){
	    if(p.getX() >= 0 && p.getX() < maxx && p.getY() >= 0 && p.getY() < maxy){
		if(maze[p.getX()][p.getY()] == ' ' || maze[p.getX()][p.getY()] == 'E'){
		    neighbors.add(p);
		}
	    }
	}
	return neighbors;
    }    
}

