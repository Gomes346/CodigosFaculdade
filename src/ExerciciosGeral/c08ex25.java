package ExerciciosGeral;

public class c08ex25 {
    public static void main(String[] args) {
        for (int aux = 1; aux <= 10; aux++) {
            for (int aux1 = 1; aux1 <= 5; aux1++) {
                System.out.println();
                for (int aux2 = 1; aux2 <= aux1; aux2++){
                    System.out.print("*"+" ");
                }
            }
            for (int aux1 = 5; aux1 >= 1; aux1--) {
                System.out.println();
                for (int aux2 = 1; aux2 <= aux1; aux2++){
                    System.out.print("*"+" ");
                }
            }
        }
    }
}
