import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double sal = sc.nextDouble();
        double imposto;
        if (sal <= 2000.00){
            System.out.println("INSENTO");
        } else if (sal <= 3000.00) {
            imposto = (sal - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n",imposto);
        } else if (sal <= 4500.00) {
            imposto = (sal - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n",imposto);
        } else{
            imposto = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n",imposto);
        }
        sc.close();
    }
}