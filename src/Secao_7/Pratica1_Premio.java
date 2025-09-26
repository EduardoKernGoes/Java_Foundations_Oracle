package Secao_7;

public class Pratica1_Premio {
    private String nome;
    private int categoria;
    private int preco;
    private int quantidade;

    public void setPremio(String nome, int categoria, int  preco, int quantidade){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setQuantidade(){
        this.quantidade -= 1;
    }

    public void getNome(){
        System.out.print(this.nome);
    }

    public void getCategoria(){
        System.out.print(this.categoria);
    }

    public void getPreco(){
        System.out.print(this.preco);
    }

    public void getQuantidade(){
        System.out.print(this.quantidade);
    }

    public int retornaPreco(){
        return this.preco;
    }

}
