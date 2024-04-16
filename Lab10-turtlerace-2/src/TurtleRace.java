import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TurtleRace {

	public static void main(String[] args) {

		RaceWindow w = new RaceWindow();
		Random rand = new Random();

		ArrayList<RaceTurtle> Turtles = new ArrayList<RaceTurtle>();
		// Lista för sköldpaddor
		ArrayList<RaceTurtle> TurtleWinners = new ArrayList<RaceTurtle>();
		// RaceTurtle RT = ;
		// Lista för vinnaresköldpaddor

		Scanner scan = new Scanner(System.in);
		w.waitForMouseClick();
		for (int i = 0; i < 8; i++) {

			int randomNbr = rand.nextInt(3);

//			if (randomNbr == 3) {
//				Turtles.add(new RaceTurtle(w, i + 1));
//			}

			if (randomNbr == 1) {
				Turtles.add(new MoleTurtle(w, i + 1));
			}

			else if (randomNbr == 2) {

				Turtles.add(new DizzyTurtle(w, i + 1, 5));
			} else if (randomNbr == 0) {

				Turtles.add(new AbsentMindedTurtle(w, i + 1, 59));

			}
			

//			Turtles.add(new MoleTurtle(w, i + rand.nextInt()));
//			Turtles.add(new DizzyTurtle(w, i + rand.nextInt()));
//			Turtles.add(new AbsentMindedTurtle(w, i + rand.nextInt()));

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

				RaceWindow.delay(5);
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
		for (int n = 0; n < 8; n++) {

			System.out.println("Vinnare på plats " + f + " " + "Turtle" + " " + TurtleWinners.get(n).toString());
			f++;

		}

	}
}