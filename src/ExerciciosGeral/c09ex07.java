package ExerciciosGeral;

public class c09ex07 {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 6; aux++) {
            num = (aux - 1) * 2 + (aux * 3);
            den = (aux * 6) + 1;
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);
    }
}
