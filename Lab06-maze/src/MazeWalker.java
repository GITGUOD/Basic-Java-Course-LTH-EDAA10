import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.maze.Maze;

public class MazeWalker {

	SimpleWindow w;
	private Turtle turtle;

	public MazeWalker(Turtle turtle) {
		this.turtle = turtle;
	}

	/**
	 * Låter sköldpaddan vandra genom labyrinten maze, från ingången till utgången.
	 */
	public void walk(Maze maze) { // metoden walk för att den ska gå framåt
		// this.m = maze; // Referar maze i attributen till maze i metoden
		turtle.penDown(); // Pennan nere och vi hoppar till while-loopen
		while (!maze.atExit(turtle.getX(), turtle.getY())) { // När vi inte är vid utgången i laborynten, ger vi
																// sköldpaddan som vi referar i klassen Turtle i labb 5,
																// X
																// och Y-koordinat, m står för Maze då sköldpaddan
																// befinner
																// sig i simuleringen Maze/Laborynt
			if (!maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY())) {
				turtle.left(90); // If sats; sköldpaddan svänger 90grader när det inte finns en vägg åt
									// vänstersida och det får vi reda genom sköldpaddans X och Y koordinat, samt
									// riktning
			} else if (maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY())
					&& maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY())) {
				turtle.left(-90); // else if sats om if-satsen ovan inte gäller; svänger sköldpaddan -90grader om
									// det finns en vägg framför, samt en vägg åt vänster

			}

			turtle.forward(1); // Sköldpaddan går framåt ett steg
			SimpleWindow.delay(1); // en delay

		}
		// while-loopen stängs och metoden slutar rita sköldpaddan

		turtle.penUp();

	}
}
