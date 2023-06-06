package ExerciciosGeral;

public class c09ex10F {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            num =Math.pow(aux,2);
            den =Math.pow(aux*2,2);
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);
    }
}
