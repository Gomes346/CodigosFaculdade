package ExerciciosGeral;
import java.util.Scanner;
public class c08ex30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique o valor de x: ");
        double x= teclado.nextDouble();
        System.out.print("Indique o valor de n: ");
        double n= teclado.nextDouble();
        double soma=0;
        for (int aux=1;aux<=n;aux++){
            soma+=Math.pow(x,aux)/aux;
        }
        System.out.println(soma+(Math.log(x)*2.3));
        teclado.close();
    }
}
