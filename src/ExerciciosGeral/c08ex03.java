package ExerciciosGeral;

import java.util.Scanner;

public class c08ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contA = 0;
        double notaFinal, faltas;
        for (int aux = 1; aux <= 3; aux++) {
            System.out.print("Informe a nota final do aluno: ");
            notaFinal = teclado.nextDouble();
            if (notaFinal == (-1)) break;
            System.out.print("Informe o numero de faltas do aluno: ");
            faltas = teclado.nextDouble();
            if (notaFinal >= 65 && faltas <= 16) {
                System.out.println("Aluno aprovado");
                contA++;
            } else System.out.println("Aluno reprovado");
        }
        System.out.println("Numero de alunos aprovados foi de: " + contA);
        System.out.println("Numero de alunos reprovados foi de: " + (3 - contA));
        teclado.close();
    }
}
