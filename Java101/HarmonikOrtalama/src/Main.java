import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        double sum = 0;
        int n;

        System.out.print("Number of elements : ");
        n = input.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            array[i] = input.nextDouble();
        }

        for(int i = 0; i < n; i++) {
            sum += (1/array[i]);
        }

        System.out.println("Harmonical Average : " + (n/sum));

    }
}
