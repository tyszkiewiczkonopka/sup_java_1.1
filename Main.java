import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MAX_TRIES = 5;
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);

        System.out.println("Please choose an integer between 0 and 99");
        Scanner scanner = new Scanner(System.in);

        for (int maxTries = MAX_TRIES; maxTries > 0; maxTries--) {
            int guessedNumber = scanner.nextInt();

            if (numberToGuess == guessedNumber) {
                System.out.println("You guessed it!");
                break;
            }

            if (guessedNumber > numberToGuess) {
                System.out.println("Your number is GRATER than the one you are trying to guess");
            } else {
                System.out.println("Your number is LOWER than the one you are trying to guess");
            }

            if (maxTries == 1) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            } else {
                System.out.println("Please try again - you've got " + maxTries + " more tries left");
            }
        }

    }
}
