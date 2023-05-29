package ExerciciosGeral;
import java.util.Scanner;
public class c08ex20 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Informe o numero de termos: ");
        int quanTermos= teclado.nextInt();
        double somaTermos=0,termo;
        for (int aux=1;aux<=quanTermos;aux++){
                termo = Math.pow(2.0,aux);
                somaTermos +=termo;
            System.out.println(termo);
        }
        System.out.println("Soma dos termos="+somaTermos);
        teclado.close();
    }
}
