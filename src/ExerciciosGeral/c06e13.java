package ExerciciosGeral;

import java.util.Scanner;

public class c06e13 {
    public static void main(String[] args) {
        int horaInicio, minInicio, horaFinal, minFinal, duracaoMin, duracaoHr, minCalcInicio, minCalcFinal, hrCalc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe somente a hora inicial da partida: ");
        horaInicio = teclado.nextInt();
        System.out.print("Informe somente os minuto inicial da partida: ");
        minInicio = teclado.nextInt();
        System.out.print("Informe a hora final da partida: ");
        horaFinal = teclado.nextInt();
        System.out.print("Informe o minuto final da patida: ");
        minFinal = teclado.nextInt();
        minCalcInicio = (horaInicio * 60) + minInicio;
        minCalcFinal = (horaFinal * 60) + minFinal;
        hrCalc = minCalcFinal - minCalcInicio;
        if (hrCalc % 60 > 0) {
            duracaoMin = hrCalc % 60;
            duracaoHr = (hrCalc - duracaoMin) / 60;
        } else {
            duracaoHr = hrCalc / 60;
            duracaoMin = 0;
        }
        System.out.println("A duracão da partida foi de " + duracaoHr + "hrs e " + duracaoMin + "min");
        teclado.close();
    }
}
