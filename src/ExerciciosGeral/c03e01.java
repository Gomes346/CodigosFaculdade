package ExerciciosGeral;

import java.util.Scanner;

public class c03e01 {
    //Funcão : calcular o fatorial de um número
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número:");
        long numero = teclado.nextLong();
        long fatorial = 1L;
        for (long contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }
        System.out.println("Fatorial =" + fatorial);
        teclado.close();
    }
}
