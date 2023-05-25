package ExerciciosGeral;

import java.util.Scanner;

public class c08ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int insumos;
        double precoUnit, quantidade, custoTotal = 0, precoParcial, maiorPreco = 0;
        String nome, nomeMaior = "oi";
        System.out.print("Indique o numero de insumos: ");
        insumos = teclado.nextInt();
        for (int aux = 1; aux <= insumos; aux++) {
            teclado.nextLine();
            System.out.print("Informe o nome do insumo: ");
            nome = teclado.nextLine();
            System.out.print("Informe o preço unitario desse insumo: ");
            precoUnit = teclado.nextDouble();
            System.out.print("Informe a quantidade comprada desse insumo: ");
            quantidade = teclado.nextDouble();
            precoParcial = quantidade * precoUnit;
            if (aux == 1 || maiorPreco < precoParcial) {
                maiorPreco = precoParcial;
                nomeMaior = nome;
            }
            custoTotal += precoParcial;
        }
        System.out.println("Custo total do projeto: " + custoTotal);
        System.out.println("Media dos custos parcias: " + (custoTotal / insumos));
        System.out.println("Nome do insumo de maior custo parcial: " + nomeMaior);
        teclado.close();
    }
}
