import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int n1 = sc.nextInt();

        while (n1!=4){
            if (n1 == 1){
                alcool++;
            } else if (n1==2) {
                gasolina++;
            } else if (n1==3) {
                diesel++;
            }
            n1 = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool:"+alcool);
        System.out.println("Gasolina:"+gasolina);
        System.out.println("Diesel:"+diesel);
        sc.close();
    }
}