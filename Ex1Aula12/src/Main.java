import java.util.Scanner;
import entities.retangulo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        retangulo valor = new retangulo();
        System.out.println("Enter rectangle width and height: ");
        valor.Width = sc.nextDouble();
        valor.Height = sc.nextDouble();

        System.out.println("AREA: "+valor.Area());
        System.out.println("PERIMETER: "+valor.Perimeter());
        System.out.println("DIAGONAL: "+valor.Diagonal());
        sc.close();
    }
}