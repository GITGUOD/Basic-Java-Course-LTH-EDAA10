
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {

		System.out.println("Hej, minns du vilken dag du och Natcha blev tillsammans? Svara ja eller nej");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		while (true) {
			if (choice.equals("ja") || choice.equals("JA") || choice.equals("jA") || choice.equals("Ja")) {
				// skrev contain innan och det är fel då man bara kan skriva tillexempel jag och
				// det printar ut vilken dag och år eftersom "ja" är med i jag
				System.out
						.println("Vilken dag och år då? " + "Du kan tillexempel skriva ett datum så här; 22 Mars 2022");
				choice = scan.nextLine();
				if (choice.equals("3 December 2022")) {

					System.out.println("Bra, stolt över dig :)");
					System.exit(0);

				}
			} else {
				System.out.println("Fel svar, komigen du kan, försök igen!!!");

				choice = scan.nextLine();
			}

		}
	}

}
