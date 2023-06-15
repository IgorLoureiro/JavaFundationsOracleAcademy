package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividadeTeste{

    public static void main(String[] args) throws Exception{

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero para a largura do retangulo/Triangulo");
        int largura = teclado.nextInt();
        System.out.println("Digite um numero para representar a altura do retângulo/Triangulo");
        int altura = teclado.nextInt();
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;

        String larguratriang = "";
        String alturatriang = "#";


        while(i < largura){

            larguratriang = larguratriang + "#";
            i++;
        }

        System.out.println(alturatriang);

        while(i2 + 2 < altura){

            while(i3 > i4){

                alturatriang = alturatriang + " ";
                i4++;
            }
            i3 = 1;
            i4 = 0;
            i2++;

            System.out.println(alturatriang + "#");
            
        }

        System.out.println(larguratriang);
    }
}