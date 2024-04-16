package memory;

import java.util.Random;

public class MemoryBoard {

	private int size;
	private boolean[][] checkboard;
	private MemoryCardImage[][] board;

	/**
	 * Skapar ett memorybräde med size * size kort. backFileName är filnamnet för
	 * filen med baksidesbilden. Vektorn frontFileNames innehåller filnamnen för
	 * frontbilderna.
	 */
	public MemoryBoard(int size, String backFileName, String[] frontFileNames) {
		this.size = size;
		checkboard = new boolean[size][size];
		board = new MemoryCardImage[size][size];
		createCards(backFileName, frontFileNames);

	}

	/*
	 * Skapar size * size / 2 st memorykortbilder. Placerar ut varje kort på två
	 * slumpmässiga ställen på spelplanen.
	 */
	private void createCards(String backFileName, String[] frontFileNames) {
		MemoryCardImage[] cardVector = new MemoryCardImage[frontFileNames.length]; // Skapar en ny objekt av arrayen
																					// cardVector där den lagrar alla
																					// bilderna som heter frontFileNames
		Random rand = new Random(); // Skapar random objekt
		int c = rand.nextInt(4);
		int r = rand.nextInt(4); // lokal variabler för rader och kolumn, random start värde

		// En for-loop, skapar nytt card objekt för varje bild

		for (int i = 0; i < size * 2; i++) {
			MemoryCardImage kort = new MemoryCardImage(frontFileNames[i], backFileName);
			// Skapar ett nytt objekt av MemoryCardImage med samma bakgrundsbild och olika
			// frontbilder
			// låter den loopa igenom cardVektor
			cardVector[i] = kort;

		}

		// En till loop där vi ser till att objektet placeras på två ställen i matrisen
		for (int j = 0; j < size * 2; j++) {
			for (int i = 0; i < 2; i++) {

				// loopar igen och letar efter nya ställen när det finns plats
				while ((board[r][c]) != null) {
					c = rand.nextInt(4);
					r = rand.nextInt(4);

				}
				board[r][c] = cardVector[j];
				checkboard[r][c] = false;
			}
		}

		// STEG FÖR STEG
		// FrontBilder -> vektor
		// back -> bakbilder
		// loopa igenom frontbilder vektorn
		// Ett objekt av MemoryCardImage - tar en frontbild och en bakbild (alla har
		// samma bakbild)
		// se till att objektet ska placeras på två ställen i matrisen, av typen
		// MemoryCardImage
		// Hitta ett ställe först, en ruta r,c
		// Två random-tal, en för int r och int c
		// while(matrisen[r][c] !=null)
		// slumpa fram igen
		// matrisen[r][c] ska tilldelas MemoryCardImage
		// [r2][r1]

	}

	/** Tar reda på brädets storlek. */
	public int getSize() {
		return size;
	}

	/**
	 * Hämtar den tvåsidiga bilden av kortet på rad r, kolonn c. Raderna och
	 * kolonnerna numreras från 0 och uppåt.
	 */
	public MemoryCardImage getCard(int r, int c) {

		return board[r][c];
	}

	/** Vänder kortet på rad r, kolonn c. */
	public void turnCard(int r, int c) {

		checkboard[r][c] = !checkboard[r][c];

	}

	/** Returnerar true om kortet r, c har framsidan upp. */
	public boolean frontUp(int r, int c) {

		return checkboard[r][c];
	}

	/**
	 * Returnerar true om det är samma kort på rad r1, kolonn c2 som på rad r2,
	 * kolonn c2.
	 */
	public boolean same(int r1, int c1, int r2, int c2) {

		if (getCard(r1, c1) == getCard(r2, c2)) {
			return true;
		}

		return false;
	}

	/** Returnerar true om alla kort har framsidan upp. */
	public boolean hasWon() {

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {

				if (checkboard[r][c] == false) {
					return false;
				}
			}
		}

		return true;
	}
}
