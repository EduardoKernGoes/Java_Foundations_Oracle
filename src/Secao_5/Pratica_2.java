package Secao_5;
import java.util.Scanner;
public class Pratica_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite qual a cor do sinal de transito atual:");
        String cor = ler.next();



        switch(cor.toUpperCase()){
            case "VERDE":
                System.out.println("O sinal esta verde");
                System.out.println("O próximo sinal é o amarelo");
                break;

            case "AMARELO":
                System.out.println("O sinal esta amarelo");
                System.out.println("O próximo sinal é o vermelho");
                break;

            case "VERMELHO":
                System.out.println("O sinal esta vermelho");
                System.out.println("O próximo sinal é o verde");
                break;

            default:
                System.out.println("Valor digitado é incompatível");
        }

        ler.close();
    }
}
