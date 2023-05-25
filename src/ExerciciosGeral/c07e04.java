package ExerciciosGeral;

import java.util.Scanner;

public class c07e04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String equipe;
        System.out.print("Informe o nome da equipe: ");
        equipe = teclado.nextLine();
        switch (equipe) {
            case "América", "Atlético", "Cruzeiro", "Vila Nova" ->
                    System.out.println("Pertence ao estado Minas Gerais");
            case "Botafogo", "Flamengo", "Fluminense", "Vasco" ->
                    System.out.println("Pertence ao estado Rio de Janeiro");
            case "Corinthians", "Palmeiras", "Santos", "São Paulo" ->
                    System.out.println("Pertence ao estado São Paulo");
            case "Grêmio", "Internacional ", "Juventude" -> System.out.println("Pertence ao estado Rio Grande do Sul");
            case "Náutico", "Santa Cruz", "Sport" -> System.out.println("Pertence ao estado Pernambuco");
            default -> System.out.println("Equipe invalida");
        }
        teclado.close();
    }
}
