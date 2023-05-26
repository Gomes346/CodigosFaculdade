package ExerciciosGeral;

import javax.swing.JOptionPane;

public class c08ex11 {
    public static void main(String[] args) {
        String nome, idade, salario, pessoas, nomeMaior = "oi", nomeMenor = "ola";
        int sexo, estadoCivil, corOlhos, corCabelo, escolaridade, mulherPracasar = 0;
        double maiorSalario = 0, menorSalario = 0;
        pessoas = JOptionPane.showInputDialog(null, "Indique o numeros de pessoas: ");
        int pessoa;
        pessoa = Integer.valueOf(pessoas);
        for (int aux = 1; aux <= pessoa; aux++) {
            nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
            idade = JOptionPane.showInputDialog(null, "Informe sua idade: ");
            String[] botoesSexo = {"Masculino", "Feminino"};
            sexo = JOptionPane.showOptionDialog(null, "Informe seu sexo", "Exercicio 11", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesSexo, "Masculino");
            System.out.println(sexo);
            String[] botoesEstado = {"Casado", "Solteiro", "Outros"};
            estadoCivil = JOptionPane.showOptionDialog(null, "Informe seu estado civil:", "Exercicio 11", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesEstado, "Casado");
            String[] botoesOlhos = {"Azuis", "Castanos", "Pretos", "Outros"};
            corOlhos = JOptionPane.showOptionDialog(null, "Informe a cor dos seus olhos:", "Exercicio 11", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesOlhos, "Castanho");
            String[] botoesCabelos = {"Loiro", "Preto", "Castanho", "Ruivo"};
            corCabelo = JOptionPane.showOptionDialog(null, "Informe cor do seu cabelo:", "Exercicio 11", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesCabelos, "Castanho");
            salario = JOptionPane.showInputDialog(null, "Informe seu salario: ");
            String[] botoesEscola = {"1", "2", "3", "4"};
            escolaridade = JOptionPane.showOptionDialog(null, "Informe sua escolaridade:", "Exercicio 11", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesEscola, "4");
            int idadeInt = Integer.valueOf(idade);
            double salarioDoub = Integer.valueOf(salario);
            if (sexo == 1 && idadeInt >= 18 && idadeInt <= 25 && corOlhos == 0 && estadoCivil == 1 && salarioDoub > 10000 && escolaridade == 3 && corCabelo == 0)
                mulherPracasar++;
            if (aux == 1 || salarioDoub > maiorSalario) {
                maiorSalario = salarioDoub;
                nomeMaior = nome;
            }
            if (aux == 1 || salarioDoub < menorSalario) {
                menorSalario = salarioDoub;
                nomeMenor = nome;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de loiras pra casar: " + mulherPracasar + "\nNome da pessoa com maior salario: " + nomeMaior + "\nDiferença entre o maior e menor salario: " + (maiorSalario - menorSalario));
    }
}
