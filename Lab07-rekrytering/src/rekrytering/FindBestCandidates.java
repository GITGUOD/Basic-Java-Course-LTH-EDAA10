package rekrytering;

import java.util.Arrays;

public class FindBestCandidates {
	private static final double MIN_AVG_GRADE = 3.0;

	public static void main(String[] args) {

		Applicant[] a = FileReader.readFromFile("applications_x.txt", 300); // Står för arrayen applicant
		int i = 0;
		while(a[i] != null && i < a.length) {

			System.out.println(a[i]); // printar ut arrayen Applicant så lång som längden
			i++;

		}

		Applicant[] bestCandidates = findBestCandidates(a); // skapar en ny array av varibalen bestCandidates som kör
															// metoden
		// findBestCandidates, a står för Applicant
		System.out.println(); // printar ut en ny tom mening eller linje som gör koden lätt att läsa
		System.out.println("Elever med högre betyg än medelvärdet" + " " + "(" + MIN_AVG_GRADE + ")"); // Printar ut
																										// elever med
																										// betyg högre
																										// än
																										// medelvärldet
		for (int k = 0; k < bestCandidates.length; k++) { // printar ut kandidaterna till längden av arrayen
			if (bestCandidates[k] != null) { // Elever som inte uppfyller villkoret högre än medelbetyget omvandlas till
												// null men i detta fallet skrivs det inte ut eftersom vi inte vill
				System.out.println(bestCandidates[k]); // printar ut

			}

		}

		// Läs från fil (Börja med "applications_small.txt), spara resultatet i en
		// vektor

		// Skicka in Applicant-vektorn (som du fick i föregående steg) till metoden
		// findBestCandidiates (nedan)
		// Spara resultatet i en vektor

		// Printa resultatet från findBestCandidates
	}

	public static Applicant[] findBestCandidates(Applicant[] applicants) { // ska returnera en applicant array med de
																			// bästa
																			// candidates
		int a = 0;
		for (int i = 0; i < applicants.length; i++) {
			if (applicants[i]!=null && applicants[i].getAvgGrade() >= MIN_AVG_GRADE) { // de applicants som är bestcandidates

				// Hitta alla kandidater som har medelbetyg över MIN_AVG_GRADE
				a++;
			}

		}
		int Gs = 0;
		Applicant[] RealGs = new Applicant[a]; //Skapar en ny objekt av vektorn applicant
		for (int i = 0; i < applicants.length; i++) {
			if (applicants[i] != null && applicants[i].getAvgGrade() >= MIN_AVG_GRADE) { // Vektorn ignorerar alla
																							// applicants som inte
																							// uppfyller kraven. De som
																							// inte uppfyller kraven
																							// blir null men det som
																							// händer här är att null
																							// tas bort och nästa
																							// värde/namn/betyg
																							// tas
				RealGs[Gs] = applicants[i];
				Gs++; // Gör vektorn RealG lika stor som vektorn applicants, låter den växa
			}
		}

		return RealGs;
	}
}
