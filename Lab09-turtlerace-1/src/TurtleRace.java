import java.util.ArrayList;

public class TurtleRace {

	public static void main(String[] args) {

		RaceWindow w = new RaceWindow();

		ArrayList<RaceTurtle> Turtles = new ArrayList<RaceTurtle>();
		// Lista för sköldpaddor
		ArrayList<RaceTurtle> TurtleWinners = new ArrayList<RaceTurtle>();
		// RaceTurtle RT = ;
		// Lista för vinnaresköldpaddor

		w.waitForMouseClick();
		for (int i = 0; i < 8; i++) {

			Turtles.add(new RaceTurtle(w, i + 1));
			// Skapar 8 sköldpaddor, samt ett nytt objekt i window och lägger in de i
			// Turtlelistan

		}

		while (Turtles.size() > 0) {
			// size() för listor
			// length för arrays
			// Så länge det finns sköldpaddor

			for (int k = 0; k < Turtles.size(); k++) {
				// Hämtar sköldpaddor och kör racet

				Turtles.get(k).raceStep();

				RaceWindow.delay(1);
				// delay

				if (Turtles.get(k).getX() >= RaceWindow.X_END_POS) {
					// Om sköldpaddorna är i mål tas de bort och läggs i den nya listan,
					// TurtleWinners, en i taget

					TurtleWinners.add(Turtles.get(k));
					Turtles.remove(k);

				}

			}

		}

		int f = 1;
		for (int n = 0; n < 3; n++) {

			System.out.println("Vinnare på plats " + f + " " + "Turtle" + " " + TurtleWinners.get(n).toString());
			f++;

		}

	}
}