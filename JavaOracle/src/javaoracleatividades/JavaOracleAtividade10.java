package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividade10 {
    public static void main(String[] args) throws Exception{
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe um numero para receber seus multiplos até doze");
        int num = teclado.nextInt();
        teclado.close();

        for(int i = 1;i <= 12; i++){

            int mult = num * i;
            System.out.printf("A multiplicação de %d por %d é igual a %d", num, i, mult);
            System.out.println(" ");
        }

    }
}
