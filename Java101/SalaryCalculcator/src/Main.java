import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE SALARY CALCULATOR\n-------------------");
        System.out.println("Please enter information about employee\n");
        System.out.print("Name : ");
        String name = input.nextLine();
        System.out.print("Salary : ");
        double salary = input.nextInt();
        System.out.print("Working Hours : ");
        int workHours = input.nextInt();
        System.out.print("Hire Year : ");
        int hireYear = input.nextInt();

        System.out.println("---------------------");
        Employee employee = new Employee(name,salary,workHours,hireYear);
        System.out.println("\n" + employee.toString());
        System.out.println("Tax : " + employee.tax());
        System.out.println("Bonus : " + employee.bonus());
        System.out.println("Raise : " + employee.raiseSalary());
        System.out.println("Total Salary  : " + (salary - employee.tax() + employee.bonus() + employee.raiseSalary()));

    }
}
