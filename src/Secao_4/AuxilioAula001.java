package Secao_4;

public class AuxilioAula001 {
    //Valor total de cada pessoa sem impostos/gorjeta
    static double valorPessoa1 = 10.00;
    static double valorPessoa2 = 12.00;
    static double valorPessoa3 = 9.00;
    static double valorPessoa4 = 8.00;
    static double valorPessoa5 = 7.00;
    static double valorPessoa6 = 15.00;
    static double valorPessoa7 = 11.00;
    static double valorPessoa8 = 30.00;

    //Método que imprime o valor total da mesa
    public void valorTotal(){
        System.out.println("Valor total da mesa: R$" + (calculaValorTotal(valorPessoa1) +
                calculaValorTotal(valorPessoa2) + calculaValorTotal(valorPessoa3) +
                calculaValorTotal(valorPessoa4) + calculaValorTotal(valorPessoa5) +
                calculaValorTotal(valorPessoa6) + calculaValorTotal(valorPessoa7) +
                calculaValorTotal(valorPessoa8)));
    }

    //Método que imprime o valor de cada pessoa, sem gorjeta/imposto
    public void valorPessoa(){
        System.out.println("Pessoa 1: " + calculaValorTotal(valorPessoa1));
        System.out.println("Pessoa 2: " + calculaValorTotal(valorPessoa2));
        System.out.println("Pessoa 3: " + calculaValorTotal(valorPessoa3));
        System.out.println("Pessoa 4: " + calculaValorTotal(valorPessoa4));
        System.out.println("Pessoa 5: " + calculaValorTotal(valorPessoa5));
        System.out.println("Pessoa 6: " + calculaValorTotal(valorPessoa6));
        System.out.println("Pessoa 7: " + calculaValorTotal(valorPessoa7));
        System.out.println("Pessoa 8: " + calculaValorTotal(valorPessoa8));
    }

    //Método que calcula o valor total de cada pessoa, com gorjeta/imposto
    static double calculaValorTotal(double valorPessoa){
        double imposto = 5;
        double gorjeta = 15;

        double valorTotalPessoa = valorPessoa + (((imposto * valorPessoa) / 100) + ((gorjeta * valorPessoa) / 100));

        return(valorTotalPessoa);
    }
}
