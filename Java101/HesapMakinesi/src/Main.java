import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("First number : ");
        int num1 = input.nextInt();
        System.out.print("Second number : ");
        int num2 = input.nextInt();

        System.out.print("1-Add\n2-Subtract\n3-Multiply\n4-Divide\nChoose an operation :");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;

            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                System.out.println(num2 + " - " + num1 + " = " + (num2-num1));
                break;

            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;

            case 4:
                if(num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                } else {
                    System.out.println("Can not divide by 0!");
                }
                break;

            default:
                System.out.println("\nAn invalid operation was chosen!");
        }



    }
}
