import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double edge1,edge2,edge3;

        System.out.print("First edge length : ");
        edge1 = input.nextDouble();
        System.out.print("Second edge length : ");
        edge2 = input.nextDouble();
        System.out.print("Third edge length : ");
        edge3 = input.nextDouble();

        /* Formula is
            u = (a+b+c)/2
            area * area = u * (u-a) * (u-b) * (u-c)
         */

        double u = (edge1 + edge2 + edge3) / 2;
        double area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));

        System.out.println("Perimeter = " + (edge1 + edge2 + edge3) + "\nArea = " + area);

    }
}
