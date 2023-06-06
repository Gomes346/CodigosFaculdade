package ExerciciosGeral;

public class c09ex10C {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 2; aux <= 201; aux+=2) {
            num = aux-1;
            den = aux;
            serie += num / den;
        }
        System.out.print("Valor da Série = " + ((1.0/3)*Math.pow(serie,2)));
    }
}
