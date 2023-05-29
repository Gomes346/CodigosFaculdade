package ExerciciosGeral;

public class c08ex19 {
    public static void main(String[] args) {
        int numsProg = 0;
        for (int aux = 1; aux <= 100; aux++) {
            numsProg += Math.pow(aux, 2);
        }
        System.out.println("A soma dos 100 primeiros termos= " + numsProg);
    }
}
