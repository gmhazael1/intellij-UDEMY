import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int mask = 0b100000;
        if ((x & mask) != 0){
            System.out.println("6th bit is true");
        }else {
            System.out.println("6th bit is false");
        }
        sc.close();
    }
}