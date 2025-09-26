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

    public void setPartida(int id, String equipeMandante, String equipeVisitante, int golsEM, int golsEV,
                           int pontuacaoEM, int pontuacaoEV, int temperatura) {
        this.id = id;
        this.equipeMandante = equipeMandante;
        this.equipeVisitante = equipeVisitante;
        this.golsEM = golsEM;
        this.golsEV = golsEV;
        this.pontuacaoEM = pontuacaoEM;
        this.pontuacaoEV = pontuacaoEV;
        this.temperatura = temperatura;

    }

    public void getPartida(){
        System.out.println("\nIdentificação da partida: " + this.id);
        System.out.println("Placar: " + this.equipeMandante + " " + golsEM +" x " + golsEV +" " +
                this.equipeVisitante);
        System.out.println("Pontuação ganha: " + this.equipeMandante + " " + this.pontuacaoEM +
                "\n                 " + this.equipeVisitante + " " + this.pontuacaoEV);
        System.out.println("Temperatura: " + this.temperatura + "Cº");
        System.out.println("\n#########################################");
    }
}
