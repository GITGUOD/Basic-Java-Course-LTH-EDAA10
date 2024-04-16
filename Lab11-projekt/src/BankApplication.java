import java.util.Scanner;

public class BankApplication {

	static Scanner scan = new Scanner(System.in);
	static Bank bank = new Bank();

	public static void main(String[] args) {

		System.out.println("Hej, välkommen kära eller blivande kund!");

//		bank.addAccount("Tonny Huynh", 1000);
//		bank.findByNumber(100).deposit(750);
//		bank.addAccount("AshrafTheGoat", 1001);
//		bank.findByNumber(101).deposit(550);
//		bank.addAccount("Richard XD", 1002);
//		bank.findByNumber(102).deposit(123);
//		bank.addAccount("Robert lol", 1003);
//		bank.findByNumber(103).deposit(250);
		// Går in i bank objektet och anropar metoden för att hitta kontonummer och
		// sätter in X kr

		// En while loop som körs för evigt tills du knappar in något annat nummer än
		// menyvalen, se runApplication metoden
		// Hur den körs, printApplication metoden körs, sedan knappar du in mellan 1 och
		// 8 för olika alternativ
		// Om du tillexempel knappar in 6, körs if satsen och därefter börjar den om
		// igen eftersom alternativet är inom menyvalen
		while (true) {

			// hjälpmetod fär att printa ut menyvalen
			printApplication();

			runApplication();
			
		}

	}

	public static void runApplication() {

		int choice = scan.nextInt();
		scan.nextLine();

		// Hitta ett konto utifrån innehavare
		if (choice == 1) {
			System.out.println("Skriv upp ditt IdNr för att komma åt dina konton");
			int account = scan.nextInt();
			bank.findAccountsForHolder(account);
			for (int i = 0; i < bank.findAccountsForHolder(account).size(); i++) {
				System.out.println(bank.findAccountsForHolder(account).get(i));

			}
		}

		else if (choice == 2) {
			// Sök kontoinnehavare utifrån (del av) namn

			System.out.println("Sök efter namn");
			String name = scan.nextLine();
			bank.findByPartofName(name);

			System.out.println("Konton som finns i listan ");

			for (int i = 0; i < bank.findByPartofName(name).size(); i++) {

				System.out.println(bank.findByPartofName(name).get(i));
			}

		}

		else if (choice == 3) {
			// Sätta in pengar
			System.out.println("Val " + choice + " ");

			System.out.println("Va vänligen och ange *kontonummer*");
			int accountNbr = scan.nextInt();
			System.out.println("hur mycket du vill sätta in? *OBS endast positiv insättning fungerar!*");
			double depositCash = scan.nextDouble();
			BankAccount b = bank.findByNumber(accountNbr);
			if (b == null) {
				System.out.println("kontot finns ej");
			} else if (depositCash > 0) {
				b.deposit(depositCash);
				scan.nextLine();
				System.out.println("Du har nu lagt in " + depositCash + "kr på kontonumret " + accountNbr);
			}

		}

		else if (choice == 4) {
			// Ta ut pengar
			System.out.println("Va vänligen och ange *kontonummer*");
			int accountNbr = scan.nextInt();
			System.out.println("hur mycket du vill ta ut? *OBS endast positiva tal fungerar!*");
			System.out.println();
			double withDrawCash = scan.nextDouble();
			BankAccount b = bank.findByNumber(accountNbr);
			if (b == null) {
				System.out.println("kontot finns ej");
			} else if (bank.findByNumber(accountNbr).getAmount() < withDrawCash) {
				System.out.println("Finns inga pengar på kontot");
			}

			else if (withDrawCash > 0) {
				b.withdraw(withDrawCash);
				scan.nextLine();
				System.out.println("Du har nu tagit ut " + withDrawCash + "kr på kontonumret " + accountNbr);
			}

		}

		else if (choice == 5) {
			// Överföra pengar
			System.out.println("Vänligen välj vilket konto du vill överföra från");
			int accountNbr = scan.nextInt();
			System.out.println("Vänligen välj vilket konto du vill överföra till");
			int accountNbr2 = scan.nextInt();
			System.out.println("Hur mycket vill du överföra?");
			double transferCash = scan.nextDouble();

			BankAccount a = bank.findByNumber(accountNbr);
			BankAccount b = bank.findByNumber(accountNbr2);

			if (a == null || b == null) {
				System.out.println("kontot finns ej");
			} else if (bank.findByNumber(accountNbr).getAmount() != transferCash) {
				System.out.println("Finns inga pengar på kontot");
			}

			else if (transferCash > 0) {
				a.withdraw(transferCash);
				b.deposit(transferCash);
				System.out.println("Du har nu överfört " + transferCash + "kr");
			}

		}

		else if (choice == 6) {
			// Skapa ett konto
			System.out.println("- - - - - - - - - - - - - - - - - - - - -");
			System.out.println(
					"Skapa ett nytt konto? Va vänligen och ange ditt namn och efternamn eller endast namn på kontot");
			String name = scan.nextLine();
			System.out.println("Ditt idNr");
			long idNr = scan.nextLong();
			scan.nextLine();
			bank.addAccount(name, idNr);
			System.out.println("Konto skapat: " + bank.findAccountsForHolder(idNr).get(0).getAccountNumber());
			// get(0) står för en hämtning av första objektet i listan

		}

		else if (choice == 7) {

			// Ta bort konto
			System.out.println("Ta bort ett konto? Vänligen ange idNr");
			int idNr = scan.nextInt();

			if (bank.removeAccount(idNr) == false) {
				System.out.println("Kontot finns ej");
			} else {
				bank.removeAccount(idNr);
				System.out.println("Kontot " + idNr + "Är borttagen");
			}
		}

		// Skriva ut alla konton
		else if (choice == 8) {
			for (int i = 0; i < bank.getAllAccounts().size(); i++) {
				System.out.println(bank.getAllAccounts().get(i));
			}

		} else {
			System.out.println("Avslutat, välkommen åter!");

			System.exit(0);
		}
	}

//Hjälpmetod
	public static void printApplication() {

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("1. " + "Hitta ett konto utifrån innehavare");
		System.out.println("2. " + "Sök kontoinnehavare utifrån (del av) namn");
		System.out.println("3. " + "Sätt in");
		System.out.println("4. " + "Ta ut");
		System.out.println("5. " + "Överföring");
		System.out.println("6. " + "Skapa konto");
		System.out.println("7. " + "Ta bort konto");
		System.out.println("8. " + "Skriv ut konton");
		System.out.println("9. " + "Avsluta");
		System.out.println("Välj en siffra, gör ditt val! ");

	}

}
