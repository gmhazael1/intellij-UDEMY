import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número equivalente ao dia da semana: ");
        int n1 = sc.nextInt();
        switch (n1){
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunga-Feira");
                break;
            case 3:
                System.out.println("Dia da semana: Terça-Feira");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta-Feira");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta-Feira");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta-Feira");
                break;
            case 7:
                System.out.println("Dia da semana: Sábado");
                break;
            default:
                System.out.println("Dia da semana: Valor Inválido");
                break;
        }
        sc.close();
    }
}