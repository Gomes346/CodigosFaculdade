package ExerciciosGeral;

import java.util.Scanner;

public class c06e10 {
    public static void main(String[] args) {
        double capitalAlp, taxaDia, dias, rendimento, imposto, valorResga;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o capital aplicado: ");
        capitalAlp = teclado.nextDouble();
        System.out.print("Informe o numero de dias que o dinheiro ficou aplicado: ");
        dias = teclado.nextDouble();
        System.out.print("Informe a taxa de juros diaria: ");
        taxaDia = teclado.nextDouble();
        taxaDia = taxaDia / 100;
        rendimento = capitalAlp * taxaDia * dias;
        imposto = rendimento * 0.15;
        valorResga = capitalAlp + rendimento - imposto - 10;
        System.out.println("O valor a ser resgatado é de: " + valorResga);
        teclado.close();


    }
}
