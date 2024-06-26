package rekrytering;

import java.util.Arrays;

public class Applicant implements Comparable<Applicant> {
	// Varje sökande har ett namn och ett antal betyg
	private String name;
	private int[] grades;

	public Applicant(String name, String gradesAsString) {
		this.name = name;
		// Har flyttat tolkningen av betygen till en privat hjälpmetod för att hålla
		// konstruktorn kortare
		// Anropa denna och skicka vidare parametern som innehåller betygen
		parseGrades(gradesAsString);
	}

	private void parseGrades(String gradesAsString) {
		// gradesAsString har formatet x,y,z,q där respektive bokstav är ett betyg
		// Om vi splittar strängen på komma (",") hamnar varje betyg i en vektor
		String[] g = gradesAsString.split(",");
		// Skapa vektorn med heltal
		grades = new int[g.length];
		// Iterera över alla betyg för att översätta dessa till ett heltal
		for (int i = 0; i < g.length; i++) {
			if (!(g[i].equals("3") || g[i].equals("4") || g[i].equals("5"))) { // If satser, betygen MÅSTE vara
																				// 3,4,5.
				// Allt annat blir 0, t.ex om talet är
				// negativt eller är en bokstav
				// Om underkänd så räknar vi det som en nolla
				grades[i] = 0;

			} else {
				grades[i] = Integer.parseInt(g[i]);

			}

		}
	}

	public double getAvgGrade() { // metod för medelvärde

		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / 5; // hade *return sum / grades.length * innan men bytte eftersom det fanns en tjej
						// som hade 3 betyg istället för 5
	}

	/*
	 * Implementera denna när labbeskrivningen kräver det public String toString() {
	 * //Fyll i kod här }
	 */

	public String toString() {
		getAvgGrade();

		String Tonny = name + " " + Arrays.toString(grades) + " " + "(Avg; " + getAvgGrade() + ")";

		return Tonny; // grades är en vektor
		// toString metod för att printa ut namn, betygen i en vektor och medelbetyget
		// genom att anropa metoden getAvgGrade() får vi reda på medelvärdet på betygen

	}

	/*
	 * Metod för att jämföra detta Applicant-objekt med ett annat och få ut vilket
	 * som är störst. Retunerar något > 0 om detta objektet är störst. Returnerar
	 * något < 0 om other är störst och returnerar 0 om objekten är lika. Används av
	 * javas inbyggda sorteringsmetoder
	 */
	public int compareTo(Applicant other) {
		// Om exakt samma objekt
		if (other == this) {
			return 0;
		}
		// Annars jämför snittbetyget i första hand
		int gradeRes = (int) Math.round((getAvgGrade() - ((Applicant) other).getAvgGrade()) * 100);
		if (gradeRes == 0) {
			// Om snittbetyget är samma, låt namnet avgöra på namnet
			return name.compareTo(((Applicant) other).name);
		}
		return gradeRes;
	}
}
