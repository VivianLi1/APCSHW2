import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[]args){
	int size = Integer.parseInt(args[0]);
	NQueens test = new NQueens(size);
	test.solve();
	System.out.println(test);
    }
}
