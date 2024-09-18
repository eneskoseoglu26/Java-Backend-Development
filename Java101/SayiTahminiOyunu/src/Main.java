import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(100);;
        int lives = 5;
        int guess;
        boolean correct = false;

        while((lives != 0) && !correct) {
            System.out.println("\nLives : " + lives);
            System.out.print("Guess : ");
            guess = input.nextInt();

            if(guess == number) {
                correct = true;
            } else {
                if (guess < number) {
                    System.out.println(guess + " is less than the secret number!");
                } else {
                    System.out.println(guess + " is greater than the secret number!");
                }
                lives--;
            }
        }

        if(correct) {
            System.out.println("Guess is correct! You WON!");
        } else {
            System.out.println("All guesses were wrong you LOST!");
        }
        System.out.println("Number was : " + number);
    }
}
