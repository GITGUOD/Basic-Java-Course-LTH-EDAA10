package memory;

import java.util.Scanner;

public class MemoryGame {
	public static void main(String[] args) {
		String[] frontFileNames = { "can.jpg", "flopsy_mopsy_cottontail.jpg", "friends.jpg", "mother_ladybird.jpg",
				"mr_mcgregor.jpg", "mrs_rabbit.jpg", "mrs_tittlemouse.jpg", "radishes.jpg" };
		
		Scanner scan = new Scanner(System.in);
		int highscore = Integer.MAX_VALUE;
		boolean play = true;
		while (play) {
			String backFileName = "back.jpg";
			//Skapar nya objekt av båda konstruktorn av MemoryBoard och MemoryWindow
			//MemoryBoard är själva spelet
			//MemoryWindow är själva windowen/fönstret
			MemoryBoard MB = new MemoryBoard(4, backFileName, frontFileNames);
			MemoryWindow MW = new MemoryWindow(MB);
			//ritar upp drawBoarden
			MW.drawBoard();
			int counter = 0;
			//När man inte har vunnit så spelas
			while (MB.hasWon() == false) {

				MW.waitForMouseClick();
				int r = MW.getMouseRow();
				int c = MW.getMouseCol();
				
				//Väntar på att musen för att få upp framsidan på kortet, om det e sant, return
				while (MB.frontUp(r, c)) {
					MW.waitForMouseClick();
					r = MW.getMouseRow();
					c = MW.getMouseCol();
				}
				//Vänder på kortet och ritar den
				MB.turnCard(r, c);
				MW.drawCard(r, c);

				MW.waitForMouseClick();
				int r2 = MW.getMouseRow();
				int c2 = MW.getMouseCol();
				while (MB.frontUp(r2, c2)) {
					MW.waitForMouseClick();
					r2 = MW.getMouseRow();
					c2 = MW.getMouseCol();
				}
				MB.turnCard(r2, c2);
				MW.drawCard(r2, c2);
				counter++;
				if (!MB.same(r, c, r2, c2)) {
					MW.delay(800);
					MB.turnCard(r, c);
					MB.turnCard(r2, c2);
					MW.drawCard(r, c);
					MW.drawCard(r2, c2);
					// om de är samma, ska du gå vidare aka "continue;" annars aka "else" vänd tbx
					// korten
				}

			}
			if (counter < highscore) {
				highscore = counter;
			}
			MW.close();
			System.out.println("Your highscore " + highscore);
			System.out.println("EASY " + counter);
			System.out.println("Wanna play again? Type the letter Y to start over");
			String Q = scan.nextLine();
			if (!Q.equalsIgnoreCase("Y")) {
				break;
			}
		}
	}
}
