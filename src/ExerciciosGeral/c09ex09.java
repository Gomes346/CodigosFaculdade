package ExerciciosGeral;

import java.util.Scanner;

public class c09ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, den, serie = 0;
        System.out.print("Informe o numero de termos: ");
        int termos = teclado.nextInt();
        for (int aux = 1; aux <= termos; aux++) {
            num = Math.pow(3, aux + 1);
            if (aux % 2.0 != 0) den = (aux + 9) * Math.sqrt(Math.pow(9, aux - 1));
            else den = (aux + 9) * Math.sqrt(Math.pow(4, aux));
            serie += num / den;

        }
        System.out.print("Valor da Série = " + (100 - Math.pow(serie, 3)));
        teclado.close();
    }
}
