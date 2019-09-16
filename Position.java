
public class Position {
	//Private variables
	private int x;
	private int y;
	private int from_x; //The points we came from
	private int from_y;

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
	public int getFrom_X(){
		return from_x;
	}
	public int getFrom_Y(){
		return from_y;
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
	public int setFrom_X(int a){
		from_x = a;
		return from_x;
	}
	public int setFrom_Y(int b){
		from_y = b;
		return from_y;
	}
}
