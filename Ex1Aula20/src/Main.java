import entities.Pensionato;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms  will be rented? ");
        int n = sc.nextInt();
        Pensionato[] pensionato = new Pensionato[10];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            if (room >= 1 && room <= 10){
                pensionato[room - 1] = new Pensionato(name, email, room);
            }else {
                System.out.print("Invalid room number");
            }
        }
        System.out.print("Busy rooms: %n");
        for (int i = 0; i < pensionato.length; i++){
            if (pensionato[i] != null){
                System.out.printf("%d: %s, %s%n", pensionato[i].getRooms(), pensionato[i].getName(), pensionato[i].getEmail());
            }
        }
        sc.close();
    }
}