package ExerciciosGeral;

import java.util.Scanner;

public class c08ex31 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome, codigo, menorNome = "zzz";
        double salarioBruto, qntEnge, salarioMenor = 0, somaAdimin = 0;
        int contC = 0, contP = 0, contO = 0, contA = 0, contX5000 = 0, contSalarioCerto = 0;
        System.out.print("Infome o numero de engenheiros: ");
        qntEnge = tec.nextDouble();
        for (int aux = 1; aux <= qntEnge; aux++) {
            System.out.print("Informe seu nome: ");
            nome = tec.nextLine();
            System.out.print("Informe o codigo do cargo: ");
            codigo = tec.nextLine();
            System.out.print("Informe seu salario bruto: ");
            salarioBruto = tec.nextDouble();
            if (codigo.equalsIgnoreCase("c")) {
                contC++;
                if (salarioBruto < 2500) System.out.println("Abaixo do salario minimo!");
                else contSalarioCerto++;
            }
            if (codigo.equalsIgnoreCase("p")) {
                contP++;
                if (salarioBruto < 4650) System.out.println("Abaixo do salario minimo!");
                else contSalarioCerto++;
            }
            if (codigo.equalsIgnoreCase("o")) {
                contO++;
                if (salarioBruto < 3200) System.out.println("Abaixo do salario minimo!");
                else contSalarioCerto++;
            }
            if (codigo.equalsIgnoreCase("a")) {
                contA++;
                somaAdimin += salarioBruto;
                if (salarioBruto < 5100) System.out.println("Abaixo do salario minimo!");
                else contSalarioCerto++;
            }
            if (codigo.equalsIgnoreCase("x") && salarioBruto > 5000) {
                contX5000++;
            }
            if (salarioBruto < salarioMenor || aux == 1) {
                salarioMenor = salarioBruto;
                menorNome = nome;
            }
        }
        System.out.println("Media de salarios dos Admins: " + somaAdimin / contA);
        System.out.println("Quantidades de salarios acima do minimo: " + contSalarioCerto);
        System.out.println("Quantidede de engenheiros em outros que recebe mais de 5000: " + contX5000);
        System.out.println("Nome e salario do engenheiro com menor salario: " + menorNome + ", R$" + salarioMenor);
        tec.close();
    }
}
