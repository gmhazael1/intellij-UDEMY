import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = 1;i <= n;i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}