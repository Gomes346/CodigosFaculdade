package ExerciciosGeral;

public class c08ex23 {
    public static void main(String[] args) {
        int n4, n1, n2, n3;
        for (int numero = 1000; numero <= 9999; numero++) {
            n4 = numero % 10;
            n3 = numero % 100 / 10;
            n2 = numero / 100 % 10;
            n1 = numero / 1000;
            if (n1 == n4 && n2 == n3) System.out.println(numero + " ");
        }
    }
}
