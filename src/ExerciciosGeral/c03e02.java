package ExerciciosGeral;

import java.util.Scanner;

public class c03e02 {
    //Funcão: Calcula a média de 3 números inteiros
    // Autor: Gabriel Gomes
    public static void main(String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero:");
        n1 = teclado.nextLong();
        System.out.print("Informe mais um numero:");
        n2 = teclado.nextLong();
        System.out.print("Informe mais um numero:");
        n3 = teclado.nextLong();
        soma = n1 + n2 + n3;
        media = soma / 3.0;
        System.out.print("Media =" + media);
        teclado.close();
    }
}
