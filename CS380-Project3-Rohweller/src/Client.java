import java.util.Arrays;


public class Client 
{
	public static char[][] mazeOne = 
		{
		{'X','X','X','X','X','X','X','X','X','X'},
		{'X','.','.','.','.','.','.','.','.','X'},
		{'X','X','.','X','.','X','X','X','X','X'},
		{'X','.','.','X','.','X','.','.','.','X'},
		{'X','.','.','X','.','.','.','X','.','X'},
		{'X','X','X','X','.','X','X','X','.','X'},
		{'X','.','X','.','.','.','.','X','X','X'},
		{'X','.','.','X','X','.','X','X','.','X'},
		{'X','.','.','.','X','.','.','.','.','X'},
		{'X','X','X','X','X','X','X','X','X','X'}
		};
	public static char[][] mazeTwo = 
		{
		{'X','X','X','X','X','X','X','X','X','X'},
		{'X','X','.','.','.','.','.','X','.','X'},
		{'X','X','.','X','X','.','X','X','.','X'},
		{'X','X','.','.','X','.','.','.','.','X'},
		{'X','X','.','X','.','X','X','X','X','X'},
		{'X','X','.','X','.','X','X','X','X','X'},
		{'X','.','.','X','X','.','.','X','.','X'},
		{'X','.','X','X','.','X','.','X','.','X'},
		{'X','.','.','.','.','.','.','.','.','X'},
		{'X','X','X','X','X','X','X','X','X','X'}
		};
	public static char[][] mazeThree = 
		{
		{'X','X','X','X','X','X','X','X','X','X'},
		{'X','X','X','X','X','.','.','X','.','X'},
		{'X','X','X','X','.','X','X','X','X','X'},
		{'X','X','.','.','.','.','.','.','.','X'},
		{'X','.','.','X','X','.','.','X','.','X'},
		{'X','X','.','X','X','.','X','X','.','X'},
		{'X','X','X','X','.','.','.','X','.','X'},
		{'X','.','.','X','.','X','.','X','.','X'},
		{'X','X','.','X','.','.','X','X','X','X'},
		{'X','X','X','X','X','X','X','X','X','X'}
		};
	
	public static char[][] genericMaze = 
		{
		{'X','X','X','X','X','X','X','X','X','X'},
		{'X','.','X','.','.','.','X','.','X','X'},
		{'X','X','X','X','.','X','.','.','X','X'},
		{'X','.','X','X','X','X','.','.','.','X'},
		{'X','.','.','.','.','.','.','X','.','X'},
		{'X','X','X','X','.','X','X','.','.','X'},
		{'X','X','X','.','X','.','.','.','.','X'},
		{'X','.','X','X','X','.','X','X','.','X'},
		{'X','.','.','X','X','.','.','X','X','X'},
		{'X','X','X','X','X','X','X','X','X','X'}
		};
	

	public static void main(String[] args) 
	{
		System.out.println("Justin Rohweller.");
		System.out.println("CS380-Data Structures");
		System.out.println("002502776");
		System.out.println("March 5, 2016");
		
		Coord startCoord = new Coord(7,5);
		Coord endCoord = new Coord(3,1);
		Stack stackMaze = new Stack();
		Queue queueMaze = new Queue();
		System.out.println(stackMaze.pathExists(genericMaze, startCoord, endCoord));
		System.out.println(queueMaze.pathExists(genericMaze, startCoord, endCoord)); 
		
		Coord startCoord2 = new Coord(7,5);
		Coord endCoord2 = new Coord(1,1);
		Stack stackMaze2 = new Stack();
		Queue queueMaze2 = new Queue();
		System.out.println(stackMaze2.pathExists(genericMaze, startCoord2, endCoord2));
		System.out.println(queueMaze2.pathExists(genericMaze, startCoord2, endCoord2)); 
	}

}
