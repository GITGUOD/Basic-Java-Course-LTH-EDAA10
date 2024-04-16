import java.util.Random;

public class DizzyTurtle extends RaceTurtle {

	private int nbr;
	private int drunkOrDizzy;
	private double hacks;

	public DizzyTurtle(RaceWindow w, int nbr, int drunkOrDizzy) {
		super(w, nbr);
		this.nbr = nbr;
		this.drunkOrDizzy = drunkOrDizzy;
		// TODO Auto-generated constructor stub
	}

	public double slumpa() {
		Random rand = new Random();
		int chance = rand.nextInt((2) + 1);
		// Slump mellan 1-2
		hacks = 0;
		if (chance == 2) {
			hacks = 0.06;
		}

		if (chance == 1) {
			hacks = -0.06;
		}
		return hacks;
		// hjälpmetod för slumpen som används i racestep
		// om slumpen eller chance blir 2, ändras numret till 0,06 och om slumpen blir 1
		// ändras numret till -0,06
		// högre nummer än så, kmr sköldpaddan att svänga rätt mkt
	}

	public void raceStep() {

		super.left(slumpa() * drunkOrDizzy);
		// Den kommer svänga beroende på slumpmetoden ovanför, dvs 0,06 eller -0,06
		// DrunkOrDizzy är en int för hur mycket man vill att den ska svängah

		super.raceStep();
	}

	/**
	 * Returnerar en läsbar representation av denna RaceTurtle, på formen "Nummer x"
	 * där x är sköldpaddans startnummer.
	 */
	public String toString() {

		// En string kan ej vara en integer, därför anropas integer klassen

		// String r = Integer.toString(nbr);
		return "Nbr " + nbr + " " + "DizzinessLvl" + " " + drunkOrDizzy + " " + "DizzyTurtle";
		// finns i attributen
		// return "Nbr " + nbr kan ersättas med super.toString();

	}

}
