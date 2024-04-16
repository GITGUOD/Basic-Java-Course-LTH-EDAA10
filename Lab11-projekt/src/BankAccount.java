
public class BankAccount {

	private Customer holder;
	private int Capital;
	private int kontonummer;
	static int add = 1001;

	/**
	 * Skapar ett nytt bankkonto åt en innehavare med namn 'holderName' och id
	 * 'holderId'. Kontot tilldelas ett unikt kontonummer och innehåller
	 * inledningsvis 0 kr.
	 */
	public BankAccount(String holderName, long holderId) {

		holder = new Customer(holderName, holderId);
		Capital = 0;
		kontonummer = add;
		add++;

	}

	/**
	 * Skapar ett nytt bankkonto med innehavare 'holder'. Kontot tilldelas ett unikt
	 * kontonummer och innehåller inledningsvis 0 kr.
	 */
	public BankAccount(Customer holder) {
		this.holder = holder;
		Capital = 0;
		kontonummer = add;
		add++;

	}

	/** Tar reda på kontots innehavare. */
	public Customer getHolder() {
		return holder;

	}

	/** Tar reda på det kontonummer som identifierar detta konto. */
	public int getAccountNumber() {
		return kontonummer;

	}

	/** Tar reda på hur mycket pengar som finns på kontot. */
	public double getAmount() {
		return Capital;

	}

	/** Sätter in beloppet 'amount' på kontot. */
	public void deposit(double amount) {
		Capital += amount;
		// addera amount
	}

	/**
	 * Tar ut beloppet 'amount' från kontot. Om kontot saknar täckning blir saldot
	 * negativt.
	 */
	public void withdraw(double amount) {

		Capital -= amount;
		// subrahera amount

	}

	/** Returnerar en strängrepresentation av bankkontot. */
	public String toString() {

		return "Konto: " + kontonummer + " " + " (" + holder + "):" + Capital;
	}
}
