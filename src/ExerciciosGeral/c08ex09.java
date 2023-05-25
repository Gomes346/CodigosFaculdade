package ExerciciosGeral;

import java.util.Scanner;

public class c08ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, pessoas, homens = 0, mulheres = 0;
        double idadeM = 0, idadeF = 0;
        String nome, sexo;
        System.out.print("Informe o numero de pessoas: ");
        pessoas = teclado.nextInt();
        for (int aux = 1; aux <= pessoas; aux++) {
            teclado.nextLine();
            System.out.println("Pesquisa de Campo");
            System.out.print("Informe o nome da pessoa: ");
            nome = teclado.nextLine();
            System.out.print("Informe o sexo: ");
            sexo = teclado.nextLine();
            System.out.print("Informe a idade: ");
            idade = teclado.nextInt();
            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("masculino")) {
                homens++;
                idadeM += idade;
            } else {
                mulheres++;
                idadeF += idade;
            }
        }
        System.out.println("Numero de homens: " + homens);
        System.out.println("Numero de mulheres: " + mulheres);
        System.out.println("Media de idades dos homens: " + (idadeM / homens));
        System.out.println("Media de idades das mulheres: " + (idadeF / mulheres));
        teclado.close();
    }
}
