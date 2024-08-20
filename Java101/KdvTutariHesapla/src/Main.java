import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        double taxRate;

        System.out.print("Price = ");
        price = input.nextInt();

        if(price > 0 && price < 1000) {
            taxRate = 0.18;
        } else {
            taxRate = 0.08;
        }

        double taxAmount = price * taxRate;
        price += taxAmount;
        System.out.println("Tax rate : " + taxRate);
        System.out.println("Tax amount : " + taxAmount);
        System.out.println("New price = " + price);

    }
}
