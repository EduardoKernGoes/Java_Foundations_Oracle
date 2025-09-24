package Secao_4;
public class Aula_001 {
    public static void main(String[] args) {
        double valorPessoa1 = 10.00;
        double valorPessoa2 = 12.00;
        double valorPessoa3 = 9.00;
        double valorPessoa4 = 8.00;
        double valorPessoa5 = 7.00;
        double valorPessoa6 = 15.00;
        double valorPessoa7 = 11.00;
        double valorPessoa8 = 30.00;


        System.out.println("Pessoa 1: " + calculaValorTotal(valorPessoa1));
        System.out.println("Pessoa 2: " + calculaValorTotal(valorPessoa2));
        System.out.println("Pessoa 3: " + calculaValorTotal(valorPessoa3));
        System.out.println("Pessoa 4: " + calculaValorTotal(valorPessoa4));
        System.out.println("Pessoa 5: " + calculaValorTotal(valorPessoa5));
        System.out.println("Pessoa 6: " + calculaValorTotal(valorPessoa6));
        System.out.println("Pessoa 7: " + calculaValorTotal(valorPessoa7));
        System.out.println("Pessoa 8: " + calculaValorTotal(valorPessoa8));

    }

    static double calculaValorTotal(double valorPessoa){
        double imposto = 5;
        double gorjeta = 15;

         double valorTotalPessoa = valorPessoa + (((imposto * valorPessoa) / 100) + ((gorjeta * valorPessoa) / 100));

         return(valorTotalPessoa);
    }
}
