import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class Labb2EgnaÖvningarV2 {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		w.waitForMouseClick();
		int oldX = w.getClickedX();
		int oldY = w.getClickedY();
		Square sq = new Square(oldX, oldY, 100);
		sq.draw(w);
		
		while (true) {
			w.waitForMouseClick();
			int x = w.getClickedX();
			int y = w.getClickedY();
			for (int i=0; i<10; i++) {
				int xDist = (x - oldX)/10;
				int yDist = (y - oldY)/10;
				sq.erase(w);
				sq.move(xDist, yDist);
				sq.draw(w);
				SimpleWindow.delay(50);
			}
			oldX = x;
			oldY = y;
		}
	}
}