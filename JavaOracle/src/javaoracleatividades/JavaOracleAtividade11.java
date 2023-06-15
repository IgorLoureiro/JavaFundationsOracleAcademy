package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividade11 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um numero para a largura do retangulo/Triangulo");
        int largura = teclado.nextInt();
        System.out.println("Digite um numero para representar a altura do retângulo/Triangulo");
        int altura = teclado.nextInt();
        JavaOracleAtividade112 Calculo = new JavaOracleAtividade112();
        JavaOracleAtividade113 Calculo2 = new JavaOracleAtividade113();
        JavaOracleAtividade114 Calculo3 = new JavaOracleAtividade114();
        String largura2 = Calculo.criaRetanguloLarg(largura);
        String altura2 = Calculo2.CriaRetanguloAlt(altura);
        String largura3 = Calculo3.LargTriang(largura);
        teclado.close();

        int i = 0;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        String alturatriang = "#";

        System.out.println(largura2);

        while(i + 2 < altura){

            System.out.println(altura2);
            i++;

        }

        System.out.println(largura2);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

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

        System.out.println(largura3);

    }
}
