package ExerciciosGeral;

import java.util.Scanner;

public class c06e15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo, dias;
        double valorFixo, servicos, imposto, diaria, conta, impostoCalc;
        String cidade;
        System.out.print("Informe sua cidade: ");
        cidade = teclado.nextLine();
        System.out.print("Informe o codigo do seu pacote: ");
        codigo = teclado.nextInt();
        System.out.print("Informe o valor dos serviços extras: ");
        servicos = teclado.nextDouble();
        System.out.print("Informe o numero de dias de consumo dos canais pay-per-view: ");
        dias = teclado.nextInt();
        if (codigo == 1) {
            valorFixo = 65;
            diaria = dias * 1.20;
            if (diaria >= 65) diaria = 65;
        } else {
            if (codigo == 2) {
                valorFixo = 104;
                diaria = dias * 2.10;
            } else {
                valorFixo = 137;
                diaria = 0;
            }
        }
        if (cidade.equalsIgnoreCase("belo horizonte")) imposto = 0;

        else {
            if (cidade.equalsIgnoreCase("são paulo")) imposto = 0.01;
            else {
                if (cidade.equalsIgnoreCase("rio de janeiro")) imposto = 0.015;
                else imposto = 0.02;
            }
        }
        impostoCalc = (valorFixo + diaria + servicos) * imposto;
        conta = valorFixo + diaria + servicos + impostoCalc;
        System.out.println("Sua conta tem o valor de: R$" + conta);
        teclado.close();
    }
}
