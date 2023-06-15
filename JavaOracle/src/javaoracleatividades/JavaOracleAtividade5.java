package javaoracleatividades;

public class JavaOracleAtividade5 {
    public static void main(String[] args) {
        
        JavaOracleAtividade441 Calculo = new JavaOracleAtividade441();
        JavaOracleAtividade442 Calculo2 = new JavaOracleAtividade442();
        JavaOracleAtividade443 Calculo3 = new JavaOracleAtividade443();
        double TempC = Calculo.Temperatura(100.4);
        double Hip = Calculo2.hipotenusa(7, 8);
        double Dados = Calculo3.RolarDados(0, 0);
        System.out.println("A temperatura em celsius é " + TempC);
        System.out.println("A hipotenusa é " + Hip);
        System.out.println("O resultado dos dados foi de " + Dados);

    }   
}
