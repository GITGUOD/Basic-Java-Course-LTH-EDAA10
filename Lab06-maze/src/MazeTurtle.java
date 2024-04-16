import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.maze.Maze;
import java.util.Scanner;

public class MazeTurtle {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(375, 375, "Maze"); // Simplewindow storleken på fönstret, (375,375) för att
																// den e lämplig för simuleringen (minimal)
		System.out.println("Ange nivå av laborint");

		Scanner myScanner = new Scanner(System.in);
		int choice = myScanner.nextInt();
		Maze m = new Maze(choice); // anropar Maze nivå 5 i svårighetsgrad

		m.draw(w); // ritar Maze m i simplewindow W
		Turtle turtle = new Turtle(w, m.getXEntry(), m.getYEntry()); // tillkallar metoden turtle i Simplewindow och ger
																		// den startkoordinater i X och Y led

		MazeWalker MW = new MazeWalker(turtle); // tillkallar MazeWalker
		MW.walk(m); // kör metoden walk

	}

}