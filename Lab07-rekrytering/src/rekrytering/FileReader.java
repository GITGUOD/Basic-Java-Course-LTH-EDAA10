package rekrytering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	/**
	 * Returnerar max nbrOfRows rader från filen som en vektor av Applicant-objekt.
	 * Läser i filen tills det inte finns fler rader eller tills man läst nbrOfRows
	 * rader (det som inträffar först). Returnerar null om filen inte finns.
	 */
	public static Applicant[] readFromFile(String fileName, int nbrOfRows) {
		Scanner scan;
		try {
			scan = new Scanner(new File(fileName), "utf-8");
		} catch (FileNotFoundException e) {
			System.err.println("File not found" + fileName);
			e.printStackTrace();
			return null;
		}

		Applicant[] a = new Applicant[nbrOfRows];
		int i = 0;
		while (scan.hasNextLine() && i <= nbrOfRows) { //Läser in och räknar hur många rader
			String dataBase = scan.nextLine();
			String[] splits = dataBase.split(" ");
			if (dataBase != "") { // När det inte finns mer att splitta, slutar programmet köras
				// då det inte finns mer att köra

				Applicant applicant = new Applicant(splits[0] + " " + splits[1], splits[2]); // splits 0 = Förnamn,
																								// splits 1 = Efternamn
				// Splits 2 = Betyg, de splittar
				a[i] = applicant;
				i++;
			}

		}
//		Applicant[] b = new Applicant[i];
//		for (int j = 0; j < i; j++) {
//			b[j] = a[j]; // Tar bort irrelevanta/tomma rader
//		}
		// Här kan du använda Scannern för att läsa från filen fileName.
		// Varje rad motsvarar en Applicant. Kontrollera vad Applicants konstruktor
		// kräver
		// Alla Applicant-objekt (max nbrOfRows stycken) ska lagras i en
		// Applicant-vektor och returneras på slutet
		// Byt ut denna rad mot hela lösningen
		return a;
	}
}
