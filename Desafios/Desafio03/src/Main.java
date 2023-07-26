import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vet = new  double[3];
        System.out.print("Digite um valor para um lado do triângulo: ");
        vet[0] = sc.nextDouble();
        System.out.print("Digite um valor para outro lado do triângulo: ");
        vet[1] = sc.nextDouble();
        System.out.print("Digite um valor para outro lado do triângulo: ");
        vet[2] = sc.nextDouble();

        if ((vet[0] + vet[1] > vet[2]) && (vet[1] + vet[2] > vet[0]) && (vet[0] + vet[2] > vet[1])){
            System.out.println("É um triângulo válido");
        }else {
            System.out.println("Não é possível formar um triângulo");
        }
        sc.close();
    }
}