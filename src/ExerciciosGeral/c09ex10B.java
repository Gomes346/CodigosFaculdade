package ExerciciosGeral;

public class c09ex10B {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            num = aux*2;
            den = aux*3;
            serie += num / den;
        }
        System.out.print("Valor da Série = " + (1+Math.sqrt(serie)));
    }
}
