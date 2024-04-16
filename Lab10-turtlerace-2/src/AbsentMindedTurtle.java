import java.util.Random;

public class AbsentMindedTurtle extends RaceTurtle {

	private int nbr;
	private int absentMindedness;

	public AbsentMindedTurtle(RaceWindow w, int nbr, int absentMindedness) {
		super(w, nbr);
		this.nbr = nbr;
		this.absentMindedness = absentMindedness;

		// TODO Auto-generated constructor stub
	}

	public void raceStep() {

		Random rand = new Random();

		int nbr = rand.nextInt(101);
		//ett nummer från 0-100

		if (nbr >= absentMindedness) {
			//om slumptalet är större eller lika med talet du bestämmer, körs racestep metoden
			super.raceStep();
		}

	}

	/**
	 * Returnerar en läsbar representation av denna RaceTurtle, på formen "Nummer x"
	 * där x är sköldpaddans startnummer.
	 */
	public String toString() {

		// En string kan ej vara en integer, därför anropas integer klassen

		// String r = Integer.toString(nbr);
		return "Nbr " + nbr + " " + "AbsentMindedTurtle" + " " + absentMindedness + " " + " % Frånvarande ";
		// finns i attributen

	}

}
