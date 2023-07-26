import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua Idade: ");
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.println("Pode acessar o conteúdo");
        }else {
            System.out.println("Acesso restrito");
        }
        sc.close();
    }
}