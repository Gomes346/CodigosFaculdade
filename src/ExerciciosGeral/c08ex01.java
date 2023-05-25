package ExerciciosGeral;

import java.util.Scanner;

public class c08ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, pi, area;
        pi = 3.1416;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe o valor do raio: ");
            raio = teclado.nextDouble();
            area = Math.pow(raio,2) * pi;
            System.out.println("Area do circulo= " + area);
        }
        teclado.close();
    }
}
