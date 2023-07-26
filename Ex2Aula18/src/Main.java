import entities.Soma;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int quantity = sc.nextInt();
        Soma[] vect = new Soma[quantity];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            double numbers = sc.nextDouble();
            vect[i] = new Soma(numbers);
        }
        System.out.printf("VALORES = ");
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ",vect[i].getNumbers());
            soma += vect[i].getNumbers();
        }
        System.out.printf("%nSOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", (soma / vect.length));
        sc.close();
    }
}