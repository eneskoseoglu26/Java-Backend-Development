import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        username = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if(username.equals("enescosovic26") && password.equals("12345678")) {
            System.out.println("Successfully logined!");
        } else {
            System.out.println("Login failed!");
            System.out.println("Do you want to reset your password?\n0-No\n1-Yes");
            System.out.print("Option : ");
            int option = input.nextInt();

            // `nextInt()` sonrası tamponu temizlemek için bir `nextLine()` ekliyoruz.
            input.nextLine();

            if(option == 1) {
                System.out.print("New password : ");
                password = input.nextLine();

                if(password.equals("12345678")) {
                    System.out.println("Password could not changed!");
                } else {
                    System.out.println("Password successfully changed!");
                }

            }

        }

    }
}
