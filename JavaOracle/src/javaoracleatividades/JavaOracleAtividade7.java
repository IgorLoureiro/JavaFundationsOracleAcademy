package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividade7 {
    public static void main(String[] args) throws Exception{
        
        System.out.println("Digite um nanometro para receber a cor correspondente");
        Scanner teclado = new Scanner (System.in);
        int nano = teclado.nextInt();
        teclado.close();

        if (nano < 450 && nano >= 380){

            System.out.println("Violeta");

        } 

        else if (450 <= nano && nano < 495 ){

            System.out.println("Azul");

        }

        else if (495 <= nano && nano < 570 ){

            System.out.println("Verde");

        }

        else if (570 <= nano && nano < 590 ){

            System.out.println("Amarelo");

        }

        else if (590 <= nano && nano < 620 ){

            System.out.println("Laranja");

        }

        else if (620 <= nano && nano <= 750 ){

            System.out.println("Vermelho");

        }

        else{

            System.out.println("A cor do numero digitado não existe no espectro");

        }
    }
}
