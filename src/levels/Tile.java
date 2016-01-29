package levels;

import java.util.ArrayList;

import entity.Entity;

public class Tile {

	public ArrayList<Entity> entities;
	public int row, col;
	
	public Tile(int r, int c)
	{
		row = r;
		col = c;
	}
	
}
