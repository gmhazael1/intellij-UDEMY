import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor de x: ");
        double x = sc.nextDouble();
        System.out.print("digite o valor de y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("ORIGEM");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        }else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        sc.close();
    }
}
