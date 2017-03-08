
public class Stack 
{
	@SuppressWarnings("unused")
	private int size;
	private Coord head;
	private int iteration;
	
	Stack()
	{
		setup();
	}
	private void setup()
	{
		size = 0;
		head = new Coord(-1,-1);
		head.setPrevious(head);
		head.setNext(head);
		return;
	}
	
	public Coord Pop()
	{
		Coord temp = Peek();
		head.getPrevious().getPrevious().setNext(head); // set 2nd to last element to point to head
		head.setPrevious(head.getPrevious().getPrevious()); // set 2nd to last element to be pointed to by head
		return temp;
	}
	
	//put newCoord as last element
	void Push(Coord newCoord) //Push is good
	{
			newCoord.setNext(head);
			newCoord.setPrevious(head.getPrevious());
			head.getPrevious().setNext(newCoord);
			head.setPrevious(newCoord);
			size++;
			return;
	}
	
	Coord Peek()
	{
		return head.getPrevious();
	}
	
	boolean isEmpty()
	{
		if (head.getNext()==head&&head.getPrevious()==head)
		{
			return true;
		}
		else
		{
			return false;	
		}
	}
	
	@SuppressWarnings("unused")
	boolean isFull()
	{
		Coord temp = new Coord( 0, 10);
		if (temp== null)
		{
			return true;
		}
		return false;
		
	}

	boolean pathExists(char[][] genericMaze, Coord startCoord, Coord endCoord)
	{
		char[][] mazeCopy = genericMaze;
		Push(startCoord);
		mazeCopy[startCoord.getRow()][startCoord.getCol()]= 'F';
		
		while (!(isEmpty()))
		{
			Coord coord = Pop(); /////Pop the top coordinate off the stack.
			
			if (endCoord.getRow()==coord.getRow() && endCoord.getCol()==coord.getCol())
			{
				System.out.print(iteration+" ");
				for (int i = 0; i < genericMaze.length; i++) 
				 {
			            for (int j = 0; j < genericMaze[i].length; j++) 
			       {
			            	if (genericMaze[i][j]=='F')
			            	{
			            		genericMaze[i][j]='.';
			            	}
			       }
			    }
				return true;//reached end of maze
			}
			
			if ((mazeCopy[coord.getRow()-1][coord.getCol()]=='.'))
			{
				mazeCopy[coord.getRow()-1][coord.getCol()]= 'F';
				Coord pushinCord = new Coord((coord.getRow()-1),(coord.getCol()));
				Push(pushinCord);
			}
			
			if ((mazeCopy[coord.getRow()][coord.getCol()+1]=='.'))
			{
				mazeCopy[coord.getRow()][coord.getCol()+1]= 'F';
				Coord pushinCord = new Coord((coord.getRow()),(coord.getCol()+1));
				Push(pushinCord);
			}
			
			if ((mazeCopy[coord.getRow()+1][coord.getCol()]=='.'))
			{
				mazeCopy[coord.getRow()+1][coord.getCol()]= 'F';
				Coord pushinCord = new Coord((coord.getRow()+1),(coord.getCol()));
				Push(pushinCord);
			}
			
			if ((mazeCopy[coord.getRow()][coord.getCol()-1]=='.'))
			{
				mazeCopy[coord.getRow()][coord.getCol()-1]= 'F';
				Coord cord = new Coord((coord.getRow()),(coord.getCol()-1));
				Push(cord);
			}
			iteration++;
		}
		return false;
		
	}

	
	
	
}
