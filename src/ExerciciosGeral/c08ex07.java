package ExerciciosGeral;

import java.util.Scanner;

public class c08ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, ate12 = 0, acima30 = 0;
        double mediaIdade,soma = 0;
        System.out.print("Informe quantos alunos tem: ");
        int alunos = teclado.nextInt();
        for (int aux = 1; aux <= alunos; aux++) {
            teclado.nextLine();
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Informe a idade do aluno: ");
            idade = teclado.nextInt();
            if (idade <= 12) ate12++;
            else if (idade > 30) acima30++;
            soma += idade;
        }
        mediaIdade = soma / alunos;
        System.out.println("Alunos que tem ate 12 anos: " + ate12);
        System.out.println("Alunos que tem acima de 30 anos: " + acima30);
        System.out.println("Media das idades informadas: " + mediaIdade);
        teclado.close();
    }
}
