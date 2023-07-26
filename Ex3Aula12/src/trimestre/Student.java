package trimestre;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoints(){
        return 60.00 - media();
    }

    public String toString(){
        return "FINAL GRADE = " + String.format("%.2f", media());
    }
}
