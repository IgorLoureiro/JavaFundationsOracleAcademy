package javaoracleatividades.javaoracleatividade8aula;
import java.util.*;

public class jogo {

    int placarTime1;
    int placarTime2;
    double Temperatura;
    int ID;
    Equipe time1;
    Equipe time2;
    LaLiga liga = new LaLiga();
    Random Placar = new Random();

    public void setID() {
        
        ID = liga.listajogo.size() + 1;
    }
    public void setPlacarTime1() {
        placarTime1 = Placar.nextInt(3);

        if (Temperatura >= 25 && Temperatura < 31){

            placarTime1 = Placar.nextInt(4);

        } 

        else if (Temperatura >= 31 && Temperatura < 36){

            placarTime1 = Placar.nextInt(5);

        }

        else if (Temperatura >= 36){

            placarTime1 = Placar.nextInt(6);

        }

    }
    public void setPlacarTime2() {
        placarTime2 = Placar.nextInt(3);

        if (Temperatura >= 25 && Temperatura < 31){

            placarTime2 = Placar.nextInt(4);

        } 

        else if (Temperatura >= 31 && Temperatura < 36){

            placarTime2 = Placar.nextInt(5);

        }

        else if (Temperatura >= 36){

            placarTime2 = Placar.nextInt(6);

        }
    }
    public void setTemperatura(){
        Temperatura = 1;
        if(Temperatura > 0){

            System.out.println("Digite a temperatura do jogo");
            Scanner teclado = new Scanner (System.in);
            Temperatura = teclado.nextInt();

            if(Temperatura < 0){

                System.out.println("Temperatura invalida, por favor insira uma temperatura maior que zero");
                Temperatura = teclado.nextInt();
                teclado.close();
            }
            
        }

        
    }
    public void setTime1(Equipe time1) {
        this.time1 = time1;
    }
    public void setTime2(Equipe time2) {
        this.time2 = time2;
    }

    public int getID() {
        return ID;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public Equipe getTime1() {
        return time1;
    }

    public Equipe getTime2() {
        return time2;
    }
    
    public void VerificarJogo (int placarTime1, int placarTime2, Equipe Equipe1, Equipe Equipe2){

        Equipe1.setGolsMarcados(Equipe1.getGolsMarcados() + placarTime1);
        Equipe1.setGolsSofridos(Equipe1.getGolsSofridos() + placarTime2);
        Equipe2.setGolsMarcados(Equipe2.getGolsMarcados() + placarTime2);
        Equipe2.setGolsSofridos(Equipe2.getGolsSofridos() + placarTime1);

        if (placarTime1 > placarTime2){

            Equipe1.setVit(Equipe1.getVit() + 1);
            Equipe2.setDerrotas(Equipe2.getDerrotas());

        }

        else if (placarTime2 > placarTime2){

            Equipe2.setVit(Equipe2.getVit() + 1);
            Equipe1.setDerrotas(Equipe1.getDerrotas() + 1);

        }

        else{

            Equipe1.setEmpates(Equipe1.getEmpates() + 1);
            Equipe2.setEmpates(Equipe2.getEmpates() + 1);

        }

    }

}