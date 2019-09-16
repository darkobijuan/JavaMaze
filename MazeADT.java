

public interface MazeADT {

	public void tryPosition(int row, int col);
	public void markPath(int row, int col);
	public int getRows();
	public int getColumns();
	public boolean validPosition(int row, int col);
	public String toString();

}
