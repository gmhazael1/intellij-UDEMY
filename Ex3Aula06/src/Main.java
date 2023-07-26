import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double mp;
        for (int i = 0;i < n;i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            mp = (a * 2.0 + b * 3.0 + c * 5.0)/10.0;
            System.out.printf("%.1f",mp);
        }

        sc.close();
    }
}