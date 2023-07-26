import entities.Funcionarios;
import java.util.*;
import static entities.Funcionarios.getFuncionarios;
import static entities.Funcionarios.mostrarDetalhesDeEmpregados;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos funcionarios quer cadastrar: ");
        int n = sc.nextInt();
        /*int id = 0;
        String nome;
        double salario;*/
        for (int i = 0; i < n; i++){
            System.out.printf("Empregado #%d: %n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            new Funcionarios(id, nome, salario);
        }
        System.out.println("Digite o id do funcinario que tera aumento de salario: ");
        int idFuncionario = sc.nextInt();
        System.out.println("Digite a porcentagem que deseja aumentar: ");
        double porcentagem = sc.nextDouble();
        porcentagem = porcentagem / 100;
        if (getFuncionarios().containsKey(idFuncionario)){
            double salarioAtual = getFuncionarios().get(idFuncionario);
            double aumento = salarioAtual * porcentagem;
            double novoSalario = salarioAtual + aumento;
            getFuncionarios().put(idFuncionario, novoSalario);
        }else {
            System.out.print("ID nã existe");
        }
            System.out.println("Lista de empregados: ");
            mostrarDetalhesDeEmpregados(getFuncionarios());

        sc.close();
    }
}