package ExerciciosGeral;

import java.util.Scanner;

public class c06e06 {
    public static void main(String[] args) {
        double nA, nB, nC, raix1, raix2, delta;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de A: ");
        nA = teclado.nextDouble();
        System.out.print("Informe o valor de B: ");
        nB = teclado.nextDouble();
        System.out.print("Informe o valor de C: ");
        nC = teclado.nextDouble();
        delta = Math.pow(nB, 2) - 4 * (nA * nC);
        raix1 = (-nB + Math.sqrt(delta)) / (2 * nA);
        raix2 = (-nB - Math.sqrt(delta)) / (2 * nA);
        if (delta > 0) System.out.println("Teremos 2 raizes= " + raix1 + " e " + raix2);
        else {
            if (delta == 0) System.out.println("Teremos 1 raiz= " + raix1);
            else System.out.println("Não teremos raizes");
        }
        teclado.close();


    }
}
