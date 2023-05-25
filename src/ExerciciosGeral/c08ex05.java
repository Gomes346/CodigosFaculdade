package ExerciciosGeral;

import java.util.Scanner;

public class c08ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int candFulano = 0, candiCiclano = 0, candBeltrano = 0, numVoto;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Informe o numero do seu cadidato: ");
            numVoto = teclado.nextInt();
            switch (numVoto) {
                case 1 -> candFulano++;
                case 2 -> candiCiclano++;
                case 3 -> candBeltrano++;
            }
        }
        System.out.println("Fulano: "+candFulano+"\nCiclano: "+candiCiclano+"\nBeltrano: "+candBeltrano);
        if (candFulano>candBeltrano&&candFulano>candiCiclano) System.out.println("O candidato Fulano é o vencedor!!");
        else {
            if (candBeltrano>candFulano&&candBeltrano>candiCiclano) System.out.println("O candidato Beltrano é o vencedor!!");
            else {
                if (candiCiclano>candBeltrano&&candiCiclano>candFulano) System.out.println("O candidato Ciclano é o vencedor!!");
                else System.out.println("Deve haver outra eleição");
            }
        }
        teclado.close();
    }


}

