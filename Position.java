
public class Position {
	//Private variables
	private int x;
	private int y;

	//Constructor
	Position(){
		x = 0;
		y = 0;
	}

	//Get Methods
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	//Set Methods
	public int setX(int a){
		x = a;
		return x;
	}
	public int setY(int b){
		y = b;
		return y;
	}
}
