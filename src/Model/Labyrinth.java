package Model;

public interface Labyrinth {
	
	public int getRowCount();
	public int getColumnCount();
	public  boolean isFreeAt(int row,int column);
	public  boolean isWallAt(int row,int column);
	public  Cell getStartCell();
	public  Cell getFinishCell();
}
