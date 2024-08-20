import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,opening = 10;
        double kmPrice = 2.2;

        System.out.print("What is the distance between arrival point?(km) : ");
        km = input.nextInt();

        double total = (km * kmPrice) + opening;

        if(total < 20) {
            System.out.println("Total is " + total + " but you have to pay minimum price\nTotal = " + 20);
        } else {
            System.out.println("Total = " + total);
        }

    }
}
