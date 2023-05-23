package ExerciciosGeral;

import java.util.Scanner;

public class c06e17 {
    public static void main(String[] args) {
        String p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Responda com V para verdadeiro e F para falso");
        System.out.print("Você tem curso técnico de programação?");
        p1 = teclado.nextLine();
        System.out.print("Você tem curso superior de programação?");
        p2 = teclado.nextLine();
        System.out.print("Você tem menos de 3 anos de experiência em programação?");
        p3 = teclado.nextLine();
        System.out.print("Você se considera uma pessoa criativa?");
        p4 = teclado.nextLine();
        System.out.print("Você prefere liderar a ser liderado?");
        p5 = teclado.nextLine();
        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe?");
        p6 = teclado.nextLine();
        System.out.print("Você é autodidata (aprende sozinho)?");
        p7 = teclado.nextLine();
        System.out.print("Você aceitaria uma remuneração inicial de R$1500?");
        p8 = teclado.nextLine();
        if (p5.equalsIgnoreCase("v") && p8.equalsIgnoreCase("v"))
            System.out.println("Você nao deve aceitar uma remuneração inicial de 1500");
        else {
            System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
            p9 = teclado.nextLine();
            if (p4.equalsIgnoreCase("f")) System.out.println("Não apto a trabalhar nesta empresa");
            else {
                if (p6.equalsIgnoreCase("v")) System.out.println("Não apto a trabalhar nesta empresa");
                else {
                    if (p7.equalsIgnoreCase("f")) System.out.println("Não apto a trabalhar nesta empresa");
                    else {
                        if (p1.equalsIgnoreCase("v") && p2.equalsIgnoreCase("f") && p3.equalsIgnoreCase("f"))
                            System.out.println("Não apto a trabalhar nesta empresa");
                        else System.out.println("Você esta apto a trabalhar nessa empresa");

                    }
                }
            }
        }
        teclado.close();
    }
}
