import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner input = new Scanner(System.in);

        System.out.print("Number of elements = " );
        n = input.nextInt();
        array = new int[n];

        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". element : ");
            array[i] = input.nextInt();
        }

        System.out.println("Array => " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array => " + Arrays.toString(array));
        
    }
}
