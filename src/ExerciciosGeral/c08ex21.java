package ExerciciosGeral;
import java.util.Scanner;
public class c08ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        double altura = teclado.nextDouble();
        double imc;
        String situacao;
        for (int peso=60;peso<=100;peso++){
            imc = peso/Math.pow(altura,2);
            if (imc<20)situacao="Abaixo do peso";
            else if (imc<=25) {situacao="Peso ideal";
            }else situacao="Acima do peso";
            System.out.println("Peso= "+peso+" IMC= "+imc+" Stuacão Corporea= "+situacao);
        }
        teclado.close();
    }
}
