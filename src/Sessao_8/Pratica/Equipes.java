package Sessao_8.Pratica;

public class Equipes {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;
    private int pontos;

    public void setGols(int golsMarcados, int  golsSofridos) {
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void setVitorias() {
        this.vitorias += 1;
        this.pontos +=3;
    }

    public void setDerrotas() {
        this.derrotas += 1;
    }

    public void setEmpates() {
        this.empates += 1;
        this.pontos +=1;
    }

    public void setEquipes(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void getEstatisticas(){
        System.out.println(this.nome);
        System.out.println("    Vitórias: " + this.vitorias);
        System.out.println("    Derrotas: " + this.derrotas);
        System.out.println("    Empates: " + this.empates);
        System.out.println("    Gols marcados: " + this.golsMarcados);
        System.out.println("    Gols sofridos: " + this.golsSofridos);
        System.out.println("    Pontuação final: " + this.pontos);
    }
}
