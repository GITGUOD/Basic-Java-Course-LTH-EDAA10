package myOwn;

import java.util.Scanner;

public class firstDayoOfSchool {

	private int playerStressLevel;
	private int choice;
	private int health;
	Scanner myScanner = new Scanner(System.in);

	public firstDayoOfSchool(int health, int psl) {
		playerStressLevel = psl;
		this.health = health;
	}

	// attributer, matar in konstruktorn, variabler

	public void playGame() { // för metoden firstDayoOfSchool
		System.out.println("\n-------------------------------\n");
		System.out.println(
				"You've applied for one of the most prestigious schools in Europe and luckily you've been accepted!");
		System.out.println(
				"Tomorrow is the first day of university and your school have chosen to teach only math this semester.");
		System.out.println("It is now 10pm and you're supposed to arrive early tomorrow to school!");
		System.out.println("Your friends however, begs you to play games with them...");
		System.out.println("What do you want to do?");
		System.out.println("1: Decline their request and sleep immediately");
		System.out.println("2: stay up and play with them");

		choice = myScanner.nextInt();
		if (choice == 1) {
			System.out.println(
					"Nice that you resisted! The pros are that you will get way more hours of sleep which will help you lots tomorrow, especially if there's a lot of new information to absorb!");
			System.out.println("Sure you missed the fun with your old buddies but there's always a next time!");
			System.out.println("\n-------------------------------\n");
			System.out.println("The alarm rings.....");
			System.out.print("It is now a Monday 8AM. ");
			System.out.println("You feel lively and it is now time to go to school!");
			System.out.println("Although you feel as if you could go right away to school, you feel hungry");
			System.out.print("What do you want to do?  ");
			System.out.println("1: Walk directly to school");
			System.out.println("2: Grab a sandwitch or something small that temporary fulls you before you go");

			choice = myScanner.nextInt();
			if (choice == 2) {
				System.out.println("After consuming the sandwhich, you feel a surge of energy out of nowhere");
				System.out.println("It feels as if you are capable of doing things which only superman is able to");
				System.out.println("Now when you're finished, what do you want to do? The answer is quite obvious!");
				System.out.println("1: Go to school");
				System.out.println("2: Stay home");

				choice = myScanner.nextInt();
				while (choice == 2) {
					System.out.println("Are you sure?");
					System.out.println(
							"Please press anything  else instead of 2: you have to go to school, there's no other logical answer than this");
					choice = myScanner.nextInt();
					if (choice != 2) {
						System.out.print("good choice my friend!");
						System.out.println(
								"Okay! Now that you've arrived at school with no issues but with a smile instead. ");
						System.out.print("It's now time for math!");
						System.out.println("You've chosen a place to sit and the teacher has started teaching");
						System.out.println("");
						System.out.println(
								"But before you sit down, you hear someone close to you say that the program will be quite tough and exhausting if you don't put the amount of work into it");
						System.out.println(
								"He claims that more than half of the students drop out the first semester due to the intense workload placed upon them");
						System.out.println("When you've heard that, what do you want to do?");
						System.out.println("");
						System.out.println("1: Sit calmy, listen and take notes");
						System.out.println("2: Sit down and think about something else");

						choice = myScanner.nextInt();
						if (choice == 1) {
							System.out.println(
									"Well thought, you've slept well, eaten well and now you've even chosen to pay attention and hopefully this will reward you greatly in the future");
							System.out.println("This will also ease up a bit of the stresslvls");
							playerStressLevel = playerStressLevel + 1;
							System.out.println("Your stress lvls: " + playerStressLevel);

							choice = myScanner.nextInt();
							if (choice == 2) {
								System.out.println(
										"Oh really, after very good decisions, as well as taking your time to come to the lesson, you now want to think about something else after going through all that, really proud of you man. ");
								System.out.println(
										"After roughly half of the session, the teacher screams loudly to pay attention because this course ain't easy to pass");
								System.out.println(
										"After getting reminded by the teacher, you pick your notes and start paying attention");
								System.out.println("Not bad actually, you get atleast something from this math lesson");
								System.out.println(
										"Unfortunately, there's nothing you can do about the past 45minutes that you missed by thinking about something else");
								playerStressLevel = playerStressLevel - 1;
								System.out.println("Your stress lvls: " + playerStressLevel);

							}

						}

					}

				}

			}

		}

		if (choice == 1) {
			System.out.println("Okay you've just arrived at school with no issues ");
			System.out.print("It is now time for math ");
			System.out.println("You've chosen a place to sit and the teacher has started teaching");
			System.out.println("");
			System.out.println(
					"But before you sit down, you hear someone close to you say that the program will be quite tough and exhausting if you don't put the amount of work into it");
			System.out.println(
					"He claims that more than half of the students drop out the first semester due to the intense workload placed upon them");
			System.out.println("When you've heard that, what do you want to do?");
			System.out.println("");
			System.out.println("1: Sit calmy, listen and take notes");
			System.out.println("2: Sit down and think about something else");
			System.out.println("3: Leave");

			choice = myScanner.nextInt();
			if (choice == 1) {
				System.out.println(
						"Well thought, you've chosen to pay attention and hopefully this will hopefully reward you in the near future");
				System.out.println("This will also ease up a bit of the stress level");
				playerStressLevel = playerStressLevel + 1;
				System.out.println("Your stress lvls: " + playerStressLevel);
				System.out.println(
						"However, due to not grabbing breakfast, you feel hungry and you lose focus midway through the class");
				System.out.println("Then your stomach starts growling");
				playerStressLevel = playerStressLevel - 1;
				System.out.println("Your stress lvls: " + playerStressLevel);
				System.out.println("You regret lightly over not staying home a few extra minutes to grab breakfast");

			} else if (choice == 2) {
				System.out.println(
						"Oh really, you took your time to come to the lesson just to think about something else, really proud of you man");
				System.out.println(
						"After roughly half of the session, the teacher screams loudly to pay attention because this course ain't easy to pass");
				System.out.println(
						"After getting reminded by the teacher, you pick your notes and start paying attention");
				System.out.println("Not bad actually, you get atleast something from this math lesson");
				System.out.println(
						"Unfortunately, there's nothing you can do about the past 45minutes that you missed by thinking about something else");
				playerStressLevel = playerStressLevel - 1;
				System.out.println("Your stress lvls: " + playerStressLevel);

			} else if (choice == 3) {
				System.out.println(
						"You've chosen the easy way out, your stress have gone up! This might punish you later if you don't start catch up before exams");
				playerStressLevel = playerStressLevel - 2;
				System.out.println("Your stress lvls: " + playerStressLevel);
			}

		}

		else

		{
			System.out.println("It's true that everyone needs some time to have fun");
			System.out.println("However, today is not that day my dear");
			System.out.println("\n-------------------------------\n");
			System.out.println("The alarm rings.....");
			System.out.println("It is now a Monday 8AM");
			System.out.println("You have a hard time waking up, feel dead, tired and it almost time for school!");
			System.out.println(
					"You decide to sleep a few minutes more, unfortunately those minutes turned into way more than a few minutes");
			System.out.println("You feel stressed due to the lesson almost starting while you are in bed");
			System.out.println("What do you want to do?");
			System.out.println("1: Skip school");
			System.out.println("2: Give up and smoke cigarettes");
			System.out.println("3: Run to school");

			choice = myScanner.nextInt();
			if (choice == 1) {
				System.out.println(
						"This was a very bad decision of yours.. I am afraid you'll miss too much information and this will lead to lots of stress as well as having a hard time at the beginning of the semester");
				playerStressLevel = playerStressLevel - 15;
				System.out.println(playerStressLevel);
				if (playerStressLevel < 1) {
					System.out.println("You've lost your mind, GameOver " + playerStressLevel);

				}
			} else if (choice == 2) {
				System.out.println("To miss school is one thing, but to also put your health at risk is just too much");
				playerStressLevel = playerStressLevel - 15;
				health = health - 5;
				System.out.println("Your stress lvls: " + playerStressLevel);
				System.out.print("Your health: " + health);
				if (playerStressLevel < 1 || health < 0) {
					System.out.println("GameOver");

				}
			} else if (choice == 3) {
				System.out.println("You run to school but you when you arrive, the time of the lesson's almost over");
				System.out.println(
						"Just as you thought the day couldn't get any worse, the door into class is locked and you can't get in");
				System.out.println(
						"Now, you're both hungry, tired and lost, maybe skipping school was the better choice afterall in that situation");
				System.out.println("Okay, what do you do now?");
				System.out.println("You can either");
				System.out.println("1: go home");
				System.out.println(
						"2: wait till the class is over and hopefully someone might share their notes with you");

				choice = myScanner.nextInt();
				if (choice == 1) {
					System.out.println("Well, I have no words for you...");
					playerStressLevel = playerStressLevel - 15;
					System.out.println("Your stress lvls: " + playerStressLevel);
					if (playerStressLevel < 1) {
						System.out.println(
								"GameOver, it's only the first day and you've created so much pressure on yourself");

					}
				} else {
					System.out.println(
							"Sadly most friendgroups are formed at the very first day and I am afraid that you've missed your chance");
					System.out.println("Your stress lvls: " + playerStressLevel);
					if (playerStressLevel > 1) {
						System.out
								.println("You tried atleast, well played anyways, now you know what to do next time!");

					}

				}

			}
		}
	}

}