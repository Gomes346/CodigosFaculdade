package ExerciciosGeral;
import java.util.Scanner;
public class c05extra01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero,n4,n1,n2,n3;
        System.out.print("Informe um numero de 4 digitos:");
        numero = teclado.nextInt();
        n4 = numero%10;
        n3 = numero%100/10;
        n2 = numero/100%10;
        n1 = numero/1000;
        if (n1==n4&&n2==n3){
            System.out.println("esse numero é palindromo");}
        else {
            System.out.println("esse numero nâo é palindromo");}
        teclado.close();
    }
}
