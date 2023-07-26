import entities.Media;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double media = 0.0;
        Media[] numeros = new Media[n];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            numeros[i] = new Media(num);
            media += numeros[i].getNum();
        }
        media = media / numeros.length;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.printf("ELEMENTOS ABAIXO DA MEDIA: %n");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i].getNum() < media){
                System.out.printf("%.1f%n", numeros[i].getNum());
            }
        }
        sc.close();
    }
}