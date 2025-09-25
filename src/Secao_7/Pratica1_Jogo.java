package Secao_7;
import java.util.Random;
public class Pratica1_Jogo {
    private Random random = new Random();
    private String nome;
    private int saldoNecessario;

    public void setJogo(String nome, int  saldoNecessario){
        this.nome = nome;
        this.saldoNecessario = saldoNecessario;
    }

    public void getNome(){
        System.out.print(this.nome);
    }

    public void getSaldoNecessario(){
        System.out.print(this.saldoNecessario);
    }
}
