package Sessao_8.Pratica;
public class Jogos {
    private int id;
    private String equipeVisitante;
    private String equipeMandante;
    private int golsEV;
    private int golsEM;
    private int pontuacaoEV;
    private int pontuacaoEM;
    private int temperatura;

    public void setPartida(int id, String equipeVisitante, String equipeMandante, int golsEM, int golsEV,
                           int pontuacaoEV, int pontuacaoEM, int temperatura) {
        this.id = id;
        this.equipeVisitante = equipeVisitante;
        this.equipeMandante = equipeMandante;
        this.golsEM = golsEM;
        this.golsEV = golsEV;
        this.pontuacaoEV = pontuacaoEV;
        this.pontuacaoEM = pontuacaoEM;
        this.temperatura = temperatura;


    }

    public void getPartida(){
        System.out.println("Identificação da partida: " + this.id);
        System.out.println("Equipes da partida: " + this.equipeMandante + " " + golsEM +" x " + golsEV +" " +
                this.equipeVisitante);
        System.out.println("Pontuação ganhos: " + this.equipeMandante + " " + this.pontuacaoEM +
                "\n                  " + this.equipeVisitante + " " + this.pontuacaoEV);
        System.out.println("Temperatura: " + this.temperatura + "Cº");
    }
}
