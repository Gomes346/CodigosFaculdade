package ExerciciosGeral;

import java.util.Scanner;

public class c05e12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe os sec:");
        int sec = teclado.nextInt();
        int hora = sec / 3600;
        int min = sec % 3600 / 60;
        int tempoSec = sec - (hora * 3600 + min * 60);
        System.out.println("hora: " + hora + " min: " + min + " seg: " + tempoSec);
        teclado.close();
    }
}
