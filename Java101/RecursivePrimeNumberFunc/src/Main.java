import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        if(isPrime(number,number/2)) {
            System.out.println(number + " is a PRIME NUMBER!");
        } else {
            System.out.println(number + " is not a prime number!");
        }


    }

    static boolean isPrime(int number, int div) {

        if(div == 1) {
            return true;
        } else if (number % div == 0) {
            return false;
        }

        return isPrime(number,div - 1);

    }

}
