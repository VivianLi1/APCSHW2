public class Maze{

    public char[][] solveMaze(char[][] maze){
	int x = 0;
	int y = 0;

	for(int i = 0; i < maze.length; i++){
	    for(int j = 0; j < maze[0].length; j++){
		if(maze[i][j] == 's'){
		    x = i;
		    y = j;
		}
	    }
	}

	return mazeHelp(maze, x, y);
    }

    public char[][] mazeHelp(char[][] maze, int x, int y){
    }
}
