package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividade8 {
    public static void main(String[] args) throws Exception{

        System.out.println("Qual a cor do sinal? \n 1 - Vermelho \n 2 - Verde \n 3 - Amarelo");
        Scanner teclado = new Scanner (System.in);
        int cor = teclado.nextInt();
        teclado.close();

        switch (cor){

            case 1: System.out.println("A proxima sera Verde");
            break;
            case 2: System.out.println("A proxima sera amarela");
            break;
            case 3: System.out.println("A peoxima sera vermelha");
            break;
            default: System.out.println("Não foi possivel identificar o numero enviado");
            break;

        }
        
    }
}
