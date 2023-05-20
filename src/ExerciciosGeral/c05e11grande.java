package ExerciciosGeral;

import java.util.Scanner;

public class c05e11grande {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("indique um numero de codigo de barra: ");
        int codigo = teclado.nextInt();
        int b1 = codigo / 100000000;
        int b2 = codigo / 10000000 % 10;
        int b3 = codigo / 1000000 % 10;
        String banco = "" + b1 + b2 + b3;
        int a1 = codigo / 100000 % 10;
        int a2 = codigo / 10000 % 10;
        int a3 = codigo / 1000 % 10;
        String agencia = "" + a1 + a2 + a3;
        int s1 = codigo / 100 % 10;
        int s2 = codigo / 10 % 10;
        int s3 = codigo % 10;
        String sequencial = "" + s1 + s2 + s3;
        System.out.println("Banco= " + banco);
        System.out.println("Agencia= " + agencia);
        System.out.println("Sequencial= " + sequencial);
        teclado.close();
    }
}
