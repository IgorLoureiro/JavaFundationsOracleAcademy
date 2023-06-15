package javaoracleatividades.javaoracleatividade8aula;
import java.util.*;

public class ProgramaLigaFutebol {
    public static void main(String[] args) {
        
        LaLiga liga = new LaLiga();
        Equipe barcelona = new Equipe();
        liga.equipeList.add(barcelona);
        Equipe realmadrid = new Equipe();
        liga.equipeList.add(realmadrid);
        int i3 = 0;
        Random RandomNumero = new Random();
        Equipe finalEquipe = new Equipe();
        int[] EquipeNum = new int[5];
        jogo JogoFinal = new jogo();
        

        barcelona.setNome("Barcelona");
        liga.EquipeNome.add(barcelona.getNome());
        realmadrid.setNome("Real Madrid");
        liga.EquipeNome.add(realmadrid.getNome());

        jogo jogoDeAbertura = new jogo();

        jogoDeAbertura.setTemperatura();

        while (jogoDeAbertura.getTemperatura() < 20){

            System.out.println("Devido a baixa temperatura o jogo foi adiado para a próxima semana");
            i3++;

            if (i3 == 3){

                System.out.println("Fim da temporada");
                VerificarEquipeFinal(liga, EquipeNum, finalEquipe);
                VerificarJogoFinal(liga, JogoFinal);

            }

            jogoDeAbertura.setTemperatura();

            if(jogoDeAbertura.getTemperatura() >= 20){

                break;

            }
        }

        jogoDeAbertura.setTime1(liga.equipeList.get(RandomNumero.nextInt(liga.equipeList.size())));
        jogoDeAbertura.setTime2(liga.equipeList.get(RandomNumero.nextInt(liga.equipeList.size())));

        while (jogoDeAbertura.getTime1() == jogoDeAbertura.getTime2()){

            jogoDeAbertura.setTime1(liga.equipeList.get(RandomNumero.nextInt(liga.equipeList.size())));
            jogoDeAbertura.setTime2(liga.equipeList.get(RandomNumero.nextInt(liga.equipeList.size())));

        }
        
        jogoDeAbertura.setPlacarTime1();
        jogoDeAbertura.setPlacarTime2();
        jogoDeAbertura.setID();

        liga.listajogo.add(jogoDeAbertura);
        jogoDeAbertura.VerificarJogo(jogoDeAbertura.getPlacarTime1(), jogoDeAbertura.getPlacarTime2(), jogoDeAbertura.getTime1(), jogoDeAbertura.getTime2());
        int[] barcelonaplacar = barcelona.VerificarEquipe(barcelona);
        System.out.println("Vitórias: " + barcelonaplacar[0] + "\nDerrotas: " + barcelonaplacar[1] + "\nEmpates: " + barcelonaplacar[2] 
        + "\nGols Marcados: " + barcelonaplacar[3] + "\nGols Sofridos: " + barcelonaplacar[4]);

        System.out.println(jogoDeAbertura.getTime1().getNome()
            +" "+          jogoDeAbertura.getPlacarTime1() +"x"+ jogoDeAbertura.getPlacarTime2()
            +" "+          jogoDeAbertura.getTime2().getNome());

        System.out.println(liga.equipeList.size());

        VerificarEquipeFinal(liga, EquipeNum, finalEquipe);
        VerificarJogoFinal(liga, JogoFinal);
    }

    public static void VerificarEquipeFinal (LaLiga x, int[] y, Equipe z){

        for(int i = 0; i < x.equipeList.size(); i++){

            y = z.VerificarEquipe(x.equipeList.get(i));
            System.out.println("Equipe: " + x.EquipeNome.get(i).toString() + "\n Vitórias: " + y[0] + "\n Derrotas: " + y[1] + "\n Empates: " + y[2] +
            "\n Gols marcados: " + y[3] + "\n Gols Sofridos: " + y[4]);
                  
        }
        
    }

    public static void VerificarJogoFinal (LaLiga x, jogo y){

        for(int i = 0; i < x.listajogo.size(); i++){

            y = x.listajogo.get(i);
            System.out.println("Jogo " + (i+1) + "\n Temperatura: " + x.listajogo.get(i).Temperatura + "\n Placar Time1: " + x.listajogo.get(i).placarTime1 + 
            "\n Placar Time2: " + x.listajogo.get(i).placarTime2);
        }

    }

}

