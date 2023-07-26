import entities.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollar = sc.nextDouble();
        System.out.print("Amount to be paid in real(R$) = "+ String.format("%.2f", CurrencyConverter.dollarQuotation()));
        sc.close();
    }
}