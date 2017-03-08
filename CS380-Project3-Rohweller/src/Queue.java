
public class Queue 
{
	@SuppressWarnings("unused")
	private int size;
	private Coord head;
	private int iteration;
	
	Queue()
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
	 
	public Coord Dequeue() //this function does what pop does for queue right now
	{
		Coord temp = Peek();//look in
		head.getNext().getNext().setPrevious(head);//set second one to point back to head
		head.setNext(head.getNext().getNext());//set head to point to second one
		return temp;
	}
	 
	void Enqueue(Coord newCoord)
	{
		newCoord.setNext(head); //set newCoord to point to head next
		newCoord.setPrevious(head.getPrevious()); //set newcoord to point back to the one behind it.
		head.getPrevious().setNext(newCoord); //set the last element to point to newcoord
		head.setPrevious(newCoord); //set the head to point back to newCoord as the new last element.
		size++;
		return;
	}
	
	Coord Peek() //getfront
	{
		return head.getNext();
	}
	
	boolean isEmpty()
	{
		if (head.getNext()==head&&head.getPrevious()==head)
		{
			return true;
		}
		else
			return false;
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
		
		Enqueue(startCoord);
		genericMaze[startCoord.getRow()][startCoord.getCol()]= 'F';
		while (!(isEmpty()))
		{
			Coord coord = Dequeue();
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
				return true;
			}
			
			if ((genericMaze[coord.getRow()-1][coord.getCol()]=='.'))
			{
				genericMaze[coord.getRow()-1][coord.getCol()]= 'F';
				Coord pushinCord = new Coord((coord.getRow()-1),(coord.getCol()));
				Enqueue(pushinCord);
			}
			
			if ((genericMaze[coord.getRow()][coord.getCol()+1]=='.'))
			{
				genericMaze[coord.getRow()][coord.getCol()+1]= 'F';
				Coord pushinCord = new Coord((coord.getRow()),(coord.getCol()+1));
				Enqueue(pushinCord);
			}
			
			if ((genericMaze[coord.getRow()+1][coord.getCol()]=='.'))
			{
				genericMaze[coord.getRow()+1][coord.getCol()]= 'F';
				Coord pushinCord = new Coord((coord.getRow()+1),(coord.getCol()));
				Enqueue(pushinCord);
			}
			
			if ((genericMaze[coord.getRow()][coord.getCol()-1]=='.'))
			{
				genericMaze[coord.getRow()][coord.getCol()-1]= 'F';
				Coord cord = new Coord((coord.getRow()),(coord.getCol()-1));
				Enqueue(cord);
			}
			iteration++;
		}
		return false;
		
	}
	
	
}


