package ExerciciosGeral;

import java.util.Scanner;

public class c08ex29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique um valor para x: ");
        int x = teclado.nextInt();
        System.out.print("Indique o valor que ele vai ser elevado: ");
        int y = teclado.nextInt();
        int mult = 1, mult2 = 0;
        if (y == 0) System.out.print("1");
        else {
            System.out.print(x + " ");
            for (int aux2 = 2; aux2 <= y; aux2++) {
                mult *= x;
                for (int aux = 1; aux <= aux2; aux++) {
                    mult2 = mult * x;
                }
                System.out.print(mult2 + " ");
            }
        }
        teclado.close();
    }
}
