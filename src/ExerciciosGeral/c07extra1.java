package ExerciciosGeral;
import java.util.Scanner;
public class c07extra1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pergA,pergB,pergC,pergD,pergE;
        System.out.println("Responda com sim ou não");
        System.out.print("Telefonou para a vítima?");
        pergA = teclado.nextLine();
        System.out.print("Estave no local do crime?");
        pergB = teclado.nextLine();
        System.out.print("Mora perto da vítima?");
        pergC = teclado.nextLine();
        System.out.print("Devia para vítima?");
        pergD = teclado.nextLine();
        System.out.print("Já trabalhou com a vítima?");
        pergE = teclado.nextLine();
        int informacao=0;
        if (pergA.equalsIgnoreCase("sim")) {
            informacao++;
        }
        if (pergB.equalsIgnoreCase("sim")) {
            informacao++;
        }
        if (pergC.equalsIgnoreCase("sim")) {
            informacao++;
        }
        if (pergD.equalsIgnoreCase("sim")) {
            informacao++;
        }
        if (pergE.equalsIgnoreCase("sim")) {
            informacao++;
        }
        switch (informacao){
            case 2-> System.out.println("Pessoa classificada como suspeita");
            case 3,4-> System.out.println("Pessoa classificada como cúmplice");
            case 5-> System.out.println("Pessoa classificada como assassino");
            default -> System.out.println("Pessoa classificada como inocente");
        }
        teclado.close();
    }
}
