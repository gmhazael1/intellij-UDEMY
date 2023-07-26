import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        palavra = palavra.replaceAll(" ","").toLowerCase();
        if (palavra.contentEquals(new StringBuilder(palavra).reverse())){
            System.out.println("É um palíndromo");
        }else {
            System.out.println("Não É um palíndromo");
        }
        sc.close();
    }
}