package ExerciciosGeral;

import java.util.Scanner;

public class c09ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, den, serie = 0;
        System.out.print("Informe o numero de repetições: ");
        int rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            num = 1 + Math.sqrt(aux * 4);
            den = aux * 3;
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);
    }
}
