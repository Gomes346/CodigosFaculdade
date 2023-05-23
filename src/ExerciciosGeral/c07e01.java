package ExerciciosGeral;

import java.util.Scanner;

public class c07e01 {
    public static void main(String[] args) {
        int jogosGanhos;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do apostador: ");
        nome = teclado.nextLine();
        System.out.print("Infome o numero de jogos acertados pelo apostador: ");
        jogosGanhos = teclado.nextInt();
        if (jogosGanhos <= 5) System.out.println(nome+" recebe nenhum prêmio");
        else {
            if (jogosGanhos <= 10) System.out.println(nome+" ganhou outro cartão");
            else {
                switch (jogosGanhos) {
                    case 11 -> System.out.println(nome+" ganhou premio de R$100,00");
                    case 12 -> System.out.println(nome+" ganhou premio de R$1000,00");
                    case 13 -> System.out.println(nome+" ganhou premio de R$50000,00");
                }
            }
        }
        teclado.close();
    }
}
