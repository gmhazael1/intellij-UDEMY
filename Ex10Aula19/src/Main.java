import entities.Pessoas;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        double media;
        Pessoas[] pessoas = new Pessoas[n];
        for (int i = 0; i < pessoas.length;  i++){
            sc.nextLine();
            System.out.print("Digite nome, primeira e segunda nota do 1o aluno: \n");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            pessoas[i] = new Pessoas(nome, nota1, nota2);
        }
        System.out.print("\nAlunos aprovados:\n");
        for (int i = 0; i < pessoas.length; i++){
            media = (pessoas[i].getNota1() + pessoas[i].getNota2()) / 2;
            if (media >= 6.0){
                System.out.printf("%s%n", pessoas[i].getNome());
            }
        }
        sc.close();
    }
}