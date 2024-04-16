import se.lth.cs.pt.window.SimpleWindow; //importerar simpleWindow
import java.awt.Color; //importerar färgerna i klassen "Colors"

public class Mole {

	Graphics g = new Graphics(30, 50, 10); // kopplar samman klassen Graphic med klassen Mole.

	public static void main(String[] args) {
		System.out.println("Keep on digging!"); // Skriver ut en text som står "Keep digging"
// main metoden
		Mole m = new Mole();
		m.drawWorld(); // anropar metoden drawWorld
		m.dig(); // anropar metoden "dig" med mullvaden
	}

	void drawWorld() {
		g.rectangle(0, 0, 80, 70, Colors.SOIL); // Detta är då världen,
		// g.square();
		// g.block(5, 10, Colors.MOLE);
		// g.block(10, 15, Colors.SOIL);
		// g.block(20, 30, Colors.TUNNEL);
	}

	public void dig() {
		int x = g.getWidth() / 3; // För att börja på mitten
		int y = g.getHeight() / 3;
		while (true) { // while sats - att koden körs för alltid
			g.block(x, y, Colors.MOLE); // Ritar ut en svart punkt vid kordinat x och y, och den blir mullvaden så att
										// man ser vart den är. Tar vi bort den, ser vi inte dess start position.
			char key = g.waitForKey();
			g.block(x, y, Colors.TUNNEL); // efter att du trycker på en knapp, det vill säga när mullvaden rör på sig,
											// ritas en annan block med färgen tunnel.
			if (key == 'w') {
				y--; // när du trycker på "W" förflyttar sig mullvaden uppåt, y minskar med ett för
						// varje gång
				g.block(x, y, Colors.MOLE); // bildar en ny block som blir nya mullvaden
			} else if (key == 'a') {
				x--; // när du trycker på "a" förflyttar sig mullvaden i x led (bak ett steg till
						// vänster)
				g.block(x, y, Colors.MOLE); // bildar en ny block som blir nya mullvaden
			} else if (key == 's') {
				y++; // när du trycker på "S" förflyttar sig mullvaden nerråt, y ökar med ett
				g.block(x, y, Colors.MOLE); // bildar en ny block som blir nya mullvaden
			} else if (key == 'd') {
				x++; // när du trycker på "d" förflyttar sig mullvaden positivt i x led
				g.block(x, y, Colors.MOLE); // bildar en ny block som blir nya mullvaden
			}
		}

	}

}
