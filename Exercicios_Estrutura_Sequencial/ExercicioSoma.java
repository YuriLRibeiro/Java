package Exercicios_Estrutura_Sequencial;
import java.util.Scanner;
public class ExercicioSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1;
        double v2;

        System.out.println("Insira o primeiro valor!");
        v1 = sc.nextDouble();
        System.out.println("Insira o segundo valor!");
        v2 = sc.nextDouble();

        double resultado = v1 + v2;
        
        System.out.println("Soma = " + resultado);
        sc.close();

    }
    
}
