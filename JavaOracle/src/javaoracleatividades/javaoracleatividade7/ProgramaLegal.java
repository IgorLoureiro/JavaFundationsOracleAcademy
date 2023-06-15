package javaoracleatividades.javaoracleatividade7;

import java.util.*;

public class ProgramaLegal {
    public static void main(String[] args) throws Exception{

        Random s2 = new Random();
        cartao Lista = new cartao();

        Terminal verificador = new Terminal();
        Terminal transferir = new Terminal();
        jogoticket jogar = new jogoticket();

        cartao cartao1 = new cartao();
        cartao cartao2 = new cartao();

        cartao1.setNumeroIdentificador(s2.nextInt(1000) + 1);
        cartao1.setSaldo(25);
        cartao1.setSaldotickets(0);

        Lista.cartoes.add(cartao1.getNumeroIdentificador());

        cartao2.setNumeroIdentificador(s2.nextInt(1000) + 1);
        cartao2.setSaldo(0);
        cartao2.setSaldotickets(0);

        Lista.cartoes.add(cartao2.getNumeroIdentificador());

        System.out.println(Lista.cartoes);

        int[] verificar = verificador.VerificarSaldo(cartao1);
        
        System.out.println("Numero de Identificação: " + verificar[0] + "\nSaldo: " + verificar[1] + "\nQuantidade de Tickets: " + verificar[2]);

        verificar = verificador.VerificarSaldo(cartao2);

        System.out.println("Numero de Identificação: " + verificar[0] + "\nSaldo: " + verificar[1] + "\nQuantidade de Tickets: " + verificar[2]);

        String transferirString = transferir.TransferirSaldo(cartao1, cartao2, 25);

        System.out.println(transferirString);

        verificar = verificador.VerificarSaldo(cartao1);

       System.out.println("Numero de Identificação: " + verificar[0] + "\nSaldo: " + verificar[1] + "\nQuantidade de Tickets: " + verificar[2]);

       verificar = verificador.VerificarSaldo(cartao2);

       System.out.println("Numero de Identificação: " + verificar[0] + "\nSaldo: " + verificar[1] + "\nQuantidade de Tickets: " + verificar[2]);
        
       String resultadorecarga = verificador.Recarga(25, cartao2);

       System.out.println(resultadorecarga);

       jogar.Jogar(cartao2);

       String RespostaTrocaTickets = transferir.TrocaTickets(cartao2);

       System.out.println(RespostaTrocaTickets);
        
    }
}
