import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 100) + 1; //generate a # between 1 to 100
        int guess;
        int numGuesses = 0;

        do {
            System.out.println("Guess the number I'm thinking of. "
                            + "It's between 1 and 100. ");
            guess = input.nextInt();
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("Too small!");
            } else if (guess > secretNumber) {
                System.out.println("Too large!");
            } else {
                System.out.println("Correct guess!");
            }
        } while (guess != secretNumber);
        System.out.println("Number of guesses: " + numGuesses);
    }}

