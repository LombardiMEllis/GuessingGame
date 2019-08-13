import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("I'm thinking of a number between 1 and 20... ");
		
		int compNum = 15;
		int playerGuess = 0;
		
		System.out.println("What do you think it is? ");
		
		Scanner in = new Scanner(System.in);
		playerGuess = in.nextInt();
		
		System.out.println("You guessed " + playerGuess);
		if (compNum == playerGuess){
			System.out.println("Congratulations! That's correct!");
		} else {
			System.out.println("Oo, too bad!");
		}

	}

}
