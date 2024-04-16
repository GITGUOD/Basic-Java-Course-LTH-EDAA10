import java.util.ArrayList;

public class Bank {
	private ArrayList<BankAccount> bankAccounts;

	/** Skapar en ny bank utan konton. */
	public Bank() {
		bankAccounts = new ArrayList<BankAccount>();
//inget this då det inte finns något i parametrarna
	}

	/**
	 * Öppna ett nytt konto i banken. Om det redan finns en kontoinnehavare med de
	 * givna uppgifterna ska inte en ny Customer skapas, utan istället den
	 * befintliga användas. Det nya kontonumret returneras.
	 */
	public int addAccount(String holderName, long idNr) {

//		Customer c = findHolder(idNr);
//		if(c == null) {
//			BankAccount account = new BankAccount(holderName, idNr);
//			return account.getAccountNumber();
//		} else {
//			BankAccount account2 = new BankAccount(c);
//			return account2.getAccountNumber();
//		}

		for (int i = 0; i < bankAccounts.size(); i++) {
			if (bankAccounts.get(i).getHolder().getIdNr() == idNr) {
				// loopar igenom listan och checkar om det finns ett befintligt konto som
				// matchar idNr
				// Om det inte finns, skapas ett nytt bankkonto objekt med ett nytt namn, samt
				// ett nytt idNummer och lägger i den i listan
				BankAccount account = new BankAccount(bankAccounts.get(i).getHolder());
				bankAccounts.add(account);

				// bankkontot returneras och metoden avslutas
				return account.getAccountNumber();

			}

		}
		// Nytt konto skapas och läggs i listan
		BankAccount account2 = new BankAccount(holderName, idNr);
		bankAccounts.add(account2);
		return account2.getAccountNumber();

	}

	/**
	 * Returnerar den kontoinnehavaren som har det givna id-numret, eller null om
	 * ingen sådan finns.
	 */
	public Customer findHolder(long idNr) {

		for (int i = 0; i < bankAccounts.size(); i++) {
			if (bankAccounts.get(i).getHolder().getIdNr() == idNr) {
				return bankAccounts.get(i).getHolder();
				// För att nå customers, anropar vi getHolder i BankAccount
			}
		}

		return null;
	}

	/**
	 * Tar bort konto med nummer 'number' från banken. Returnerar true om kontot
	 * fanns (och kunde tas bort), annars false.
	 */
	public boolean removeAccount(int number) {
//		BankAccount BA = findByNumber(number);
//		if (BA != null) {
//			bankAccounts.remove(BA);
//			return true;
//
//		}

		for (int i = 0; i < bankAccounts.size(); i++) {
			if (bankAccounts.get(i).getAccountNumber() == number) {

				bankAccounts.remove(bankAccounts.get(i));
				// tar bort kontonumret

				// bankAccounts.remove(bankAccounts.get(i).getHolder().getIdNr());
				// Hade vi haft detta skulle vi tagit bort holder och idNr, vilket vi inte vill
				return true;
			}
		}
		return false;
	}

	/**
	 * Returnerar en lista innehållande samtliga bankkonton i banken. Listan är
	 * sorterad på kontoinnehavarnas namn.
	 */
	public ArrayList<BankAccount> getAllAccounts() {
		for (int i = 0; i < bankAccounts.size(); i++) {
			for (int k = i + 1; k < bankAccounts.size(); k++) {
				if (bankAccounts.get(i).getHolder().getName()
						.compareTo(bankAccounts.get(k).getHolder().getName()) > 0) {
					BankAccount temp = bankAccounts.set(i, bankAccounts.get(k));
					bankAccounts.set(k, temp);

				}

			}
		}
		return bankAccounts;
	}

	/**
	 * Söker upp och returnerar bankkontot med kontonummer 'accountNumber'.
	 * Returnerar null om inget sådant konto finns.
	 */
	public BankAccount findByNumber(int accountNumber) {

		for (int i = 0; i < bankAccounts.size(); i++) {
			if (bankAccounts.get(i).getAccountNumber() == accountNumber) {
				return bankAccounts.get(i);

			}
		}

		return null;

	}

	/**
	 * Söker upp alla bankkonton som innehas av kunden med id-nummer 'idNr'.
	 * Kontorna returneras i en lista. Kunderna antas ha unika id-nummer.
	 */
	public ArrayList<BankAccount> findAccountsForHolder(long idNr) {
		ArrayList<BankAccount> holders = new ArrayList<BankAccount>();
		for (int i = 0; i < bankAccounts.size(); i++) {
			if (bankAccounts.get(i).getHolder().getIdNr() == idNr) {
				holders.add(bankAccounts.get(i));
			}
		}

		return holders;

	}

	/**
	 * Söker upp kunder utifrån en sökning på namn eller del av namn. Alla personer
	 * vars namn innehåller strängen 'namePart' inkluderas i resultatet, som
	 * returneras som en lista. Samma person kan förekomma flera gånger i
	 * resultatet. Sökningen är "case insensitive", det vill säga gör ingen skillnad
	 * på stora och små bokstäver.
	 */
	public ArrayList<Customer> findByPartofName(String namePart) {
		ArrayList<Customer> namnList = new ArrayList<Customer>();
		for (int i = 0; i < bankAccounts.size(); i++) {
			if (bankAccounts.get(i).getHolder().getName().toLowerCase().contains(namePart.toLowerCase())) {
				namnList.add(bankAccounts.get(i).getHolder());

			}
		}

		return namnList;

	}
}
