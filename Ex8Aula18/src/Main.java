import entities.MediaPares;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int numeroDePares = 0;
        double mediaDosPares = 0.0;
        MediaPares[] medias = new MediaPares[n];
        for (int i = 0; i < medias.length; i++){
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            medias[i] = new MediaPares(num);

            if (medias[i].getNum() % 2 == 0){
                mediaDosPares += medias[i].getNum();
                numeroDePares++;
            }
        }
        mediaDosPares = mediaDosPares / numeroDePares;
        if (numeroDePares == 0){
            System.out.print("NENHUM NUMERO PAR.");
        }else {
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaDosPares);
        }
        sc.close();
    }
}