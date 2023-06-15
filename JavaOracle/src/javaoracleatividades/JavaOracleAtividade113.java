package javaoracleatividades;

public class JavaOracleAtividade113 {
    
    String CriaRetanguloAlt(int altura){

        int i = 0;
        String alturaprint = "#";

        while(i + 2 < altura){

            alturaprint = alturaprint + " ";
            i++;
        }

        alturaprint = alturaprint + "#";

        return alturaprint;

    }

}
