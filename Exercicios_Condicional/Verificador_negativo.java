package Exercicios_Condicional;
import java.util.Scanner;
public class Verificador_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >=0){
            System.out.println("Não negativo");
        }
        else{
            System.out.println("Negativo");
        }

        sc.close();
    }
}
