package javaoracleatividades;
import java.util.Random;

public class JavaOracleAtividade443 {
    
    public int RolarDados(int d1, int d2){

        Random RndNumb = new Random();

        d1 = RndNumb.nextInt(6) + 1;
        d2 = RndNumb.nextInt(6) + 1;

        int d3 = d1 + d2;
        return d3;
    }

}
