import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		//Skillnaden, summan, produkten och kvoten
		double sum = nbr1 + nbr2;
		double skillnaden = nbr2 - nbr1;
		double produkten = nbr1*nbr2;
		double kvoten = nbr1/nbr2;
		System.out.println("Summan av talen är " + sum);
		System.out.println("skillnaden mellan två talen är " + skillnaden);
		System.out.println("produkten mellan talen är " + produkten);
		System.out.println("kvoten mellan talen är " + kvoten);
	}
}
