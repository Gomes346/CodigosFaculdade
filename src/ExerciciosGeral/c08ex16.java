package ExerciciosGeral;
public class c08ex16 {
    public static void main(String[] args) {
        int impares=0,contImpar=0;
        for (int aux=1000;aux<=2000;aux++){
            if (aux%2==0){
                impares+=aux;
                contImpar++;
            }
        }
        System.out.println("Media dos impares= "+(impares/contImpar));
    }
}
