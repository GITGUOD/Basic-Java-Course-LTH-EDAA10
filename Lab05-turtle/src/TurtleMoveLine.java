import java.util.Random;
import se.lth.cs.pt.window.SimpleWindow;

public class TurtleMoveLine {

	public static void main(String[] args) {
		Random slump = new Random();
		SimpleWindow w = new SimpleWindow(600, 600, "TurtleMoveLine");
		Turtle t = new Turtle(w, 300, 300);

		t.penDown(); // när pennan är nere, ritas sköldpaddan

		for (int i = 0; i < 1000; i++) { // int i är en lokal variabel i for loopen
			t.forward(slump.nextInt(10) + 1);
			t.left(slump.nextInt(360) - 180);

		}

	}
}