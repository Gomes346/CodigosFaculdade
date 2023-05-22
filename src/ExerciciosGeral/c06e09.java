package ExerciciosGeral;

import java.util.Scanner;

public class c06e09 {
    public static void main(String[] args) {
        double altura, pesoIdeal;
        String sexo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu sexo F=feminino M=masculino: ");
        sexo = teclado.nextLine();
        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextDouble();
        if (sexo.equalsIgnoreCase("m")) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        } else {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é de: " + pesoIdeal);
        }
        teclado.close();


    }
}
