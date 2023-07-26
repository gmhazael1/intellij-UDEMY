import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int total = 0;
        while (n1!=0){
            total += n1;
            n1 = sc.nextInt();
        }
        System.out.print("soma: "+total);
        sc.close();
    }
}