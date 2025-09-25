package Secao_7;
public class Pratica1_Cartao {
    private int id;
    private String nomeDono;
    private int saldo;
    private int tickets;

    public void setCartao(String nomeDono) {
        int cont = 1;
        this.id = cont;
        this.nomeDono = nomeDono;
        cont++;
    }

    public void setAdicionarSaldo(int valor) {
        if (this.saldo == 1000 || (this.saldo + valor ) > 1000) {
            System.out.println("\n!Valor inválido!\nValor máximo de créditos do cartão: " + 1000 +
                    "\nValor de créditos atual do cartão: " + this.saldo);
        }else{
            this.saldo += valor;
        }
    }

    public void setRemoverSaldo(int valor) {
        if (this.saldo == 0 || (this.saldo - valor ) < 0) {
            System.out.println("\n!Valor inválido!\nValor mínimo de créditos do cartão: " + 0 +
                    "\nValor de créditos atual do cartão: " + this.saldo);
        }else{
            this.saldo -= valor;
        }
    }

    public void getNomeDono () {
        System.out.print(nomeDono);
    }

    public void getSaldo (){
        System.out.print(saldo);
    }

    public void getTickets(){
        System.out.print(tickets);
    }

    public String verificaCartao(){
        return this.nomeDono;
    }

    public int verificaSaldo(){
        return this.saldo;
    }
}
