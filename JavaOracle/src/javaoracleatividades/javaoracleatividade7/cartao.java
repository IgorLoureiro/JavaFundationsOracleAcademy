package javaoracleatividades.javaoracleatividade7;
import java.util.*;

public class cartao {

    private int NumeroIdentificador;
    private int saldo;
    private int saldotickets;

    HashSet<Integer> cartoes = new HashSet<Integer>();

    public void setNumeroIdentificador(int NumeroIdentificador) {

        if (NumeroIdentificador == 0){

            System.out.println("Numero Identificador invalido");
        
        }   
        
        else if (cartoes.contains(NumeroIdentificador)){

            System.out.println("Numero Identificador invalido");

        }
        
        else{

            this.NumeroIdentificador = NumeroIdentificador;

        }
    }

    public int getNumeroIdentificador() {
        return NumeroIdentificador;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldotickets(int saldotickets) {
        this.saldotickets = saldotickets;
    }
    public int getSaldotickets() {
        return saldotickets;
    }

    

}
