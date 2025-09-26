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
        System.out.println("\nIdentificação da partida: " + this.id);
        System.out.println("Placar: " + this.equipeMandante + " " + golsEM +" x " + golsEV +" " +
                this.equipeVisitante);
        System.out.println("Pontuação ganha: " + this.equipeMandante + " " + this.pontuacaoEV +
                "\n                 " + this.equipeVisitante + " " + this.pontuacaoEM);
        System.out.println("Temperatura: " + this.temperatura + "Cº");
        System.out.println("\n#########################################");
    }
}
