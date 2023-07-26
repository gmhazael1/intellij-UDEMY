import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é impar");
        }
        sc.close();
    }
}