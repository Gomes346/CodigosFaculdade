package ExerciciosGeral;

import java.util.Scanner;

public class c08ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int numero = teclado.nextInt();
        int divisores = 0;
        for (int aux = 1; aux < numero; aux++) {
            if (numero % aux == 0) divisores++;
        }
        if (divisores > 1) System.out.println("Este numero não é primo");
        else System.out.println("Este numero é primo");
        teclado.close();
    }
}
