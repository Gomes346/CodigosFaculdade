package ExerciciosGeral;
import java.util.Scanner;
public class c05e01 {
    public static void main(String[] args) {
        double x,resutFuncao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de x para caLcular a funcao f(x)+x3+4X+10:");
        x = teclado.nextDouble();
        resutFuncao = Math.pow(x,3) + 4*x + 10;
        System.out.println("Valor da funcao : "+resutFuncao);
        teclado.close();

    }
}
