package ExerciciosGeral;

import java.util.Scanner;

public class c08ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int modelo1 = 0, modelo2 = 0, modelo3 = 0, modelo4 = 0, modelo5 = 0;
        double faturaTotal;
        System.out.print("Informe quantos produtos foram vendidos no periodo: ");
        int qntProdutos = teclado.nextInt();
        for (int aux = 1; aux <= qntProdutos; aux++) {
            System.out.print("Informe o codigo do produto comprado: ");
            int codigo = teclado.nextInt();
            switch (codigo) {
                case 1 -> modelo1++;
                case 2 -> modelo2++;
                case 3 -> modelo3++;
                case 4 -> modelo4++;
                case 5 -> modelo5++;
            }
        }
        faturaTotal = (modelo1 * 1565) + (modelo2 * 1890) + (modelo3 * 2150) + (modelo4 * 2963) + (modelo5 * 3750);
        System.out.println("O faturamento total do periodo foi de " + faturaTotal);
        teclado.close();
    }
}
