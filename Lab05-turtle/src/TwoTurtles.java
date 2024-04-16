import java.util.Random;
import se.lth.cs.pt.window.SimpleWindow;

public class TwoTurtles {

	public static void main(String[] args) {
		Random slumpmässigt = new Random();
		SimpleWindow w = new SimpleWindow(600, 600, "TurtleDrawSquare");
		Turtle turtle1 = new Turtle(w, 250, 250); // Gör ett ny objekt som kallas för t2 men som anropar metoden turtle
		Turtle turtle2 = new Turtle(w, 350, 350); // Start positioner för båda sköldpaddorna t1 och t2 som ritas på
													// simplewindow W
		
		//Global variabel är när en variabel kan nås i hela klassen medan en lokal variabel är en variabel som endast kan nås i en metod

		turtle1.penDown(); // ritning för turtle 1
		turtle2.penDown(); // Här sker också ritningen för turtle 2
		while (Math.sqrt(
				Math.pow(turtle2.getX() - turtle1.getX(), 2) + Math.pow(turtle2.getY() - turtle1.getY(), 2)) >= 50) {
			// pythogoras sats
			// Whileloop, snurrar tills vandringen avslutas när avståndet mellan de båda
			// sköldpaddorna är mindre eller lika med 50 pixlar
			turtle1.forward(slumpmässigt.nextInt(10) + 1); // Rakt
			turtle1.left(slumpmässigt.nextInt(360) - 180);
			turtle2.forward(slumpmässigt.nextInt(10) + 1); // Rakt
			turtle2.left(slumpmässigt.nextInt(360) - 180); // slumpmässigt steg och göra en slumpmässig vridning
			SimpleWindow.delay(20); // En delay, gör den långsammare

		}
	}
}