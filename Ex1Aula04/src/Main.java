import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        int senhaCorreta = 2002;

        while (senha!=senhaCorreta){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
            if (senha == senhaCorreta){
                System.out.println("Acesso Permitido");
            }
        }

        sc.close();
    }
}