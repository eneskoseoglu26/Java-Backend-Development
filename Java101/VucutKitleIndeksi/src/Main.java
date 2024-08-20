import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height,weight;

        System.out.print("Height : ");
        height = input.nextDouble();

        System.out.print("Weight : ");
        weight = input.nextDouble();

        double bmi = (weight) / (height*height);
        System.out.println("BMI : " + bmi);


    }
}
