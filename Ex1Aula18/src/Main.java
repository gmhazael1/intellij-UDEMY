import entities.Numbers;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int quantity = sc.nextInt();
        Numbers[] vect = new Numbers[quantity];
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = new Numbers(number);
        }
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getNumber() < 0){
                System.out.println("NUMEROS NEGATIVOS: "+ vect[i].getNumber());
            }
        }
        sc.close();
    }
}