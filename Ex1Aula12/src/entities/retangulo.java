package entities;

public class retangulo {
    public double Width;
    public double Height;

    public double Area(){
        return Width * Height;
    }

    public double Perimeter(){
        return 2 * (Width + Height);
    }

    public double Diagonal(){
        double sqrt = Math.sqrt(Math.pow(Width, 2) + Math.pow(Height,2));
        return sqrt;
    }
}
