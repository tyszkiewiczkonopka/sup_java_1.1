import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an integer between 0 and 99");
        int guessedNumber = scanner.nextInt();
        int maxTries = 5;
        int numberOfTries = 0;

        if (guessedNumber == numberToGuess) {
            System.out.println("You guessed it!");
        }

        while (numberToGuess != guessedNumber && maxTries > 1) {
            maxTries--;
            numberOfTries++;

            if (guessedNumber > numberToGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
            } else {
                System.out.println("Your number is LOWER than the one you are trying to guess");
            }
            System.out.println("Please try again - you've got " + maxTries + " more tries left");
            guessedNumber = scanner.nextInt();
        }

        if (maxTries == 1) {
            System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
        }

    }
}
