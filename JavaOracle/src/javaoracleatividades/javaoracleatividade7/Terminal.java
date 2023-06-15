package javaoracleatividades.javaoracleatividade7;
import java.util.*;

public class Terminal {
    private int dinheiro;

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int[] VerificarSaldo(cartao nCartao){

        int[] saldosenome = new int [3];

        saldosenome[0] = nCartao.getNumeroIdentificador();
        saldosenome[1] = nCartao.getSaldo();
        saldosenome[2] = nCartao.getSaldotickets();

        return saldosenome;

    }

    public String TransferirSaldo(cartao cartaox, cartao cartaoy, int valortransferir){

        String Erro = "Não foi possivel realizar a transfêrencia";
        String sucesso = "A transfêrencia foi realizada";

        if (cartaox.getSaldo() < valortransferir){

            return Erro;

        } else {

            cartaox.setSaldo(cartaox.getSaldo() - valortransferir);
            cartaoy.setSaldo(cartaoy.getSaldo() + valortransferir);

            return sucesso;
        }

    }

    public String Recarga(int dinheiro, cartao cartaox){

        String maior = "Recarga feita com sucesso";
        String menor = "Valor invalido";

        if (dinheiro > 0){

            cartaox.setSaldo(cartaox.getSaldo() + Math.abs(dinheiro/2));
            return maior;

        }

        else{

            return menor;

        }
        
    }

    public String TrocaTickets (cartao cartaox){

        System.out.println("Você deseja qual prêmio? \n1- Ursinho de Pelucia: 200 \n2 - Uma magnum .48: 500 \n3- Um CD do Leléo de camargo e luciano: 1000 \n0-Sair");
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
        teclado.close();
        
        String ursinho = "Parábens, você ganhou um ursinho";
        String magnum = "Parabéns, você ganhou uma magnum .48";
        String Leleo = "Um CD do Leléo de camargo e luciano";
        String fechando = "Fechando";

        if(numero == 1 || cartaox.getSaldotickets() >= 200){


            cartaox.setSaldotickets(cartaox.getSaldotickets() - 200);

            return ursinho;
        } else {

            if(numero == 2 || cartaox.getSaldotickets() >= 500){

                cartaox.setSaldotickets(cartaox.getSaldotickets() - 500);

                return magnum;

            } else {

                if(numero == 3 || cartaox.getSaldotickets() >= 1000){

                    cartaox.setSaldotickets(cartaox.getSaldotickets() - 1000);

                    return Leleo;

                } else{

                    return fechando;

                }

            }

        }
    }

}
