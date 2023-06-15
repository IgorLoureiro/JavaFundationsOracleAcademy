package javaoracleatividades;

public class JavaOracleAtividade42 {
    public static void main(String[] args) {
        
        double a, b, c;
        a = 5;
        b = 6;

        c = CalcHip(a, b);
        System.out.println(c);
    }

    public static double CalcHip(double a, double b){

        double hip = Math.sqrt((a*a) + (b*b));
            return hip;


    }
}
