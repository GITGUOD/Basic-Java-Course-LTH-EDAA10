
public class Customer {

	private String name;
	private long idNr;
	private static int customer = 0;
	private int kundnummer;

	/**
	 * Skapar en kund (kontoinnehavare) med namnet 'name' och id-nummer 'idNr'.
	 * Kunden tilldelas också ett unikt skundnummer.
	 */
	public Customer(String name, long idNr) {
		this.name = name;
		this.idNr = idNr;
		this.kundnummer = customer;
		customer++;
		// Varje kund har en unik kundnummer
	}
	

	/** Tar reda på kundens namn. */
	public String getName() {

		return name;

	}

	/** Tar reda på kundens personnummer. */
	public long getIdNr() {

		return idNr;

	}

	/** Tar reda på kundens kundnummer. */
	public int getCustomerNr() {

		return kundnummer;
	}

	/** Returnerar en strängbeskrivning av kunden. */
	public String toString() {

		return name + " id: " + idNr + " kundnummer: " + kundnummer;

	}

}
