package algorithm;

import Model.Direction;
import Model.Labyrinth;

public interface LabyrinthSolver {
	//get/setLabyrinth, nextCellToExplore, .... 
	public abstract Labyrinth getLabyrinth();
	public abstract void setLabyrinth(Labyrinth l);
	public abstract boolean nextCellToExplore(Direction d);
}
