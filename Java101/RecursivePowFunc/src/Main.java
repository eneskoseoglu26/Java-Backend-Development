import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base, power;
        Scanner input = new Scanner(System.in);

        System.out.print("Base number? => (x^y), x = ");
        base = input.nextInt();

        System.out.print("Power number? => (x^y), y = ");
        power = input.nextInt();

        System.out.println(base + "^" + power + " = " + calculatePow(base,power));

    }

    static int calculatePow(int base, int power) {

        if(power == 0) {
            return 1;
        }

        return base * calculatePow(base, power - 1);

    }

}
