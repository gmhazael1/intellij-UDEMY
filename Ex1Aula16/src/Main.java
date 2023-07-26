import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de valor a ser inserido: ");
        int N = sc.nextInt();
        double[] alturas = new double[N];
        for (int i = 0; i < alturas.length; i++){
            alturas[i] = sc.nextDouble();
        }
        sc.close();
    }
}