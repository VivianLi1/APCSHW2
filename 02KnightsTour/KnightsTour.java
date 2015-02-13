import java.util.*;
import java.io.*;


public class KnightsTour{
    //constants for the class
    //terminal specific character to clear screen , or hide/show cursor
    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";

    //instance variable
    private int[][]board;

    public String name(){
	return "li.vivian";
    }

    //terminal specific character to move the cursor
    private String go(int x,int y){
	return ("\033[" + x + ";" + y + "H");
    }
 
    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }


    public String toString(){
	String ans = "\n";
	//build your knights tour here...
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		if(board[i][j] < 10){
		    ans += "  " + board[i][j];
		}
		else{
		    ans += " " + board[i][j];
		}
	    }
	    ans += "\n";
	}
	return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public KnightsTour(int size){
	board = new int[size][size];
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		board[i][j] = 0;
	    }
	}
    }   

    public boolean solve(){
	return solve(0,0);			
    }


    public boolean solve(int startx, int starty){
	return solve(startx, starty, 0);
    }

    //c = currentMoveNumber		
    public boolean solve(int x,int y,int c){
	//System.out.println(this);
	//wait(20);

	if(x < 0 || y < 0 || x >= board.length || y >= board[0].length){
	    return false;
	}

	if(c == board.length * board[0].length + 1){
	    return true;
	}

	if(board[x][y] == 0){
	    board[x][y] = c;

	    if(solve(x+1, y+2, c+1) || solve(x+1, y-2, c+1) ||
	       solve(x+2, y+1, c+1) || solve(x+2, y-1, c+1) ||
	       solve(x-1, y+2, c+1) || solve(x-1, y-2, c+1) ||
	       solve(x-2, y+1, c+1) || solve(x-2, y-1, c+1)){
		return true;
	    }
	    board[x][y] = 0;
	}
	return false;
    }


}
