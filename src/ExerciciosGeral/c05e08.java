package ExerciciosGeral;

import java.util.Scanner;

public class c05e08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe a area de um setor circular: ");
        double area = teclado.nextDouble();
        System.out.print("informe o angulo do setor: ");
        double angulo = teclado.nextDouble();
        double pi = 3.1416;
        double raio = Math.sqrt(area * 360.0 / (angulo * pi));
        System.out.println("o raio= " + raio);
        teclado.close();
    }
}
