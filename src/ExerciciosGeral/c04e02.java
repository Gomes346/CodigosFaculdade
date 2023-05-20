package ExerciciosGeral;
import java.util.Scanner;
public class c04e02 {
    public static void main(String[] args) {
        String nome,cpf,identidade,titulo,cnh,nomeEmpresa;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("informe seu cpf: ");
        cpf = teclado.nextLine();
        System.out.print("informe sua identidade: ");
        identidade = teclado.nextLine();
        System.out.print("informe seu titulo de eleitor: " );
        titulo = teclado.nextLine();
        System.out.print("informe sua cnh: ");
        cnh = teclado.nextLine();
        System.out.print("informe nome da sua empresa: ");
        nomeEmpresa = teclado.nextLine();
        System.out.print("informe seu salario: ");
        salario = teclado.nextDouble();
        System.out.println("FICHA FUNCIONAL DE : "+ nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println("CPF ......................."+cpf);
        System.out.println("C.I. ......................"+identidade);
        System.out.println("Titulo de eleitor ........."+titulo);
        System.out.println("Carteira de motorista ....."+cnh);
        System.out.println();
        System.out.println("Empresa: "+nomeEmpresa);
        System.out.println("Salario: R$"+salario);
        teclado.close();

    }
}
