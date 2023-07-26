import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp,fahrenheit;
        String resposta;
        do {
            System.out.print("Digite a temperatura em celcius: ");
            temp = sc.nextDouble();
            fahrenheit = (temp * 1.8) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Quer continuar ('s' ou 'n'): ");
            resposta = sc.next();
        }while (resposta .equals("s"));

        sc.close();
    }
}