package ExerciciosGeral;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class c04e05 {
    public static void main(String[] args) {
        String nome, empresa, identidade, titulo, cnh, salario, cpf;
        Scanner ficha = new Scanner(c04e05.class.getResourceAsStream("ficha.txt"));
        nome = ficha.nextLine();
        cpf = ficha.nextLine();
        identidade = ficha.nextLine();
        titulo = ficha.nextLine();
        cnh = ficha.nextLine();
        ficha.hasNextLine();
        empresa = ficha.nextLine();
        salario = ficha.nextLine();
        
        JOptionPane.showMessageDialog(null,
                "FICHA FUNCIONAL DE: " + nome + "\n" +
                        "\nDocumentos:" +
                        "\nCPf....................." + cpf +
                        "\nC.I....................." + identidade +
                        "\nTitulo de eleitor......." + titulo +
                        "\nCarteira de motorista..." + cnh + "\n" +
                        "\nEmpresa: " + empresa +
                        "\nSalario: R$" + salario,
                "ficha",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
