import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("1 para Cachorro Quente valor R$4,00%n");
        System.out.printf("2 para X Salada valor R$4,50%n");
        System.out.printf("3 para X Bacon valor R$5,00%n");
        System.out.printf("4 para Torrada Simples valor R$2,00%n");
        System.out.printf("5 para Refrigerante valor R$1,50%n");
        System.out.printf("Digite o código do item: ");
        int cod = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int quant = sc.nextInt();
        double total;
        if (cod == 1){
            total = quant * 4.00;
            System.out.printf("Total: %.2f%n",total);
        } else if (cod == 2) {
            total = quant * 4.50;
            System.out.printf("Total: %.2f%n",total);
        } else if (cod == 3) {
            total = quant * 5.00;
            System.out.printf("Total: %.2f%n",total);
        } else if (cod == 4) {
            total = quant * 2.00;
            System.out.printf("Total: %.2f%n",total);
        } else if (cod == 5) {
            total = quant * 1.50;
            System.out.printf("Total: %.2f%n",total);
        }else {
            System.out.println("Opção Invalida");
        }
        sc.close();
    }
}