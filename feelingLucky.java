package feelinglucky;
import java.util.Scanner;

public class FeelingLucky {
    public static void main(String[] args) {
System.out.print("Welcome to 'Feeling Lucky' \n"
        + "Mechanics of the game: Enter your guess from the digits 1 to 100. You have 10 trials.\n"
        + "If you guessed it right, then idk here's a cookie. \n"
        + "If not, then guess again. ");

Scanner scan = new Scanner(System.in); //scanner

int number = 1 + (int)(100 * Math.random()); //number generator
int x = 10, i, guess; // x = number of tries, guess = estimation

    for (i = 0; i < x; i++) {
    System.out.print(" \n"
            + "Enter a digit from 1 to 100: ");
    guess = scan.nextInt();
    
    if (number == guess) {
        System.out.println("Galing! pwede ka na tumaya sa lotto.");
    break;   
    } else if (number > guess && i != x - 1) {
        System.out.println("Guess higher than " + guess);   
    } else if (number < guess && i != x - 1) {
        System.out.println("Guess lower than " + guess);
    }
      else if (guess != x) {
        System.out.println("You have ran out of guesses. ");
        System.out.println("The digit is " + number);
    }
    }
    }
}
