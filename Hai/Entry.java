package Hai;

public class Entry {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("Hai", 45000, 7);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Nghia", 65000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}