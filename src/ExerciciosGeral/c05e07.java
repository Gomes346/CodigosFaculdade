package ExerciciosGeral;

import java.util.Scanner;

public class c05e07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe o valor de x:");
        double x = teclado.nextDouble();
        double valorFuncao = Math.sqrt(Math.pow(x / 4.0 + 1.0, 2.0) + x * 0.2);
        System.out.println("o valor da funcao= " + valorFuncao);
        teclado.close();
    }
}
