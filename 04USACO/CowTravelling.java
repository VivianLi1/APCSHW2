public class CowTravelling{

    private char[][] field;
    private int counter = 0;
    private int r1, c1;
    
    public CowTravelling(int a, int b){
	File file = new File("cowTravel");
	Scanner scan = new Scanner(file);

	while(scan.hasNextLine()){
	    String str = scan.nextLine();

	    if(line == 0){
	field = new char[a][b];
    }

    public void cowSet(int r2, int c2){
	field[r2][c2] = 'E';
    }

    public void cowGo(int r, int c){
	field[r1][c1] = field[r][c];
    }
    
    public int distTravelled(int t){
	int timer = 0;
	
	for(int i = 0; i < t, i++){

	    if(field[r1][c1] = 'E'){
		counter++;
		
	    }
	    
	    cowGo(r1 + 1, c1);
	    cowGo(r1, c1 + 1);
	}
    }
}
    
