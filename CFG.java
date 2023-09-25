
import java.util.Scanner;

public class CFG {

	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100* Math.random());
							

		int K = 5;

		int i, guess;

		System.out.println("Welcome to guess number game");

System.out.println("You will be asked to guess a number to win the game");
System.out.println("You have maximum 5 attempts limit");



		
		for (i = 0; i < K; i++) {

			System.out.println("Enter a Guess number bwtween 1 to 100:");
                       guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (number < guess && i != K - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println("You have exhausted"+ " K trials.");

			System.out.println("The number was " + number);
		}
	}

	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
