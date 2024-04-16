import java.util.*;

public class TestMean {
	/*
	 * Denna metod simulerar s ndningen av ett paket och h ller p tills den ���
	 * lyckas. N r s ndningen lyckas s returneras antal g nger man var tvungen����
	 * att s nda paketet innan man lyckases.�
	 */
	public static int nbrSent(int size, double p) {
		int counter = 0;
		do
			counter++;
		while (!packetOK(size, p));
		return counter;
	}

	/*
	 * Denna metod avg r om en bit r korrekt eller inte. Med sannolikheten p r ���
	 * den inte korrekt och d returneras false annars returneras true. S
	 * sannolikheten �� att false returneras r allts p. ��
	 */
	public static boolean bitOK(double p) {
		Random rnd = new Random();
		if (rnd.nextDouble() < p) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * Denna metod kollar om ett paket r korrekt eller inte. Det görs genom att ��
	 * kolla bit för bit och s snart en bit r fel (genom att bitOK() blir false) s
	 * ���� reterneras false. Om bitOK() blir true f r alla bitar i paketet s
	 * returneras true.��
	 */
	public static boolean packetOK(int size, double p) {
// Här fattas kod, metoden ska naturligtvis inte bara returnera true. �

		for (int i = 0; i < size; i++) {

			if (!bitOK(p)) {
				return false;

			}

		}
		return true;

	}

	public static void main(String[] args) {
		double p = 0.001; // Sannolikheten att en bit r felaktig�
		int size = 660; // Storleken p ett paket, r d + h i handledningen��
		int counter = 0; // Denna r knare anv nds f r att r kna totala antalet ���� paket som
		// skickas i detta simuleringsexperiment.
		int nbrExperiments = 10000; // Antal paket som ska skicks i experimentet
		for (int i = 0; i < nbrExperiments; i++) { // H r s nds nbrExperiments �� paket
			counter = counter + nbrSent(size, p); // counter anv nds f r att��r kna totala antalet paket som skickas�
		}
		System.out.println(1.0 * counter / nbrExperiments); // Medelv rdet av antal gånger ett paket måste skickas ber
															// knas���
	}
}