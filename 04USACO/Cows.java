public class Cows{

    private int[][] field;

    public Cows(int a, int b){
	field = new int[a][b];
	for(int i = 0; i < a*b; i++){
	    field[i/field[0].length][i%field[0].length] = 0;
	}
    }

    public void set(int a, int b, int c){
	field[a][b] = c;
    }

    public String toString(){
	String s = "";
	for(int i = 0; i < field.length*field[0].length; i++){
	    if(i%field[0].length == 0){
		s+="\n";
	    }
	    if(10 > field[i/field[0].length][i%field[0].length])
		s+=" ";
	    s+=field[i/field[0].length][i%field[0].length]+" ";
	    
	}
	return s;
    }

    public void stamp(int x, int y, int depth){
	int tallx = 0;
	int tally = 0;
	for(int i = x; i < x + 3; i++){
	    for(int j = y; j < y + 3; j++){
		if(field[j][i] > field[tally][tallx]){
		    tallx = i;
		    tally = j;
		}
	    }
	}
	if(field[tally][tallx] - depth < 0){
	    field[tally][tallx] = 0;
	} else{
	field[tally][tallx] -= depth;
	}

	int findepth = field[tally][tallx];
	for(int i = x; i < x + 3; i++){
	    for(int j = y; j < y + 3; j++){
		if(field[j][i] > findepth){
		    if(findepth >= 0)
			field[j][i] = findepth;
		    else
			field[j][i] = 0;
		}
	    }
	}
    }
}
