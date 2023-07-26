import java.util.Scanner;
import entities.Bank;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Is there an initial deposit (y/n)? ");
        String initialDepositChoice = sc.next();
        double depositInitial = 0.0;

        if (initialDepositChoice.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit amount: ");
            depositInitial = sc.nextDouble();
            Bank bank = new Bank(accountNumber, accountHolder, depositInitial);
        }else {
            Bank bank = new Bank(accountNumber, accountHolder);
        }

        Bank bank = new Bank(accountNumber, accountHolder, depositInitial);

        System.out.println("\n" + bank);

        System.out.print("\nEnter a deposit amount: ");
        double depositAmount = sc.nextDouble();
        bank.depositAcc(depositAmount);
        System.out.println("Updated account data: ");
        System.out.println("\n" + bank);

        System.out.print("Enter a withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        bank.withdrawAcc(withdrawalAmount);
        System.out.println("Updated account data: ");
        System.out.println("\n" + bank);

        sc.close();
    }
}
