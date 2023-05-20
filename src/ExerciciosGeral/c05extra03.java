package ExerciciosGeral;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class c05extra03 {
    public static void main(String[] args) {
        String fazendaMudas, papelao, madeira, frete, perdaMuda, custoTotalS;
        fazendaMudas = JOptionPane.showInputDialog(null, "Informe a quantidade de mudas da fazenda:", "Extra3", JOptionPane.QUESTION_MESSAGE);
        papelao = JOptionPane.showInputDialog(null, "Infome o valor unitario das caixas de papelao:\nUtilize o (.) para caso de descimais", "Extra 3", JOptionPane.QUESTION_MESSAGE);
        madeira = JOptionPane.showInputDialog(null, "Infome o valor unitario das caixas de madeira:\nUtilize o (.) para caso de descimais", "Extra 3", JOptionPane.QUESTION_MESSAGE);
        frete = JOptionPane.showInputDialog(null, "Informe o valor do frete:\nUtilize o (.) para caso de descimais", "Extra 3", JOptionPane.QUESTION_MESSAGE);
        perdaMuda = JOptionPane.showInputDialog(null, "Informe o numero de mudas perdidas:", "Extra 3", JOptionPane.QUESTION_MESSAGE);
        double freteD, custoTotal, custoFrete, custoCaixas, papelaoD, madeiraD;
        int mudasD, caixaPapelao, caixaMadeira, caminhao, perdaM, mudasTotal;
        mudasD = Integer.valueOf(fazendaMudas);
        papelaoD = Double.valueOf(papelao);
        madeiraD = Double.valueOf(madeira);
        freteD = Double.valueOf(frete);
        perdaM = Integer.valueOf(perdaMuda);
        mudasTotal = mudasD - perdaM;
        caixaPapelao = mudasTotal / 7;
        caixaMadeira = caixaPapelao / 15;
        caminhao = caixaMadeira / 50;
        if (mudasTotal % 7 > 0) caixaPapelao++;
        if (caixaPapelao % 15 > 0) caixaMadeira++;
        if (caixaMadeira % 50 > 0) caminhao++;
        custoCaixas = (caixaPapelao * papelaoD) + (caixaMadeira * madeiraD);
        custoFrete = caminhao * freteD;
        custoTotal = custoFrete + custoCaixas;
        custoTotalS = new DecimalFormat("R$ #,##0.00").format(custoTotal);
        JOptionPane.showMessageDialog(null, "O custo foi de " + custoTotalS, "Extra 3", JOptionPane.INFORMATION_MESSAGE);
    }
}
