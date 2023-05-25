package ExerciciosGeral;

import java.util.Scanner;

public class c08ex05a {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int candFulano = 0, candiCiclano = 0, candBeltrano = 0, numVoto, votoBraNulo = 0, votoNovo1 = 0, votoNovo2 = 0, numVoto1;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("NUmero de cada candidato:\n1-Fulano\n2-Ciclano\n3-Beltrano\nOutro numero-Branco/nulo\nInforme o seu voto: ");
            numVoto = teclado.nextInt();
            switch (numVoto) {
                case 1 -> candFulano++;
                case 2 -> candiCiclano++;
                case 3 -> candBeltrano++;
                default -> votoBraNulo++;
            }
        }
        System.out.println("Fulano: " + candFulano + "\nCiclano: " + candiCiclano + "\nBeltrano: " + candBeltrano + "\nVotos brancos e nulos: " + votoBraNulo);
        if (votoBraNulo > (candBeltrano + candFulano + candiCiclano))
            System.out.println("Eleição, inclusive a de segundo turno, está anulada.");
        else {
            if (candBeltrano > candFulano && candBeltrano > candiCiclano)
                System.out.println("O candidato Beltrano é o vencedor!!");
            else {
                if (candiCiclano > candBeltrano && candiCiclano > candFulano)
                    System.out.println("O candidato Ciclano é o vencedor!!");
                else {
                    if (candFulano > candBeltrano && candFulano > candiCiclano)
                        System.out.println("O candidato Fulano é o vencedor!!");
                    else {
                        if (candBeltrano == candFulano) {
                            System.out.println("Nova votação entre Fulano e Beltrano");
                            for (int aux1 = 0; aux1 <= 10; aux1++) {
                                System.out.println("Numero de cada candidato:\n1-Fulano\n2-Beltrano");
                                numVoto1 = teclado.nextInt();
                                switch (numVoto1) {
                                    case 1 -> votoNovo1++;
                                    case 2 -> votoNovo2++;
                                }
                            }
                            if (votoNovo1 > votoNovo2) System.out.println("Fulano Venceu!!");
                            else System.out.println("Beltrano Venceu!!");
                        }
                        if (candBeltrano == candiCiclano) {
                            System.out.println("Nova votação entre Ciclano e Beltrano");
                            for (int aux1 = 0; aux1 <= 10; aux1++) {
                                System.out.println("Numero de cada candidato:\n1-Ciclano\n2-Beltrano");
                                numVoto1 = teclado.nextInt();
                                switch (numVoto1) {
                                    case 1 -> votoNovo1++;
                                    case 2 -> votoNovo2++;
                                }

                            }
                            if (votoNovo1 > votoNovo2) System.out.println("Ciclano Venceu!!");
                            else System.out.println("Beltrano Venceu!!");
                        }
                        if (candFulano == candiCiclano) {
                            System.out.println("Nova votação entre Ciclano e Fulano");
                            for (int aux1 = 0; aux1 <= 10; aux1++) {
                                System.out.println("Numero de cada candidato:\n1-Ciclano\n2-Fulano");
                                numVoto1 = teclado.nextInt();
                                switch (numVoto1) {
                                    case 1 -> votoNovo1++;
                                    case 2 -> votoNovo2++;
                                }
                            }
                            if (votoNovo1 > votoNovo2) System.out.println("Ciclano Venceu!!");
                            else System.out.println("Fulano Venceu!!");
                        }

                    }
                }
            }
        }
        teclado.close();
    }
}

