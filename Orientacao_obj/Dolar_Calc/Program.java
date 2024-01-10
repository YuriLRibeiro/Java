package Orientacao_obj.Dolar_Calc;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.println("What is the dollar price?");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        CurrencyConverter.quantity = sc.nextDouble();

        System.out.println("Amount to be paid in reais = "+ CurrencyConverter.Result());
        sc.close();
    }
    
}
