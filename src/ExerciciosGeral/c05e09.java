package ExerciciosGeral;

import java.util.Scanner;

public class c05e09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe a nota da primeira prova:");
        double nota1 = teclado.nextDouble();
        System.out.print("informe a nota da segunda prova:");
        double nota2 = teclado.nextDouble();
        System.out.print("informe a nota da terceira prova:");
        double nota3 = teclado.nextDouble();
        nota1 *= 2.0;
        nota2 *= 3.0;
        nota3 *= 5.0;
        double somaPesos = 10.0;
        double somaNotas = nota1 + nota2 + nota3;
        double media = somaNotas / somaPesos;
        System.out.println("a media ponderada= " + media);
        teclado.close();
    }
}
