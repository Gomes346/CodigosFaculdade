package ExerciciosGeral;

import java.util.Scanner;

public class c06e14 {
    public static void main(String[] args) {
        int numero, n1, n2, n3, n4;
        String numeroInvert;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inforeme um numero de 4 digitos: ");
        numero = teclado.nextInt();
        n1 = numero / 1000;
        n2 = numero / 100%10;
        n3 = numero / 10%10;
        n4 = numero%10;
        numeroInvert = n4+""+n3+""+n2+""+n1;
        if (n1>10) System.out.println("Esse numero não tem quatro digitos!");
        else System.out.println("Esse numero invertido é: "+numeroInvert);
        teclado.close();
    }
}
