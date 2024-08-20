import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double apple=2.14,tomato=3.67,banana=1.11,eggplant=5,pear=0.95;
        double appleKg,tomatoKg,bananaKg,eggplantKg,pearKg;

        System.out.println("Price List");
        System.out.println("Apple : " + apple + "\nTomato : " + tomato + "\nBanana : " + banana + "\nPear : " + pear + "\nEggplant : " + eggplant);

        System.out.print("How many kilos of apples :");
        appleKg = input.nextDouble();
        System.out.print("How many kilos of tomatoes :");
        tomatoKg = input.nextDouble();
        System.out.print("How many kilos of bananas :");
        bananaKg = input.nextDouble();
        System.out.print("How many kilos of eggplants :");
        eggplantKg = input.nextDouble();
        System.out.print("How many kilos of pears :");
        pearKg = input.nextDouble();

        double total = (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplantKg * eggplant) + (pear * pearKg);
        System.out.println("Total amount = " + total);

    }
}
