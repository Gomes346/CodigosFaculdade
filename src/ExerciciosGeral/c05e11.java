package ExerciciosGeral;

import java.util.Scanner;

public class c05e11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("indique um numero de codigo de barra: ");
        int codigo = teclado.nextInt();
        int banco = codigo / 1000000;
        int agencia = codigo /1000%1000;
        int sequencial = codigo % 1000;
        System.out.println("Banco= " + banco);
        System.out.println("Agencia= " + agencia);
        System.out.println("Sequencial= " + sequencial);
        teclado.close();
    }
}
