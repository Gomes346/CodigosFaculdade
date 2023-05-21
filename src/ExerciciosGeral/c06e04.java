package ExerciciosGeral;

import java.util.Scanner;

public class c06e04 {
    public static void main(String[] args) {
        String nome;
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu nome:");
        nome = teclado.nextLine();
        System.out.print("Informe seu peso:");
        peso = teclado.nextDouble();
        System.out.print("Informe sua altura:");
        altura = teclado.nextDouble();
        imc = peso / Math.pow(altura, 2);
        if (imc < 18) System.out.println("Pessoa esta desnutrida");
        else {
            if (imc < 20 && imc >= 18) System.out.println("Pessoa esta abaixo do peso");
            else {
                if (imc >= 20 && imc <= 25) System.out.println("Pessoa esta no peso ideal");
                else {
                    if (imc <= 27 && imc > 25) System.out.println("Pessoa esta acima do peso");
                    else System.out.println("Pessoa esta obesa");
                }
            }
        }
        System.out.println(nome + " Seu IMC= " + imc);
        teclado.close();
    }
}
