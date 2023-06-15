package javaoracleatividades.javaoracleatividade8aula;

public class Equipe {
    
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;
    LaLiga LigaEquipe = new LaLiga();
    int [] EquipeNum;

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public int getVit(){

        return vitorias;

    }

    public void setVit(int v){

        vitorias = v;

    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int[] VerificarEquipe (Equipe x){

        int DadosEquipe[] = new int[5];

        DadosEquipe[0] = x.getVit();
        DadosEquipe[1] = x.getDerrotas();
        DadosEquipe[2] = x.getEmpates();
        DadosEquipe[3] = x.getGolsMarcados();
        DadosEquipe[4] = x.getGolsSofridos();

        return DadosEquipe;

    }
    
    public void VerificarEquipeFinal (){

        for(int i = 0; i < LigaEquipe.equipeList.size(); i++){

            EquipeNum = VerificarEquipe(LigaEquipe.equipeList.get(i));
            System.out.println("Equipe: " + LigaEquipe.equipeList.get(i) + "\n Vitórias: " + EquipeNum[0] + "\n Derrotas: " + EquipeNum[1] + "\n Empates: " + EquipeNum[2] +
            "\n Gols marcados: " + EquipeNum[3] + "\n Gols Sofridos: " + EquipeNum[4]);
            
                
        }
        
    }

}
