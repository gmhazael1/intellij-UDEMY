import java.util.Scanner;
import entities.Employee;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee Func = new Employee();
        System.out.print("Name: ");
        Func.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        Func.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        Func.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + Func);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        Func.IncreaseSalary(percent);
        System.out.println("Updated data: " + Func);
        sc.close();
    }
}