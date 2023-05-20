package ExerciciosGeral;
import java.util.Scanner;
public class c05e03 {
    public static void main(String[] args) {
        double salario,numDeDependente,liquido,imposto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu salario:");
        salario = teclado.nextDouble();
        System.out.println("Informe o numero de dependentes:");
        numDeDependente = teclado.nextDouble();
        liquido = salario - (numDeDependente*60.0);
        imposto = liquido * 15/100;
        System.out.println("O valor a ser retido de Imposto de Renda= "+imposto);
        teclado.close();

    }
}
