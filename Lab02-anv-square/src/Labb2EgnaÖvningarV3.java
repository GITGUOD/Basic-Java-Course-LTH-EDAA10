import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class Labb2EgnaÖvningarV3 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		Square sq = new Square(250, 250, 100);
		sq.draw(w);
		int oldX = 250;
		int oldY = 250;
		w.waitForMouseClick();
		int x = w.getClickedX();
		int y = w.getClickedY();
		int dx = x - oldX;
		int dy = y - oldY;
		int stepX = dx/10;
		int stepY = dy/10;
		
		for (int i=0; i<10; i++) {

			sq.move(stepX, stepY);
			sq.draw(w);
		
	}
}
}
