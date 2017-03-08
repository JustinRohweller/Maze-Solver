public class Coord {
	private int m_row, m_col;
	Coord next, previous;
	public Coord(int rrow, int ccol)
	{
		m_row = rrow;
		m_col = ccol;
		next = null;
		previous = null;
	}
	public int getRow(){
		return m_row;
	}
	public int getCol(){
		return m_col;
	}
	public void setNext(Coord newNode)
	{
		next = newNode;
	}
	public Coord getNext(){
		return next;
	}
	public void setPrevious(Coord newNode){
		previous = newNode;
	}
	public Coord getPrevious(){
		return previous;
	}
}
