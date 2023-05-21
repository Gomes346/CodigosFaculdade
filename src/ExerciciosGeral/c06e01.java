package ExerciciosGeral;

import java.util.Scanner;

public class c06e01 {
    public static void main(String[] args) {
        double fx, x;
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe o valor de x:");
        x = teclado.nextDouble();
        if (x < 4) {
            fx = (5 * x + 3) / (Math.sqrt(16 - (Math.pow(x, 2))));
        } else {
            if (x == 4) fx = 0;
            else {
                fx = (5 * x + 3) / (Math.sqrt((Math.pow(x, 2)) - 16));
            }
        }
        System.out.println("f(x)= " + fx);
        teclado.close();

    }
}
