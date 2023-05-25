package ExerciciosGeral;

import java.util.Scanner;

public class c08ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alunos, faltas, contAprov = 0, contFalta = 0, contReprov = 0;
        double soma = 0, nota;
        System.out.print("Infome o numero de alunos: ");
        alunos = teclado.nextInt();
        for (int aux = 1; aux <= alunos; aux++) {
            System.out.print("Informe a nota final: ");
            nota = teclado.nextDouble();
            System.out.print("Informe o numero de faltas: ");
            faltas = teclado.nextInt();
            if (nota >= 65 && faltas <= 16) {
                System.out.println("Aluno aprovado!");
                contAprov++;
                soma += nota;
            } else {
                System.out.println("Aluno reprovado!");
                contReprov++;
            }
            if (faltas > 16) contFalta++;
        }
        System.out.println("Quantidade de alunos aprovado: " + contAprov);
        System.out.println("Quantidade de alunos reprovados: " + contReprov);
        System.out.println("Quantidade de alunos com mais de 16 faltas: " + contFalta);
        System.out.println("Media das notas dos aprovados: " + (soma / contAprov));
        teclado.close();
    }
}
