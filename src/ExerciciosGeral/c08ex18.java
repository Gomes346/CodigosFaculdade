package ExerciciosGeral;
import java.util.Scanner;
public class c08ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Informe um numero inteiro de 1 a 9: ");
        num = teclado.nextInt();
        for (int aux=1;aux<=9;aux++){
            int resutMult = aux*num;
            System.out.println(num+" x "+aux+" = "+resutMult);
        }
        teclado.close();
    }
}
