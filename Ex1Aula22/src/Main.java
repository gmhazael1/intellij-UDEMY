import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Bob");
        list.add("Maria");
        list.add("Marta");

        list.add(2, "Marco");//adicionar elementos nas posições


        for (String obj : list){
            System.out.printf("%s%n", obj);
        }

        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("-----------------------------");

        //list.remove(4);//remover elemtentos nas posições tambem funciona se utilizar o valor armazenado tipo "Marta"

        list.removeIf(obj -> obj.charAt(0) == 'M');//compara e remove elementos que começão com a letra M

        for (String obj : list){
            System.out.printf("%s%n", obj);
        }

        System.out.println("-----------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("-----------------------------");

        List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'A').collect(Collectors.toList());

        for (String obj : result){
            System.out.printf("%s%n", obj);
        }

        System.out.println("-----------------------------");

        String name = list.stream().filter(obj -> obj.charAt(0) == 'M').findFirst().orElse(null);
            System.out.printf("%s%n", name);
        sc.close();
    }
}