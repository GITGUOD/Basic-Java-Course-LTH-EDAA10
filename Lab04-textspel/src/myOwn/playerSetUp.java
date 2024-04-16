package myOwn;

import java.util.Scanner;

public class playerSetUp {

	private int playerStressLevel;
	private String playerName;
	private int choice;
	private int health;
	Scanner myScanner = new Scanner(System.in);
	// attributer, matar in konstruktorn, variabler, samt en scanner

	public playerSetUp() { // konstruktor för metoden playerSetUp
		playerStressLevel = 15;
		health = 5;
	}

	public void enterName() {
		System.out.println("Your Stress Level: " + playerStressLevel);
		System.out.println("Your health: " + health);
		System.out.println("Please enter your name:");
		playerName = myScanner.nextLine(); // scannar och läser av vad du skriver och printar till nästa rad
	}

	public void playIntro() {
		System.out.println("Welcome " + playerName + ",let's start the game!");
		System.out.println("Do you know how the game works?");
		System.out.println("Yes?, type 1 ");
		System.out.println("No?, type 2 ");
		choice = myScanner.nextInt();
		if (choice == 2) {
			System.out.print(
					" This is a textbased game where the user chooses alternatives which might mimic a normal day at school ");
			System.out.println(
					" The goal of this game is to check how much stress you could create throughout one specific day at school");
			System.out.println("--------------Disclaimer!--------------");
			System.out.print("All choices matter in this game! Choose carefully, good luck!");

		} else {
			System.out.print("Alright, let's continue!");
		}
		
		
	}
	public int returnHealth() {
		return health;
	}
	public int returnPlayerStressLvl() {
		return playerStressLevel;
	}
}
