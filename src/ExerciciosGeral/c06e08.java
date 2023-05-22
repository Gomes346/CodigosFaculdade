package ExerciciosGeral;

import java.util.Scanner;

public class c06e08 {
    public static void main(String[] args) {
        double imc, pesoIdealMax, pesoIdealMin = 0, altura;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe sua altura em metros: ");
        altura = teclado.nextDouble();
        imc = pesoIdealMin / (Math.pow(altura, 2));
        if (imc < 20) {
            pesoIdealMin = 20 * Math.pow(altura, 2);
            pesoIdealMax = 25 * Math.pow(altura, 2);
        } else {
            if (imc >= 20 && imc <= 25) {
                pesoIdealMin = pesoIdealMax = pesoIdealMin = 25 * Math.pow(altura, 2);
            } else {
                pesoIdealMin = 20 * Math.pow(altura, 2);
                pesoIdealMax = 25 * Math.pow(altura, 2);
            }
        }
        System.out.println("Para " + nome + " ter um peso ideal o minimo é de= " + pesoIdealMin + "kg e maximo de= " + pesoIdealMax);
        teclado.close();


    }
}
