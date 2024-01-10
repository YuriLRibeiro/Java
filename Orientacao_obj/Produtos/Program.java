package Orientacao_obj.Produtos;
import  java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();

        System.out.println("Enter product data:");
        System.out.println("Name:");

        p1.name = sc.nextLine();

        System.out.println("Price:");

        p1.price = sc.nextDouble();

        System.out.println("Quantity in stock:");

        p1.quantity = sc.nextInt();

        System.out.println(p1);

        System.out.println("Enter the number of products to be added in stock: ");
        p1.addProducts(sc.nextInt());

        System.out.println("Updated data: " + p1);

        System.out.println("Enter the number of products to be removed from stock: ");

        p1.RemoveProduct(sc.nextInt());

        System.out.println("Updated data: " + p1);

        sc.close();

    }
}
