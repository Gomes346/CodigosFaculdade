package ExerciciosGeral;
import java.util.Scanner;
public class c09ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o numero de termos: ");
        int rep = teclado.nextInt();
        double num, den, serie = 0;
        for (int aux = 1; aux <= rep; aux++) {
            num = ((aux*4)-3)*((aux*4)-2);
            den = ((aux*4)-1)*(aux*4);
            serie += num / den;
        }
        System.out.print("Valor da Série = " + Math.sqrt(serie));
    }
}
