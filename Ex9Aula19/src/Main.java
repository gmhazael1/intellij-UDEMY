import entities.Pessoas;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        int idadeMaisVelha = 0;
        Pessoas[] pessoas = new Pessoas[n];
        for (int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:%n",i);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoas(nome, idade);

            if (idade > idadeMaisVelha){
                idadeMaisVelha = idade;
            }
        }
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() == idadeMaisVelha){
                System.out.printf("PESSOA MAIS VELHA: %s%n", pessoas[i].getNome());
                break;
            }
        }
        sc.close();
    }
}