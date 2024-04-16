import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class Labb2EgnaÖvningar {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		
		Square sq = new Square(w.getMouseX(), w.getMouseY(), 100);
		//w.moveTo(w.getClickedX(),w.getClickedY());//
	
		while (true)  {
		w.waitForMouseClick();
		sq.erase(w);
		sq.move(w.getMouseX()-sq.getX(),w.getMouseY()-sq.getY());
		sq.draw(w);
		}
	

		
	}
}
