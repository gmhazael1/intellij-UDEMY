import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        if (n1 > 0.00 && n1 <= 25.00){
            System.out.println("Intervalo [0,25]");
        } else if (n1 > 25.00 && n1 <= 50.00) {
            System.out.println("Intervalo [25,50]");
        } else if (n1 > 50.00 && n1 <= 75.00) {
            System.out.println("Intervalo [50,75]");
        } else if (n1 > 75.00 && n1 <= 100.00) {
            System.out.println("Intervalo [75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}