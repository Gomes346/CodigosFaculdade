package ExerciciosGeral;

import java.util.Scanner;

public class c06e12 {
    public static void main(String[] args) {

        double valorCaixa, mesesCopa, aluguel;
        int caixa, bolasExtoque, bolasProd, bolasDefeito, galpao;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o numero de bolas produzidas : ");
        bolasProd = teclado.nextInt();
        System.out.print("Informe o numero de bolas com defeito : ");
        bolasDefeito = teclado.nextInt();
        System.out.print("Informe o valor de cada caixa de papelão : ");
        valorCaixa = teclado.nextDouble();
        System.out.print("Informe o numero de meses ate a copa: ");
        mesesCopa = teclado.nextDouble();
        System.out.print("Informe o valor do aluguel do galpão: ");
        aluguel = teclado.nextDouble();
        bolasExtoque = bolasProd - bolasDefeito;
        caixa = bolasExtoque / 10;
        if (bolasExtoque % 10 > 0) caixa = caixa + 1;
        galpao = caixa / 850;
        if (caixa % 850 > 0) galpao = galpao + 1;
        double custoTotal, custoCaixas, custoAluguel;
        custoCaixas = caixa * valorCaixa;
        custoAluguel = galpao * aluguel * mesesCopa;
        custoTotal = custoAluguel + custoCaixas;
        System.out.println("Custo com caixas= " + custoCaixas);
        System.out.println("Custo com aluguel= " + custoAluguel);
        System.out.println("Custo total= " + custoTotal);
        teclado.close();
    }
}
