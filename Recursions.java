public class Recursions{

    public String name(){
	return "Li,Vivian";
    }

    public static int fact(int n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}

	n = n * (n - 1);
	if(n > 1){
	    fact(n - 1);
	}
	return n;
    }

    public static int fib(int n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}

	if(n == 0){
	    return 0;
	}

	if(n == 1){
	    return 1;
	}

        return fibTail(n, );
    }

    public static int fibTail(int x, int y){
	y = 1;
	return fibTail(x - 1, y - 1);
    }

    public static void main(String[] args){
	System.out.println(fact(3));
	System.out.println(fib(6));
    }
}
