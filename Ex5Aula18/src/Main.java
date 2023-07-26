import entities.Numeros;

import java.util.Scanner;
import java.util.stream.DoubleStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        Numeros[] num = new Numeros[n];
        double maiorValor = Double.MIN_VALUE;
        int posicaoMaiorValor = -1;
        for (int i = 0; i < num.length; i++){
            sc.nextLine();
            System.out.printf("%nDigite um numero: ");
            double nums = sc.nextInt();
            if (nums > maiorValor){
                maiorValor = nums;
                posicaoMaiorValor = i;
            }
            num[i] = new Numeros(nums);
        }
        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
        System.out.printf("MAIOR VALOR = %d%n", posicaoMaiorValor);
        sc.close();
    }
}