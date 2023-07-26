package entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Funcionarios{
    private static Map<Integer, Double> funcionarios = new HashMap<>();
    private static Map<Integer, String> nomeFuncionarios = new HashMap<>();
    private static HashSet<Integer> idsUnicos = new HashSet<>();

    public Funcionarios(int id, String nome, double salario){
        if (idsUnicos.contains(id)){
            throw new IllegalArgumentException("ID já existe..." + id);
        }
        funcionarios.put(id, salario);
        nomeFuncionarios.put(id, nome);
        idsUnicos.add(id);
    }

    public static Map<Integer, Double> getFuncionarios(){
        return funcionarios;
    }

    public static void  mostrarDetalhesDeEmpregados(Map<Integer, Double> funcionarios){
        for (Map.Entry<Integer, Double> entry: funcionarios.entrySet()){
            int id = entry.getKey();
            double salario = entry.getValue();
            String nome = nomeFuncionarios.get(id);
            System.out.printf("%d, %s, %.2f%n", id, nome, salario);
        }
    }
}
