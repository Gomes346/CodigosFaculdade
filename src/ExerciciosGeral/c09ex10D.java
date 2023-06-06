package ExerciciosGeral;

public class c09ex10D {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {
            num = aux+aux-1;
            if (aux%2!=0)den=aux*aux;
            else den=Math.pow(aux,2);
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);
    }
}
