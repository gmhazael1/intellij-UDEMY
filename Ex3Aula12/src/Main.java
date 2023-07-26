import java.util.Scanner;
import trimestre.Student;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student aluno = new Student();
        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        if (aluno.media() >= 60){
            System.out.printf("%s%n PASS", aluno);
        }else {
            System.out.printf("%s%nFAILED%n", aluno);
            System.out.print("MISSING POINTS: "+ aluno.missingPoints());
        }
        sc.close();
    }
}