import entities.Altura;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o numero de pessoas: ");
        int N = sc.nextInt();
        Altura[] pessoas = new Altura[N];
        for (int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + i + "º pessoa: ");
            String nome = sc.nextLine();
            double idade = sc.nextDouble();
            double altura =sc.nextDouble();
            pessoas[i] = new Altura(nome, idade, altura);
        }

        double alturaMedia = 0.0;
        int pessoasMenorDe16 = 0;

        for (int i = 0; i < pessoas.length; i++){
            alturaMedia += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16){
                pessoasMenorDe16++;
            }
        }
        System.out.printf("Altura média: %.2f%n", (alturaMedia / pessoas.length));
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", (pessoasMenorDe16 / (double) pessoas.length * 100));

        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() < 16){
                System.out.printf(pessoas[i].getNome(),"%n");
            }
        }
        sc.close();
    }
}