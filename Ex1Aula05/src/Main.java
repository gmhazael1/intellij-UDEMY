import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0,num;
        for (int i = 0;i < n;i++){
            num = sc.nextInt();
            total += num;
        }
        System.out.println("soma: "+total);
        System.out.println("n: "+n);
        sc.close();
    }
}