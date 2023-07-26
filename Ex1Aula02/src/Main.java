import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos minutos foi usado: ");
        int min = sc.nextInt();
        double total;
        if (min < 100){
            System.out.println("Valor a pagar R$ 50,00");
        } else{
            total = (min - 100) * 2.00 + 50.00;
            System.out.printf("Valor a pagar R$ %.2f%n",total);
        }
        sc.close();
    }
}