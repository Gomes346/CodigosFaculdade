package ExerciciosGeral;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class c08ex13 {
    public static void main(String[] args) {
        Scanner ficha = new Scanner(c08ex13.class.getResourceAsStream("c08ex13.txt"));
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o numero de cidades: ");
        String nomeMenor="oi";
        int cidadeMilhao=0,cidadeMulher=0,cidadeMenor=0;
        double percentEleitores;
        int numeroCidades = teclado.nextInt();
        for (int aux=1;aux<=numeroCidades;aux++){
            String nomeCidade = ficha.nextLine();
            int populacao = ficha.nextInt();
            int eleitores = ficha.nextInt();
            int homens = ficha.nextInt();
            int mulheres = ficha.nextInt();
            if (populacao!=(homens+mulheres))JOptionPane.showMessageDialog(null,"A soma de mulheres e homens difere da populacão da cidede de "+nomeCidade);
            if (populacao>1000000)cidadeMilhao++;
            if (mulheres>homens)cidadeMulher++;
            if (aux==1 || populacao<cidadeMenor){
                cidadeMenor=populacao;
                nomeMenor = nomeCidade;
            }
            percentEleitores =(eleitores * 100.0) /populacao;
            JOptionPane.showMessageDialog(null,"Percentual de eleitores da cidade "+nomeCidade+" é de "+percentEleitores);
            ficha.nextLine();
        }

        JOptionPane.showMessageDialog(null,"Total de cidades com mais de 1 milhão de habitantes: "+cidadeMilhao+
                "\nCidades com mais mulheres que homens: "+cidadeMulher+
                "\nCidade com menor população: "+nomeMenor);
        teclado.close();
    }
}
