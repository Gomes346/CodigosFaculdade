package ExerciciosGeral;

import java.util.Scanner;

public class c05e05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe uma temperatura em celsius: ");
        double celsius = teclado.nextDouble();
        double kelvin = celsius + 273.0;
        double fahrenheit = (celsius * 9.0 + 160.0) / 5.0;
        System.out.println("a temperatura em kelvin= " + kelvin);
        System.out.println("a temperatura em fahrenheit= " + fahrenheit);
        teclado.close();
    }
}
