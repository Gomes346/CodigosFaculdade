package ExerciciosGeral;

import java.util.Scanner;

public class c06e02 {
    public static void main(String[] args) {
        double poluentes, multa;
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe a quantidade de poluentes emitidos:");
        poluentes = teclado.nextDouble();
        if (poluentes <= 1500) multa = 0;
        else {
            if (poluentes > 3500) multa = 5000 * poluentes;
            else multa = 3000;
        }
        System.out.println("valor da multa= R$" + multa);
        teclado.close();

    }
}
