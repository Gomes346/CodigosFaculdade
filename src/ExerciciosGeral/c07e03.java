package ExerciciosGeral;
import java.util.Scanner;
public class c07e03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        double imposto,multa;
        System.out.print("Informe o valor do imposto: ");
        imposto = teclado.nextDouble();
        System.out.print("Informe o numero de dias de atraso: ");
        dias = teclado.nextInt();
        switch (dias){
            case 1,2,3,4,5->multa=0;
            case 6,7,8->multa=(imposto*0.02);
            case 9,10->multa=imposto*0.1+imposto*(dias*0.005);
            default -> multa=imposto*1.50+dias;
        }
        System.out.println("A multa a ser paga é de: R$"+multa);
        teclado.close();
    }
}
