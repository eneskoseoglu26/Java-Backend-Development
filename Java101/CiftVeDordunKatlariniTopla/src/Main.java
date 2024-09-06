import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        System.out.print("Enter a number : ");
        number = input.nextInt();

        while(!(number % 2 == 1)) {

            if (number % 4 == 0) {
                total += number;
            }

            System.out.print("Enter a number : ");
            number = input.nextInt();

        }

        System.out.println("You entered an odd number!");
        System.out.println("Sum of numbers that are multiples of 4 : " + total);

    }

}
