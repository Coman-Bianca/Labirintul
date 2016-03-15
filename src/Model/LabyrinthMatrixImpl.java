package Model;

public class LabyrinthMatrixImpl implements Labyrinth {

	int[][] matrix;
	int line;
	
	public LabyrinthMatrixImpl(int[][] matrix) {
		this.matrix = matrix;
	}

	@Override
	public int getRowCount() {
		return matrix.length;
	}

	@Override
	public int getColumnCount() {
		return matrix[0].length;
	}

	@Override
	public boolean isFreeAt(int row,int column) {
		if((row>=getRowCount() || row<0 )||(column >=getColumnCount() || column<0 ))
			return false;
		return matrix[row][column]!=1;		
	}

	@Override
	public boolean isWallAt(int row,int column) {
		if((row>=getRowCount() || row<0 )||(column >=getColumnCount() || column<0 ))
			return false;
		return matrix[row][column]==1;	
	}

	@Override
	public Cell getStartCell() {
		
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++)
				if(matrix[i][j]==-1)return new Cell(i,j);
		return null;
	}

	@Override
	public Cell getFinishCell() {
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++)
				if(matrix[i][j]==2)return new Cell(i,j);
		return null;
	}

	
}
