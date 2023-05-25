package ExerciciosGeral;

import java.util.Scanner;

public class c08ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, divisiveis4 = 0, divisiveis3 = 0;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe um numero inteiro: ");
            numero = teclado.nextInt();
            if (numero % 2 == 0) System.out.println("Este numero é par!");
            else System.out.println("Este numero é impar!");
            if (numero % 4 == 0) divisiveis4 += numero;
            if (numero % 3 == 0) divisiveis3++;
        }
        System.out.println("Soma dos numeros divisiveis por 4: " + divisiveis4);
        System.out.println("Quantidade de numeros divisiveis por 3: " + divisiveis3);
        teclado.close();
    }
}
