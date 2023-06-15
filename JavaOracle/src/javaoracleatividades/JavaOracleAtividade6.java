package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividade6 {
    public static void main(String[] args) {
        
        System.out.println("Digite seu nome");
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.next();
        String [] nomes = nome.split("-");
        teclado.close();

        System.out.println(nome.charAt(0) + ", " + nomes[1]);

       

    }
    
}
