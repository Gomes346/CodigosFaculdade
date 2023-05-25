package ExerciciosGeral;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class c07extra2 {
    public static void main(String[] args) {
        Scanner tecaldo = new Scanner(System.in);
        double kilo,precoKilo,precoTotal,desconto,precoDesconto,precoFinal;
        String tipoCarne,pagamento;
        System.out.print("Imforme o tipo de carne comprada:");
        tipoCarne = tecaldo.nextLine();
        System.out.print("Informe a quantidade de carne comprada em KG:");
        kilo = tecaldo.nextDouble();
        tecaldo.nextLine();
        System.out.print("Informe o metodo de pagamento:");
        pagamento = tecaldo.nextLine();
        precoKilo=0;
        desconto=0;
        if (kilo>5){
            switch (tipoCarne){
                case "File Duplo"->precoKilo=5.80;
                case "Alcatra"->precoKilo=6.80;
                case "Picanha"->precoKilo=7.80;
            }
        }
        else {
            switch (tipoCarne){
                case "File Duplo"->precoKilo=4.90;
                case "Alcatra"->precoKilo=5.90;
                case "Picanha"->precoKilo=6.90;
            }
        }
        if (pagamento.equalsIgnoreCase("cartão Tabajara"))desconto=0.05;
        precoTotal = precoKilo * kilo;
        precoDesconto = precoTotal*desconto;
        precoFinal = precoTotal-precoDesconto;
        JOptionPane.showMessageDialog(null,"Tipo de carne comprada: "+tipoCarne+
                "\nQuantidade comprada: "+kilo+
                "\nPreço total: "+precoTotal+
                "\nTipo de pagamento: "+pagamento+
                "\nValor do desconto: "+precoDesconto+
                "\nValor a ser pago: "+precoFinal+'.',"Nota Fiscal",JOptionPane.INFORMATION_MESSAGE);
        tecaldo.close();
    }
}
