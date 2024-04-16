import java.util.Random;

public class RaceTurtle extends Turtle {
	private int nbr;

	/**
	 * Skapar en sköldpadda som ska springa i fönstret w och som har start- nummer
	 * nbr. Sköldpaddan startar med pennan nere och nosen vänd åt höger.
	 */
	public RaceTurtle(RaceWindow w, int nbr) {
		super(w, w.getStartXPos(nbr), w.getStartYPos(nbr));
		super.penDown();
		super.left(270);
		this.nbr = nbr;

	}

	/**
	 * Låter sköldpaddan gå framåt ett steg. Stegets längd ges av ett slumptal
	 * (heltal) mellan 1 och 6.
	 */
	public void raceStep() {
		Random rand = new Random();
		super.forward(rand.nextInt(6) + 1);
		//siffran 6 är 0 till 5
		// + 1 är för att den ska gå mellan 1 och 6

	}

	/**
	 * Returnerar en läsbar representation av denna RaceTurtle, på formen "Nummer x"
	 * där x är sköldpaddans startnummer.
	 */
	public String toString() {

		// En string kan ej vara en integer, därför anropas integer klassen

		//String r = Integer.toString(nbr);
		return "Nbr " + nbr;
		//finns i attributen

	}

}
