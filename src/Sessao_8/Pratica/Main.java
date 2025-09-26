package Sessao_8.Pratica;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Temperaturas temperaturas = new Temperaturas();
        Scanner ler = new Scanner(System.in);

        //Cria um Array para armazenar as equipes
        Equipes[] times =  new Equipes[4];

        //Inicializa as equipes
        for(int i = 0; i < times.length; i++){
            times[i] = new Equipes();
        }

        //Define o nome de cada equipe
        times[0].setEquipes("Grêmio");
        times[1].setEquipes("Internacional");
        times[2].setEquipes("Palmeiras");
        times[3].setEquipes("Barcelona");

        //Apresenta as equipes para o usuário
        System.out.println("Olá, bem-vindo(a) a TheNewsLeague, a liga de futebol que acontece toda primavera" +
                "\nAqui temos os times desta temporada:");
        System.out.print("- ");times[0].getEquipes();
        System.out.print("- ");times[1].getEquipes();
        System.out.print("- ");times[2].getEquipes();
        System.out.print("- ");times[3].getEquipes();

        //Roda o programa enquanto não tiver 3 semanas seguidas de frio
        while (temperaturas.retornaContTempMin() < 3){

            //Garante que o usuário irá digitar um valor válido
            try{
                System.out.println("\nDigite a temperatura de hoje:");
                if (temperaturas.verificaTemperatura(ler.nextInt()) == 1){
                    System.out.println("Hoje teremos partida");
                }
            }catch(Exception e){
                System.out.println("!OPÇÃO INVÁLIDA!");
                ler.next();
            }
        }
    }
}
