package Sessao_8.Pratica;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Scanner ler = new Scanner(System.in);

        //Cria um Array para armazenar as equipes
        terminal.iniciaTimes();

        //Apresenta as equipes para o usuário
        System.out.println("Olá, bem-vindo(a) a TheNewsLeague, a liga de futebol que acontece toda primavera" +
                "\nAqui temos os times desta temporada:");
        terminal.mostraTimes();

        //Roda o programa enquanto não tiver 3 semanas seguidas de frio
        while (terminal.retornaContTempMin() < 3){

            //Garante que o usuário irá digitar um valor válido
            try{
                System.out.println("\nDigite a temperatura de hoje:");
                int temp = ler.nextInt();
                if (terminal.verificaTemperatura(temp) == 1){
                    System.out.println("\nHoje tivemos as seguintes partidas:");

                    terminal.novaRodada(temp);

                }
            }catch(Exception e){
                System.out.println("!OPÇÃO INVÁLIDA!");
                ler.next();
            }
        }

        terminal.getTemporada();
    }
}