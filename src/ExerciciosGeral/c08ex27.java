package ExerciciosGeral;

public class c08ex27 {
    public static void main(String[] args) {
        for (int rep = 1; rep <= 10; rep++) {
            for (int aux = 10; aux <= 10; aux++) {
                for (int aux1 = 1; aux1 <= 256; aux1 *= 2) {
                    System.out.println();
                    for (int aux2 = 1; aux2 <= aux1; aux2++) {
                        System.out.print("*");
                    }
                }
                for (int aux1 = 128; aux1 >= 1; aux1 /= 2) {
                    System.out.println();
                    for (int aux2 = 1; aux2 <= aux1; aux2++) {
                        System.out.print("*");
                    }
                }
            }
        }
    }
}
