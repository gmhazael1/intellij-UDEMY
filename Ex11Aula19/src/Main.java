import entities.Pessoas;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double maiorAltura = 0, menorAltura = Double.MAX_VALUE, mediaAlturaDasMulheres = 0;
        int numeroDeHomens = 0, numeroDeMulheres = 0;
        Pessoas[] pessoas = new Pessoas[n];
        for (int i = 0; i < pessoas.length; i++){
            sc.nextLine();
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %dª pessoa: ", i + 1);
            String genero = sc.next();
            pessoas[i] = new Pessoas(altura, genero);
        }
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i].getAltura() > maiorAltura){
                maiorAltura = pessoas[i].getAltura();
            }else if(pessoas[i].getAltura() < menorAltura){
                menorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getGenero().equalsIgnoreCase("F")){
                numeroDeMulheres++;
                mediaAlturaDasMulheres += pessoas[i].getAltura();
            }else if (pessoas[i].getGenero().equalsIgnoreCase("M")){
                numeroDeHomens++;
            }
        }
        mediaAlturaDasMulheres = mediaAlturaDasMulheres / numeroDeMulheres;
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaDasMulheres);
        System.out.printf("Numero de homens = %d\n", numeroDeHomens);
        sc.close();
    }
}