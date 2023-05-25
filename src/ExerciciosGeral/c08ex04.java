package ExerciciosGeral;

import java.util.Scanner;

public class c08ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, cont17 = 0;
        String nome;
        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe a idade: ");
            idade = teclado.nextInt();
            if (idade <= 18) cont17++;
            teclado.nextLine();
        }
        System.out.println("Numero de alunos com ate 18 anos: " + cont17);
        System.out.println("Numero de allunos com mais de 18: " + (50 - cont17));
        teclado.close();
    }
}
