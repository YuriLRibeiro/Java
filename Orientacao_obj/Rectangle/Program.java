package Orientacao_obj.Rectangle;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        

    Rectangle r1 = new Rectangle();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter rectangle width and height");
    r1.Width = sc.nextDouble();
    r1.Height = sc.nextDouble();
    
    System.out.println(r1);
    sc.close();
}   
}