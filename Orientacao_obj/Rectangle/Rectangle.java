package Orientacao_obj.Rectangle;

public class Rectangle {
    Double Width;
    Double Height;

    public double Area(){
        return Width * Height;
    }
    public double Perimeter(){
        return 2 * (Width + Height);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
    }

    public String toString(){
       return "AREA = " + Area()
        +"\n" + "PERIMETER = " + Perimeter() +
        "\n" + "DIAGONAL = " + Diagonal();
    }
    
}