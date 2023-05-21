package ExerciciosGeral;

import java.util.Scanner;

public class c06e05 {
    public static void main(String[] args) {
        int numero, divisao5, divisao7;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um numero inteiro:");
        numero = teclado.nextInt();
        divisao7 = numero % 7;
        divisao5 = numero % 5;
        if (divisao7 == 0 && divisao5 == 0) System.out.println(numero + " é divisivel simuntaneamente por 5 e 7");
        else System.out.println(numero + " não é divisivel simultaneamente por 5 e 7");
        teclado.close();

    }
}
