package ExerciciosGeral;
import java.util.Scanner;
public class c05extra02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sec,velocidade,tempoRe,veloLuz;
        System.out.print("Informe o tempo em segundos: ");
        sec = teclado.nextDouble();
        System.out.print("Informe a velocidade em m/s: ");
        velocidade = teclado.nextDouble();
        veloLuz = 3*Math.pow(10,8);
        tempoRe= sec*(1/(Math.sqrt(1-((Math.pow(velocidade,2))/(Math.pow(veloLuz,2))))));
        System.out.printf("Tempo relativo:%10.4f%s",tempoRe," segundos");
        teclado.close();

    }
}
