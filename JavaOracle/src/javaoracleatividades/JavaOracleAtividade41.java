package javaoracleatividades;

public class JavaOracleAtividade41 {
    public static void main(String[] args) throws Exception {
        
        Double TempC, TempF;
        TempF = 250.0;

        TempC = CalcTemp(TempF);
        System.out.println("O valor em Celsius é " + TempC);

    }

    public static Double CalcTemp(Double a){

        Double TempCT = (0.5555555555555556 * (a - 32));
            return TempCT;
    }
}
