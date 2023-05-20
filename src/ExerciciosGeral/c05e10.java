package ExerciciosGeral;

import java.util.Scanner;

public class c05e10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe um numero de 5 digitos: ");
        int numero = teclado.nextInt();
        int n1 = numero / 10000;
        int n2 = numero / 1000 % 10;
        int n3 = numero / 100 % 10;
        int n4 = numero / 10 % 10;
        int n5 = numero % 10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        teclado.close();
    }
}
