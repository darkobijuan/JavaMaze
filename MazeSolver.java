import java.util.*;
import java.io.*;


public class MazeSolver{
	
	private Maze maze;

	//Constructor
	public MazeSolver(Maze maze){
		this.maze = maze;
	}

	public boolean traverse(){
		boolean done = false; 
		int row, column;
		Position pos = new Position();
		Deque<Position> stack = new LinkedList<Position>();
		stack.push(pos);


		while (!(done) && !stack.isEmpty()){

			//Clears screen and steps through the maze
			clearScreen();
			System.out.println(maze);
			EnterToContinue();
			

			pos = stack.pop();
			maze.tryPosition(pos.getX(), pos.getY());

			//Finish if reaches endpoint (Bottom Right Corner)
			if (pos.getX() == maze.getRows()-1 && pos.getY() == maze.getColumns()-1){
				maze.markPath(pos.getX(), pos.getY());
				done = true;
			}
			else {
				push_new_pos(pos.getX() - 1, pos.getY(), stack);
				push_new_pos(pos.getX() + 1, pos.getY(), stack);
				push_new_pos(pos.getX(), pos.getY() - 1, stack);
				push_new_pos(pos.getX(), pos.getY() + 1, stack); 
			}
		}
		while (done && !stack.isEmpty()){
			pos = stack.pop();
		}
		return done;
	}

	//Push an attempted move on to the stack
	private void push_new_pos(int x, int y, Deque<Position> stack){
		Position npos = new Position();
		npos.setX(x);
		npos.setY(y);
		if (maze.validPosition(x, y)){
			stack.push(npos);

		}
	}

	//Press enter to continue
	private void EnterToContinue(){
		System.out.println("Press Enter to Continue..\n");
		try {
			System.in.read();
		}
		catch(Exception e){}
	}
	
	//Clears Screen
	private static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  

}
