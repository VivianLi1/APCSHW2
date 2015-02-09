public class Recursions implements hw1{

    public String name(){
	return "Li,Vivian";
    }

    public int fact(int n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}
	if(n == 1 || n == 0){
	    return 1;
	}
	return n * fact(n - 1);
    }

    public int fib(int n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}
	if(n == 0){
	    return 0;
	}
	if(n == 1){
	    return 1;
	}
	return fib(n - 1) + fib(n - 2);	
    }

    public double sqrt(double n){
        if(n < 0){
	    throw new IllegalArgumentException();
	}
	return tailSqrt(n, n/2);
    }

    public double tailSqrt(double n, double guess){
	if((Math.pow(((n / guess + guess) / 2), 2)) / n > 1.0000000001){
	    return tailSqrt(n, (n / guess + guess) / 2);
	}
        return guess;	
    }

    /*
    public static void main(String[] args){
	Recursions goat = new Recursions();
	System.out.println(goat.fib(10));
	System.out.println(goat.sqrt(25.0));
	System.out.println(goat.sqrt(0.0));
	//System.out.println(goat.fib(10));

    }
    */   
}

