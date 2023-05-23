package ExerciciosGeral;

import java.util.Scanner;

public class c06e16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double prova1, prova2, prova3, trabalho, idade, peso1, peso2, mediaProvas, notaProvas, notaTrabalho, notaFinal, faltas;
        String nome;
        System.out.print("Informe o nome do aluno: ");
        nome = teclado.nextLine();
        System.out.print("informe a idade do aluno: ");
        idade = teclado.nextDouble();
        System.out.print("Informe o numero de faltas: ");
        faltas = teclado.nextDouble();
        System.out.print("Inforeme a nota da prova 1: ");
        prova1 = teclado.nextDouble();
        System.out.print("Informe a nota da prova 2: ");
        prova2 = teclado.nextDouble();
        System.out.print("Informe a nota da prova 3: ");
        prova3 = teclado.nextDouble();
        System.out.print("Informe a nota do trabalho:");
        trabalho = teclado.nextDouble();
        if (idade <= 17) peso2 = 1;
        else {
            if (idade > 50) peso2 = 3;
            else peso2 = 2;
        }
        if (faltas <= 5) peso1 = 3;
        else {
            if (faltas > 10) peso1 = 1;
            else peso1 = 2;
        }
        if (prova1 > prova2 && prova1 > prova3) {
            if (prova2 > prova3) mediaProvas = (prova1 + prova2) / 2;
            else mediaProvas = (prova1 + prova3) / 2;
        } else {
            if (prova2 > prova1 && prova2 > prova3) {
                if (prova1 > prova3) mediaProvas = (prova1 + prova2) / 2;
                else mediaProvas = (prova3 + prova2) / 2;
            } else {
                if (prova1 > prova2) mediaProvas = (prova1 + prova3) / 2;
                else mediaProvas = (prova2 + prova3) / 2;
            }
        }
        notaProvas = mediaProvas * peso1;
        notaTrabalho = trabalho * peso2;
        notaFinal = notaProvas + notaTrabalho;
        if (notaFinal <= 50) System.out.println(nome + " esta REPROVADO");
        else {
            if (notaFinal > 50 && notaFinal <= 70) System.out.println(nome + " teve um resultado REGULAR");
            else {
                if (notaFinal > 70 && notaFinal <= 80) System.out.println(nome + " teve um resultado BOM");
                else {
                    if (notaFinal > 80 && notaFinal <= 90) System.out.println(nome + " teve um resultado MUITO BOM");
                    else System.out.println(nome + " teve um resultado EXCELENTE");
                }
            }
        }
        teclado.close();
    }
}
