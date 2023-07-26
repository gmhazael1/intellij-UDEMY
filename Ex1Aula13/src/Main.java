import entities.Esfera;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Esfera calculus = new Esfera();
        calculus.radius = sc.nextDouble();
        System.out.println(calculus);
        sc.close();
    }
}