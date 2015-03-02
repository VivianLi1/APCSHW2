import java.util.*;
public class LakeMaking{

    public static void main(String[] args){
	Random r = new Random();
	Cows test = new Cows(5, 7);
	for(int i = 0; i < 35; i++){
	    test.set(i/7, i%7, r.nextInt(25));
	}
	System.out.println(test.toString());
	test.stamp(2, 2, 100);
	System.out.println(test.toString());
    }
}
