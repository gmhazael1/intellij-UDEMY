import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora inicial do jogo (formato 24 horas): ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite a hora final do jogo (formato 24 horas): ");
        int horaFinal = sc.nextInt();
        int duracao;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else {
            duracao = 24 - horaFinal + horaInicial;
        }
        System.out.printf("O jogo Durou %d Hora(s)",duracao);
        sc.close();
    }
}