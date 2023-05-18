
public class CalcPI {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 10000; aux++) {
            num = 1;
            den = aux*2+1;
            if (aux%2!=0)serie+=num/den;
            else serie-=num/den;
        }
        System.out.print("Valor da Série = " + 4*(1-serie));
    }
}
