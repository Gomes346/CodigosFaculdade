package ExerciciosGeral;

public class c08ex28 {
    public static void main(String[] args) {
        int soma = 0, cont = 0, media, num1 = 1, num2 = 2, num3 = 3;
        for (int aux = 1; aux <= 1000; aux++) {
            int mult = num1 * num2 * num3;
            if (mult < 1000) {
                System.out.println(mult);
                soma += mult;
                cont++;
                num1++;
                num2++;
                num3++;
            } else break;
        }
        media = soma / cont;
        System.out.println("Media= " + media);
    }
}
