package Sessao_8.Pratica;

public class Equipes {
    private String nome;
    private int vitorias;
    private int derrotas;
    private  int empates;
    private int golsMarcados;
    private int golsSofridos;

    public void setEquipes(String nome){
        this.nome = nome;
    }

    public void getEquipes(){
        System.out.println(this.nome);
    }
}
