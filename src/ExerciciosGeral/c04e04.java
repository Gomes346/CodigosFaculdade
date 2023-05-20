package ExerciciosGeral;
import javax.swing.JOptionPane;
public class c04e04 {
    public static void main(String[] args) {
        String nome, sobNome, secNome, idade;
        nome = JOptionPane.showInputDialog(null,
                "Qual seu primeiro nome?",
                "Exercicio 4",
                JOptionPane.QUESTION_MESSAGE);
        secNome = JOptionPane.showInputDialog(null,
                "Qual seu segundo nome?",
                "Exercicio 4",
                JOptionPane.QUESTION_MESSAGE);
        sobNome = JOptionPane.showInputDialog(null,
                "Qual seu sobrenome",
                "Exercicio 4",
                JOptionPane.QUESTION_MESSAGE);
        idade = JOptionPane.showInputDialog(null,
                "Qual sua idade?",
                "Exercicio 4",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                sobNome+", "+nome+" "+secNome+"\nIdade: "+idade+" anos.",
                null,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
