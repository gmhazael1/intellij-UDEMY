import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int higher = max(n1, n2, n3);

        showResult(higher);
    }

    public static int max(int a, int b, int c){
        int maior;
        //estrutura de decisão que mostra o maior numero digitado pelo usuario.
        if (b > a && b > c){
            maior = b;
        }else if (c > a && c > b){
            maior = c;
        } else{
            maior = a;
        }

        return maior;
    }

    public static void showResult(int value){
        System.out.print("Higher: "+value);
    }

}