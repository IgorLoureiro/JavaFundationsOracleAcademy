package javaoracleatividades;
import java.util.Random;

public class JavaOracleAtividade43 {
    public static void main(String[] args) {

       int d1 = 0;
       int d2 = 0;

        int d3 = CalcDados(d1, d2);
        System.out.println(d3);
    
    }

    public static int CalcDados (int d1, int d2){

        Random RndNumb = new Random();

        d1 = RndNumb.nextInt(6) + 1;
        d2 = RndNumb.nextInt(6) + 1;

        int d3 = d1 + d2;
            return d3;
    }

}
