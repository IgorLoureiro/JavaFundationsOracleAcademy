package javaoracleatividades.javaoracleatividade7;
import java.util.Random;

public class jogoticket {
    
    Random Tickets = new Random();

    private int CustoSaldo;
    private int Ticket = Tickets.nextInt(300) + 1;

    public double getCustoSaldo() {
        return CustoSaldo;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int ticket) {
        Ticket = ticket;
    }

    public void setCustoSaldo(int custoSaldo) {
        CustoSaldo = custoSaldo;
    }

    public void Jogar(cartao cartaox){

        cartaox.setSaldo(cartaox.getSaldo() - CustoSaldo);

        cartaox.setSaldotickets(cartaox.getSaldotickets() + Ticket);

        if(Ticket > 0){

            System.out.println("Parabéns você recebeu: " + Ticket + " Tickets");

        }

    }
}
