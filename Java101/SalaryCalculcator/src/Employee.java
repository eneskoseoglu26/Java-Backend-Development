public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if(salary >= 1000) {
            double taxPrice = salary * 0.03;
            return taxPrice;
        }
        return 0;
    }

    public double bonus() {
        if(workHours > 40) {
            double bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary() {
        int workingYear = 2024 - hireYear;
        double raise = 0;
        if(workingYear < 10) {
            raise = salary * 0.05;
        } else if(workingYear >= 10 && hireYear < 20) {
            raise = salary * 0.1;
        } else if(workingYear >= 20) {
            raise = salary * 0.15;
        }
        return raise;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nSalary : " + salary +
                "\nWork Hours : " + workHours +
                "\nHire Year : " + hireYear;
    }
}
