import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número par ou impar: ");
        int n1 = sc.nextInt();
        if (n1 % 2 ==0){
            System.out.println("Número PAR");
        }else{
            System.out.println("Número IMPAR");
        }
    }
}