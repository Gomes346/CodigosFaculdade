package ExerciciosGeral;

import java.util.Scanner;

public class c06e11 {
    public static void main(String[] args) {
        String nomeEquipe1, nomeEquipe2;
        int setsEquipe1, setsEquipe2, pontos1, pontos2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome da equipe 1: ");
        nomeEquipe1 = teclado.nextLine();
        System.out.print("Informe o nome da equipe 2: ");
        nomeEquipe2 = teclado.nextLine();
        System.out.print("Informe o numero de sets do " + nomeEquipe1 + ":");
        setsEquipe1 = teclado.nextInt();
        System.out.print("Informe o numero de sets do " + nomeEquipe2 + ":");
        setsEquipe2 = teclado.nextInt();
        if (setsEquipe1 == 3 && setsEquipe2 == 2) {
            pontos1 = 2;
            pontos2 = 1;
        } else {
            if (setsEquipe1 == 2 && setsEquipe2 == 3) {
                pontos1 = 1;
                pontos2 = 2;
            } else {
                if (setsEquipe1 == 3 && setsEquipe2 <= 1) {
                    pontos1 = 3;
                    pontos2 = 0;
                } else {
                    pontos2 = 3;
                    pontos1 = 0;
                }
            }
        }
        System.out.println("Pontos " + nomeEquipe1 + "= " + pontos1);
        System.out.println("Pontos " + nomeEquipe2 + "= " + pontos2);
        teclado.close();


    }
}
