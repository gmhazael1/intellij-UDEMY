import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0,out = 0;
        for(int i = 0; i <= n;i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else {
                out++;
            }
            System.out.printf("%d in%n",in);
            System.out.printf("%d out",out);
        }

        sc.close();
    }
}