import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Exercicio de Ler um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1;i <= x;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}