import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.moveTo(0, 0);
		
		int x = 0;
		int y = 0;
		while (true) {
			w.waitForMouseClick();
			
			x = w.getMouseX();
			y = w.getMouseY();
			w.lineTo(x, y);
			
		}
	}
}
