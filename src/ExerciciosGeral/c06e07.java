package ExerciciosGeral;

import java.util.Scanner;

public class c06e07 {
    public static void main(String[] args) {
        double plBruto, plLIquido, impostoR, salario, valorFixo, percentSala;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o salario: ");
        salario = teclado.nextDouble();
        if (salario < 300) {
            valorFixo = 500;
            percentSala = 0.7;
        } else {
            if (salario > 1000) {
                valorFixo = 0;
                percentSala = 0.3;
            } else {
                valorFixo = 200;
                percentSala = 0.5;
            }
        }
        plBruto = valorFixo + (salario * percentSala);
        impostoR = plBruto * 0.25;
        plLIquido = plBruto - impostoR;
        System.out.println("O PL Liquido é de " + plLIquido);
        teclado.close();

    }
}
