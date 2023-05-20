package ExerciciosGeral;
import java.util.Scanner;
public class c04e03 {
    public static void main(String[] args) {
        double multaMin, multaMed, multaMax, poluenteMin, poluenteMax;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de poluentes para gerar multa minima: ");
        poluenteMin = teclado.nextDouble();
        System.out.print("Inforeme a quantidade de poluentes para gerar multa maxima: ");
        poluenteMax = teclado.nextDouble();
        System.out.print("Informe o valor da multa minima: ");
        multaMin = teclado.nextDouble();
        System.out.print("Informe o valor da multa entre a multa maxima e a minima: ");
        multaMed = teclado.nextDouble();
        System.out.print("Informe o valor da multa por poluente emitido da multa maxima: ");
        multaMax = teclado.nextDouble();
        System.out.println();
        System.out.println("=====================================================================");
        System.out.println("---------Quantidade de Poluente Emitido x Valor da multa-------------");
        System.out.println("_____________________________________________________________________");
        System.out.println("Ate "+poluenteMin+" multa de R$"+multaMin                             );
        System.out.println("Entre "+poluenteMin+" e "+"multa de R$"+multaMed                      );
        System.out.println("Acima de "+poluenteMax+" multa de R$"+multaMax+" por poluente emitido");
        System.out.println("=====================================================================");
        teclado.close();
    }
}
