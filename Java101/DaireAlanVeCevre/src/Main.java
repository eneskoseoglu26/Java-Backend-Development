import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;

        System.out.print("Radius of circle : ");
        r = input.nextDouble();

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Perimeter = " + perimeter + "\nArea = " + area);

        System.out.print("Angle of circle slice :");
        int angle = input.nextInt();

        double sliceArea = (Math.PI * r * r * angle) / 360;
        System.out.println("Area of circle slice = " + sliceArea);

    }
}
