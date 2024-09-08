import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Number : ");
        number = input.nextInt();

        int x = checkPalindrome(number);

        if(x == number) {
            System.out.println(number + " is a palindromic number!");
        } else {
            System.out.println(number + " is not a palindromic number!");
        }

    }

    static int checkPalindrome(int number) {
        int x = 0;

        x = number % 10;
        number /= 10;

        while(number != 0) {
            x = (x * 10) + (number % 10);
            number /= 10;
        }

        return x;

    }

}

