import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double n1,n2,div;

        for (int i = 0;i < n; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n2 == 0){
                System.out.println("divisao impossivel");
            }else {
                System.out.printf("%.1f%n",n1 / n2);
            }
        }
        sc.close();
    }
}