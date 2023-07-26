package entities;

public class Esfera {
    public static double radius;
    public static final double PI = 3.14159;
    public static double circumference (){
        return 2 * PI * radius;
    }
    public static double volume(){
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    public String toString(){
        return "Circumference: "+ String.format("%.2f", circumference()) + "\nVolume: "+ String.format("%.2f", volume()) + "\nPI Value: " + String.format("%.2f", Math.PI);
    }
}
