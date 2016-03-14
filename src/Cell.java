
public class Cell {
	
	int row;
	int column;
	private boolean isFree;
	private boolean isWall;
	public Cell(int row, int column) {
		this.row = row;
		this.column = column;
		this.isFree=true;
		this.isWall=false;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	public boolean isWall() {
		return isWall;
	}
	public void setWall(boolean isWall) {
		this.isWall = isWall;
	}

}
