package Secao_5;
import java.util.Scanner;
public class Pratica_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor de 380-750 (nanômetros) para descobrir sua cor correspondente");
        int nanometros = ler.nextInt();

        if(nanometros >= 380 && nanometros < 450){
            System.out.println("Esse é um valor para a cor Violeta");
        } else if (nanometros >= 450 && nanometros < 495) {
            System.out.println("Esse é um valor para a cor Azul");
        } else if (nanometros >= 495 && nanometros < 570) {
            System.out.println("Esse é um valor para a cor Verde");
        } else if (nanometros >= 570 && nanometros < 590) {
            System.out.println("Esse é um valor para a cor Amarelo");
        } else if (nanometros >= 590 && nanometros < 620) {
            System.out.println("Esse é um valor para a cor Laranja");
        } else if (nanometros >= 620 && nanometros < 750) {
            System.out.println("Esse é um valor para a cor Vermelho");
        }else{
            System.out.println("A onda fornecida não está dentro do espectro visível");
        }

        ler.close();
    }
}
