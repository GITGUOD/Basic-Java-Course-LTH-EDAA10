
public class MainChecksum {

	public static void main(String[] args) {

		/*CRC packet = new CRC(9);
		packet.printPacket();
		System.out.println(packet.packetAccepted());
		packet.toggleBits(2);
		System.out.println(packet.packetAccepted());
*/
		int falseAccepted = 0;

		int nbrOfPackages = 100000;

		for (int i = 0; i < nbrOfPackages; i++) {
			CRC test = new CRC(9);
			test.toggleBits(40);

			if (test.packetAccepted()) {
				falseAccepted++;
			}

		}
//		 Här ska kod läggas in som "tillverkar" 100 000 paket, lägger in fel i dem och
//		 räknar
//		 hur många av de felaktiga paketen som mottagaren tror är rätt. Ett tips: en
//		 for-sats
//		 är bra till detta. falseAccepted kan användas för att räkna antalet paket som
//		 accepteras av mottagaren fastän alla 100 000 paketen innehåller fel.

		System.out.println("Antal felaktiga som accepteras: " + falseAccepted);

	}

}
