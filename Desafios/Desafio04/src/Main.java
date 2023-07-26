import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        if (nota >= 7.00){
            System.out.println("Aprovado");
        } else if (nota >= 5.00 && nota <= 6.99) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}