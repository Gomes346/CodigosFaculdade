package ExerciciosGeral;

import java.util.Scanner;

public class c08ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaFinal, faltas;
        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe a nota final do aluno: ");
            notaFinal = teclado.nextDouble();
            if (notaFinal == (-1)) break;
            System.out.print("Informe o numero de faltas do aluno: ");
            faltas = teclado.nextDouble();
            if (notaFinal >= 65 && faltas <= 16) System.out.println("Aluno aprovado");
            else System.out.println("Aluno reprovado");
        }
        teclado.close();
    }
}

