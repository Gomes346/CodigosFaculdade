package ExerciciosGeral;

import java.util.Scanner;

public class c09ex05 {
    public static void main(String[] args) {
        double num, den, serie = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique o numero de series: ");
        int rep = teclado.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            num = (aux - 1) * 2 + (aux * 3);
            den = (aux * 6) + 1;
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie * 5);
        teclado.close();
    }
}
