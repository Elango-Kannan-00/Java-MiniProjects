import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Generate random number between 1 and 100
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Guess a number between 1 and 100 (or -1 to quit):");

        boolean stopGame = true;
        while (stopGame) {
            int userNumber = scan.nextInt();

            // Leaving the game
            if (userNumber == -1) {
                System.out.println("Game exited. The number was: " + randomNumber);
                break;
            }

            if (randomNumber == userNumber) {
                System.out.println("Hurray!.. You guessed right.");
                stopGame = false;
            } else if (userNumber > randomNumber) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Too low! Try again:");
            }
        }
        scan.close();
    }
}
