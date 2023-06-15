package javaoracleatividades;
import java.util.Scanner;

public class JavaOracleAtividade9 {
    public static void main(String[] args) throws Exception{
        
        Scanner teclado = new Scanner (System.in);

        String PinCorrect = "J1234";

        System.out.println("Informe o seu pin ou digite zero para sair");
        String pin = teclado.nextLine();
        boolean teste = pin.equals(PinCorrect);

        if (teste == true){

            System.out.println("Acesso permitido");

        }

        else if (pin.equals("0") == false){

            while (teste != true){

                System.out.println("Pin errado, tente o digitar o Pin novamente ou digite 0 para sair");
                pin = teclado.nextLine();
                teste = pin.equals(PinCorrect);
    
                if (pin.equals("0") == true){
    
                    System.out.println("Até mais tarde");
                    break;
    
                }
    
                if (teste == true){
    
                    System.out.println("Acesso permitido");
                    break;
    
                }
            }

        } 

        else {

            System.out.println("Até mais tarde");

        }

        teclado.close();

    }

}
