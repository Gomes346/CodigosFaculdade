package ExerciciosGeral;

public class c08ex24 {
    public static void main(String[] args) {
        double serie, potencia, seqPotencia = 0;
        for (int aux=1; aux <= 99; aux+=2) {
            potencia = Math.pow(2.0, aux);
            seqPotencia += potencia;
        }
        serie = (1/ 3.0) * seqPotencia;
        System.out.println("O valor da serie é= " + serie);
    }
}
