import java.util.*;
import java.io.*;

public class NQueens{

    private char[][] board;

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
	board = new char[size][size];
	for(int i = 0; i < size; i++){
	    for(int j = 0; j < size; j++){
		board[i][j] = '*';
	    }
	}
    }

    public String toString(){
	String ans = "\n";

	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		ans += " " + board[i][j];
	    }
	    ans += "\n";
	}
	return hide + clear + go(0,0) + ans + "\n" + show;
    }

    public String name(){
	return "li.vivian";
    }

    public boolean isOkay(int row, int col){
	int i, j;
	
	for(i = 0; i < col; i++){
	    if(board[row][i] == 'Q'){
		return false;
	    }
	}

	for(i = row, j = col; i >= 0 && j >= 0; i--, j--){
	    if(board[i][j] == 'Q'){
		return false;
	    }
	}

	for(i = row, j = col; i < board.length && j >= 0; i++, j++){
	    if(board[i][j] == 'Q'){
		return false;
	    }
	}
	return true;
    }
    
    public boolean solve(){
	return solve(0,0);
    }
  
    public boolean solve(int x){
	return solve(x,0);
    }

    public boolean solve(int x, int y){
	if(y >= board.length){
	    return true;
	}

	for(int i = 0; i < board.length; i++){
	    if(isOkay(i,y)){
		board[i][y] = 'Q';
		if(solve(x, y+1)){
		    return true;
		}
		board[i][y] = '*';
	    }
	}
	return false;
    }
}
		
