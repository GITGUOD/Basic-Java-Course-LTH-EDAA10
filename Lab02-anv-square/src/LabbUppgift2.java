import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class LabbUppgift2 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		Square sq = null;
		sq.draw(w);
		sq.move(-40, 30);
		sq.draw(w);
		sq.move(55, 30);
		sq.draw(w);
	
	}
}
