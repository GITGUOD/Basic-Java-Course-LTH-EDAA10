import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {

	// attributer (variabler som vill helst vara private då de inte vill ändras i de
	// andra klasserna)
	private double x; // sköldpaddans position i x-led
	private double y; // sköldpaddans position i y-led
	SimpleWindow w; // Fönstret som sköldpaddan ritas i
	private boolean ritning = false; // om Sköldpaddan ritas eller inte
	private double riktning = Math.PI / 2; // Sköldpaddans riktning i radianer

	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x, y med pennan lyft och huvudet pekande rakt uppåt i
	 * fönstret (i negativ y-riktning).
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		// parametrar //klassen turtle ska placeras i simplewindow i x koordinat och y
		// koordinat
		this.w = w;
		this.x = x;
		this.y = y;

	}

	/** Sänker pennan. */
	public void penDown() {
		ritning = true; // ritar när pennan är nere

	}

	/** Lyfter pennan. */
	public void penUp() {
		ritning = false; // ritar inte när uppe

	}

	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int x2) {
		w.moveTo((int) Math.round(x), (int) Math.round(y)); // flyttar på sig till (x,y) i koordinat där du vill rita if
															// true
		x = x + x2 * Math.cos(riktning); // gamla kordinater + nya kordinater samt ny riktning, rita upp ett
											// kordinatsystem
		y = y - x2 * Math.sin(riktning);
		if (ritning)
			w.lineTo((int) Math.round(x), (int) Math.round(y)); // ritar linje

	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(double beta) {
		riktning = riktning + Math.toRadians(beta);
	}

	/**
	 * Går till punkten newX, newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte.
	 */
	public void jumpTo(int newX, int newY) {

		x = newX;
		y = newY;
	}

	/**
	 * Återställer huvudriktningen till den ursprungliga.
	 * 
	 * @return
	 */
	public void turnNorth() {

		riktning = Math.PI / 2; // tänk dig enhetscirkel 90grad pi/2
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return (int) Math.round(x);
	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return (int) Math.round(y);
	}

	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
	public int getDirection() {
		return ((int) Math.toDegrees(riktning)) % 360;
	}

}
