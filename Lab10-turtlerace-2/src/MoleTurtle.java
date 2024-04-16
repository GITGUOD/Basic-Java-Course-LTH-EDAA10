import java.util.Random;

public class MoleTurtle extends RaceTurtle {

	private int nbr;

	public MoleTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
		this.nbr = nbr;
		// TODO Auto-generated constructor stub
	}

	public void raceStep() {
		super.raceStep();

		Random rand = new Random();
		float chance = rand.nextFloat();
		if (chance <= 0.37f) {
			penUp();

		} else
			penDown();

		// skapar random objekt och en variabel chance med datatypen float
		// 37% chans att programmet slutar måla sköldpaddan, annars är pennan nere

	}

	/**
	 * Returnerar en läsbar representation av denna RaceTurtle, på formen "Nummer x"
	 * där x är sköldpaddans startnummer.
	 */
	public String toString() {

		// En string kan ej vara en integer, därför anropas integer klassen

		// String r = Integer.toString(nbr);
		return "Nbr " + nbr + " " + "MoleTurtle";
		// finns i attributen

	}
}
