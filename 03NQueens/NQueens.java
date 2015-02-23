import java.util.*;
import java.io.*;

public class NQueens{

    private int[][] board;

    final static String clear =  "\033[2J";
    final static String hide =  "\033[?25l";
    final static String show =  "\033[?25h";

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


    public NQueens(int size){
	board = new int[size][size];
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		board[i][j] = 0;
	    }
	}
    }

    public String toString(){
	String ans = "\n";

	return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public String name(){
	return "li.vivian";
    }
  
    public boolean solve(int x){
	return true;
    }

}
