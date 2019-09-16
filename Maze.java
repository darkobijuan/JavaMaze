import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;

public class Maze implements MazeADT {
	
	//Private Variables
	private int [][] maze_array;
	private int Rows, Columns;
	private static final int TRIED = 2;
	private static final int PATH = 3;


	//Constructor
	public Maze(String filename) throws FileNotFoundException {
		Scanner s = new Scanner(new File(filename));
		Rows = s.nextInt(); 
		Columns = s.nextInt();  
		maze_array = new int[Rows][Columns];
		for (int i = 0; i < Rows; i++){
			for (int j = 0; j < Columns; j++){
				maze_array[i][j] = s.nextInt();	
			}
		}
	}

	//Return the number of rows
	@Override
	public int getRows (){
		return maze_array.length;
	}

	//Return the number of columns
	@Override
	public int getColumns (){
		return maze_array[0].length;
	}

	//Marks the location of the elements tried in maze
	@Override
	public void tryPosition(int row, int col){
		maze_array[row][col] = TRIED;
	}

	//Marks the location of the elements in our maze path
	@Override
	public void markPath(int row, int col){
		maze_array[row][col] = PATH;
	}

	//Determines valid position: on grid, not blocked, not TRIED
	@Override
	public boolean validPosition(int row, int col){
		Boolean result = false;

		//Bounds Check
		if (row >= 0 && row < maze_array.length && col >= 0 && col < maze_array[row].length){
			if (maze_array[row][col] == 1){
				result = true;
			}
		} 
		return result;
	}

	@Override
	public String toString(){
		String result = "\n";
		for (int row = 0; row < maze_array.length; row++){
			for (int column = 0; column < maze_array[row].length; column++){
				result += maze_array[row][column] + "";	
			}
			result += "\n";
		}	
		return result;
	}	

}
