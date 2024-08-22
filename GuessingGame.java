import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.random.*;

public class GuessingGame {
    public static void main(String[] args) {
        // generates a random number between 1 - 100
        int answer = (int) (Math.random() * 100) + 1;

        // Number of tries the user has to guess the number
        int i = 8;

        String[] compliments = {
                "Your wasting oxygen",
                "Stupid",
                "delete yourself",
                "you can do it",
                "Better luck next time",
                "BOZO",
                "BUM",
        };

        Random random = new Random();

        // Scanner object that reads the user input
        Scanner input = new Scanner(System.in);

        // to check if the user has guessed the number
        boolean correct = false;

        System.out.println("Pick a number between 1 and 100");

        // reads the input and checks if its right
        while (i > 0) {
            System.out.println("Enter your number: ");

            int guess = input.nextInt();

            // Prints the congradulation message if guessed correctly
            if (guess == answer) {
                System.out.println("You guessed the number \nYou Win\n");
                correct = true;
                break;
            }
            // if user guesses to high print this message
            else if (guess > answer) {
                System.out.println("You guessed to high, you have " + (i - 1) + " tries left");
                int index = random.nextInt(compliments.length);

                System.out.println(compliments[index]);
            }
            // If user guesses to low print this message5

            else {
                System.out.println("You guessed to low, you have " + (i - 1) + " tries left");
                int index = random.nextInt(compliments.length);

                System.out.println(compliments[index]);
            }
            i--;
            if (i == 0) {
                System.out.println("");
            }
        }

        // if the user fails print this message
        if (correct == false) {
            System.out.println("You have ran out of tries. \nYou Lose");
            System.out.println("The number is " + answer);
        }
    }
}