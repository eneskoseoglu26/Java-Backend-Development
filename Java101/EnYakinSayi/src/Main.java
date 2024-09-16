import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {33,5,10,-5,2,-12,22};
        int number;
        int bigClose, smallClose;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        System.out.println(Arrays.toString(array));
        bigClose = Integer.MAX_VALUE;
        smallClose = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(bigClose > array[i] && array[i] > number) {
                bigClose = array[i];
            }

            if(array[i] < number && array[i] > smallClose) {
                smallClose = array[i];
            }
        }

        System.out.println("Closest number in array less than " + number + " = " + smallClose);
        System.out.println("Closest number in array bigger than " + number + " = " + bigClose);

    }
}
