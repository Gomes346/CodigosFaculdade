package ExerciciosGeral;

import java.util.Scanner;

public class c06e03 {
    public static void main(String[] args) {
        double salario, vendas, comissao;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de vendas realizada:");
        vendas = teclado.nextDouble();
        if (vendas <= 1000) comissao = 0;
        else {
            if (vendas > 10000) comissao = 1000;
            else comissao = vendas * 0.1;
        }
        salario = comissao + 240;
        System.out.println("salario= R$" + salario);
        teclado.close();
    }
}
