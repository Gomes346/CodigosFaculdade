package ExerciciosGeral;

import java.util.Scanner;

public class c05e04 {
    public static void main(String[] args) {
        double cordX1, cordY1, cordX2, cordY2, distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o x do ponto 1:");
        cordX1 = teclado.nextDouble();
        System.out.print("Informe o y do ponto 1:");
        cordY1 = teclado.nextDouble();
        System.out.print("Informe o x do ponto 2:");
        cordX2 = teclado.nextDouble();
        System.out.print("Informe o y do ponto 2:");
        cordY2 = teclado.nextDouble();
        distancia = Math.sqrt((Math.pow((cordX1-cordX2),2))+(Math.pow((cordY1-cordY2),2)));
        System.out.println("distancia= "+distancia);
        teclado.close();

    }
}

