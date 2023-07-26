import entities.CalculoVetor;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        CalculoVetor[] vetc = new CalculoVetor[n];
        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];
        System.out.printf("Digite os valores para o vetor A: %n");
        for (int i = 0; i < vetc.length; i++){
            vetA[i] = sc.nextInt();
        }

        System.out.printf("Digite um valor para o vetor B: %n");

        for (int i = 0; i < vetc.length; i++){
            vetB[i] = sc.nextInt();

        }
        
        for (int i = 0; i < vetc.length; i++){
            vetC[i] = vetA[i] + vetB[i];
            vetc[i] = new CalculoVetor(vetA, vetB);
        }

        System.out.printf("VALOR RESULTANTE: %n");

        for (int i = 0; i < vetc.length; i++){
            System.out.printf("%d%n", vetC[i]);
        }
        sc.close();
    }
}