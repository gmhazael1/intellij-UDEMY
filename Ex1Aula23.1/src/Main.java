import entities.Funcionarios;
import java.util.ArrayList;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static entities.Funcionarios Funcionarios;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> list = new ArrayList<>();
        System.out.print("numero de empreados: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Empregado #%d: %n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
           Double salario = sc.nextDouble();

            Funcionarios emp = new Funcionarios(id, nome, salario);

            list.add(emp);
        }

        System.out.println("Digite o id do funcinario que tera aumento de salario: ");
        int idFuncionario = sc.nextInt();
        Integer pos = position(list, idFuncionario);

        if (pos == null){
            System.out.print("id nao existe");
        }else {
            System.out.println("Digite a porcentagem que deseja aumentar: ");
            double porcentagem = sc.nextDouble();
            list.get(pos).inceraseSalary(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios");

        for (Funcionarios emp : list){
            System.out.println(emp);
        }
        sc.close();
    }

    public static Integer position(List<Funcionarios> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }

        return null;
        
    }
}