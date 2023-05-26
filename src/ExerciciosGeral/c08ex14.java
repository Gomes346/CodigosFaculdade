package ExerciciosGeral;

import java.util.Scanner;

public class c08ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String simbolo;
        int numero;
        System.out.print("Informe um numero inteiro entre 1 e 20: ");
        numero = teclado.nextInt();
        teclado.nextLine();
        if (numero >= 1 && numero <= 20) {
            System.out.print("Indique um simbolo para ser usado na matrix: ");
            simbolo = teclado.nextLine();
            for (int aux2 = 0; aux2 < numero; aux2++) {
                System.out.println();
                for (int aux = 0; aux < numero; aux++) {
                    System.out.print(simbolo + " ");
                }
            }
        } else System.out.println("Este numero não é valido");
        teclado.close();
    }
}