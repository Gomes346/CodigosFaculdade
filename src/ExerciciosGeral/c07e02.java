package ExerciciosGeral;
import java.util.Scanner;
public class c07e02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1,nota2,nota3,notaFinal;
        System.out.print("Informe a primeira nota: ");
        nota1 = teclado.nextInt();
        System.out.print("Informe a segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.print("Informe a terceira nota: ");
        nota3 = teclado.nextInt();
        notaFinal = (nota1+nota2+nota3)/3;
        switch (notaFinal) {
            case 9, 10 -> System.out.println("Aluno no Conceito A");
            case 8 -> System.out.println("Aluno no Conceito B");
            case 7 -> System.out.println("Aluno no Conceito C");
            case 5, 6 -> System.out.println("Aluno no Conceito D");
            case 1, 2, 3, 4 -> System.out.println("Aluno no Conceito E");
        }
        teclado.close();
    }
}
