package ExerciciosGeral;
import java.util.Scanner;
public class c04e01 {
    public static void main(String[] args) {
        int idade;
        String priNomr,sobNomes,secNome;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu primeiro nome: ");
        priNomr = teclado.next();
        System.out.print("Informe seu segundo nome: ");
        secNome = teclado.next();
        System.out.print("Informe seu sobre nome: ");
        sobNomes = teclado.next();
        System.out.print("informe sua idade: ");
        idade = teclado.nextInt();
        System.out.println(sobNomes+", "+priNomr+" "+secNome);
        System.out.println("idade: "+idade+" anos");
        teclado.close();
    }
}
