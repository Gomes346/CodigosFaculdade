package ExerciciosGeral;
import java.util.Scanner;
public class c05e02 {
    public static void main(String[] args) {
        double raio, area, volume,pi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do raio: ");
        raio = teclado.nextDouble();
        pi = 3.1416;
        area = 4*pi* Math.pow(raio,2);
        volume = (4.0/3) * pi * Math.pow(raio,3);
        System.out.println("Area= "+area+
                "\nVolume= "+volume);
        teclado.close();

    }
}
