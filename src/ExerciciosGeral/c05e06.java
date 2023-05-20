package ExerciciosGeral;

import java.util.Scanner;

public class c05e06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe o valor A da reta: ");
        double retaA = teclado.nextDouble();
        System.out.print("informe o valor B da reta: ");
        double retaB = teclado.nextDouble();
        System.out.print("informe o valor C da reta: ");
        double retaC = teclado.nextDouble();
        System.out.print("informe o valor X do ponto P: ");
        double pX = teclado.nextDouble();
        System.out.print("informe o valoe de Y no ponto P: ");
        double pY = teclado.nextDouble();
        double distancia = (retaA * pX + retaB * pY + retaC) / Math.sqrt(Math.pow(retaA, 2.0) + Math.pow(retaB, 2.0));
        System.out.println("distancia= " + distancia);
        teclado.close();
    }
}
