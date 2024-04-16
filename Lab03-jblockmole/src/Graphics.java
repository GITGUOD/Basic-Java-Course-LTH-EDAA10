import se.lth.cs.pt.window.SimpleWindow; //importera SimpleWindow i klassen

public class Graphics {
	private int width; // deklarerar olika variabler i datatypen int
	private int blockSize;
	private int height;

	private SimpleWindow w; // private gör att man inte kan nå den i andra klasser

	public Graphics(int w, int h, int bs) { // konstruktor, blir smidigare att nå variablerna.
		width = w;
		blockSize = bs;
		height = h;
		this.w = new SimpleWindow(width * blockSize, height * blockSize, "Digging"); // refererar till private
																						// SimpleWindow

	}

	public void rectangle(int x, int y, int width, int height, java.awt.Color Color) { // metod för rectangle
		for (int yy = y; yy < y + height; yy++) {
			for (int xx = x; xx < x + width; xx++) {
				block(xx, yy, Color);
			}
		}

	}

	public void square() { // metod för square i tidigare deluppgift
		w.moveTo(10, 10); // Squaren till 10 i X-kordinat och 10 i Y-kordinat
		w.lineTo(10, 20); // ny linje till nya kordinater
		w.lineTo(20, 20); // gäller samma
		w.lineTo(20, 10);
		w.lineTo(10, 10); // 4 linjer som bildar en fyrkantig square

	}

	public int getWidth() { // metod
		return width;
	}

	public int getHeight() { // metod
		return height;
	}

	public void block(int x, int y, java.awt.Color Color) { // metod för en block
		w.setLineColor(Color);
		int left = x * blockSize;
		int right = left + blockSize - 1;
		int top = y * blockSize;
		int bottom = top + blockSize - 1;
		for (int row = top; row <= bottom; row++) {
			w.moveTo(left, row);
			w.lineTo(right, row);
		}

	}

	public char waitForKey() { // väntar på musen
		return w.waitForKey();
	}
}