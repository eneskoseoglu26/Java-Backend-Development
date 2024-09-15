import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection_1 = 0,selection_2;
        Boxer boxer_1 = null;
        Boxer boxer_2 = null;

        System.out.println("-----WELCOME TO THE BOXING GAME-----\n");
        System.out.println("Select 2 Boxers from the list to FIGHT!\n");

        for(int i = 0; i < 2; i++) {
            boxerList();
            System.out.print("Choose : ");
            if(i == 0) {
                selection_1 = getValidInput(input);
                boxer_1 = chooseBoxer(selection_1);
                System.out.println("\n" + boxer_1.getName() + " VS ??????\n");
            } else {
                selection_2 = getValidInput(input);
                while(selection_1 == selection_2) {
                    System.out.println("Please choose a different BOXER!");
                    System.out.print("Choose : ");
                    selection_2 = getValidInput(input);
                }
                boxer_2 = chooseBoxer(selection_2);
                System.out.println("\n" + boxer_1.getName() + " VS " +  boxer_2.getName() + "\n");
            }
        }

        Ring ring = new Ring(boxer_1,boxer_2);
        ring.fight();

    }

    public static void boxerList() {
        System.out.println("Boxer List :");
        System.out.println("1-Name: Rocky Balboa\t\tHealth: 100\tDamage:16\tWeight: 80\tBlock Chance : 35");
        System.out.println("2-Name: Mike Tyson\t\t\tHealth: 100\tDamage:20\tWeight: 110\tBlock Chance : 25");
        System.out.println("3-Name: Apollo Creed\t\tHealth: 100\tDamage:22\tWeight: 100\tBlock Chance : 28");
        System.out.println("4-Name: Ivan Drago\t\t\tHealth: 100\tDamage:18\tWeight: 85\tBlock Chance : 30");
        System.out.println("5-Name: Muhammad Ali\t\tHealth: 100\tDamage:24\tWeight: 83\tBlock Chance : 31");
        System.out.println("6-Name: Floyd Mayweather\tHealth: 100 Damage:21\tWeight: 115\tBlock Chance : 22");
    }

    public static Boxer chooseBoxer(int selection) {
        Boxer boxer;

        switch (selection) {
            case 1:
                boxer = new Boxer("Rocky Balboa",100,16,80, 35);
                break;
            case 2:
                boxer = new Boxer("Mike Tyson",100,20,110, 25);
                break;
            case 3:
                boxer = new Boxer("Apollo Creed",100,22,100, 28);
                break;
            case 4:
                boxer = new Boxer("Ivan Drago",100,18,85, 30);
                break;
            case 5:
                boxer = new Boxer("Muhammad Ali",100,24,83, 31);
                break;
            case 6:
                boxer = new Boxer("Floyd Mayweather",100,21,115, 22);
                break;
            default:
                System.out.println("Invalid selection, please try again.");
                return null;
        }

        return boxer;
    }

    public static int getValidInput(Scanner input) {
        while (true) {
            try {
                int selection = input.nextInt();
                if (selection >= 1 && selection <= 6) {
                    return selection;
                } else {
                    System.out.println("Please choose a valid boxer number (1-6): ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                input.next(); // Clear invalid input
            }
        }
    }

}
