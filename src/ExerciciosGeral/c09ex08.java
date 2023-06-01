package ExerciciosGeral;

public class c09ex08 {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 20; aux++) {
            num = ((aux * 2) + 1) * Math.sqrt((aux * 4) + 1);
            den = Math.pow(5, aux);
            serie += num / den;
        }
        System.out.print("Valor da Série = " + Math.pow(serie, 2));
    }

}
