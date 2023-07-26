import java.util.Scanner;
import entities.Number;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        Number[] vect = new Number[n];
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Digite um numero: ");
            double nums = sc.nextInt();
            vect[i] = new Number(nums);
        }
        System.out.printf("NUMEROS PARES: %n");
        int pares = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getNums() % 2 == 0){
                System.out.print(vect[i].getNums() + " %n");
                pares++;
            }
        }
        System.out.printf("QUANTIDADE DE PARES = %d", pares);
        sc.close();
    }
}