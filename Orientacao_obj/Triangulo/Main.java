package Orientacao_obj.Triangulo;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("insira as medidas do triangulo x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira as medidas do triangulo y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do triangulo x e: %4f%n", areaX);
        System.out.printf("A area do triangulo y e: %4f%n", areaY);
        sc.close();
    }
}
