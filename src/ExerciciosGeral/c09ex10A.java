package ExerciciosGeral;

public class c09ex10A {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            num = aux;
            den = Math.sqrt(aux*2);
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);
    }
}
