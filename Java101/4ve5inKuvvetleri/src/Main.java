import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for(int i = 1, j = 1;i < number || j < number; i *= 4, j*=5) {
            if(j > number) {
                System.out.println(i + "\t-");
            } else {
                System.out.println(i + "\t" + j);
            }
        }

    }

}
