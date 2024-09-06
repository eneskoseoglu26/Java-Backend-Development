import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total = 0;
        int count = 0;

        System.out.print("Enter a number : ");
        number = input.nextInt();


        for(int i = 1; i <= number; i++) {

            if(i % 12 == 0) {
                count++;
                total += i;
            }

        }

        System.out.println("\nThe average of numbers between 1 and " + number + " that are divisible by 3 and 4 : 1" + total/count);

    }
}
