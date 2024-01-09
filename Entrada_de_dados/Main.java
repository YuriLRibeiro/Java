package Entrada_de_dados;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println("O valor de x e" + x);

        sc.close();
    }
}
