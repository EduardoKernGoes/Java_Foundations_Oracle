package Sessao_8.Pratica;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Terminal {
    private List<Jogos> jogos = new ArrayList<>();
    private Equipes[] times =  new Equipes[4];
    private Random random = new Random();
    private Temperaturas temperaturas = new Temperaturas();
    private static int proximoID;
    private int maiorTemperatura = 0;
    private int totalTemperatura;
    private int contTemperatura = 0;

    public void getTemporada(){
        System.out.println("\nEsses foram os jogos desta temporada:");
        for(int i = 0; i < jogos.toArray().length; i++){
            jogos.get(i).getPartida();
        }
        System.out.println("\nMaior temperatura da temporada: " + this.retornaMaiorTemperatura() + "Cº");
        System.out.println("\nTemperatura média da temporada: " + (this.totalTemperatura / this.contTemperatura)
                + "Cº");
    }

    public int retornaContTempMin(){
        return this.temperaturas.retornaContTempMin();
    }

    public int verificaTemperatura(int temp){

        if (temp > this.maiorTemperatura) {
            this.maiorTemperatura = temp;
            this.contTemperatura += 1;
            this.totalTemperatura += temp;
        }

        return this.temperaturas.verificaTemperatura(temp);
    }

    private int retornaMaiorTemperatura() {
        return this.maiorTemperatura;
    }

    public void mostraTimes(){
        System.out.println("- " + times[0].getNome());
        System.out.println("- " + times[1].getNome());
        System.out.println("- " + times[2].getNome());
        System.out.println("- " + times[3].getNome());
    }

    public void iniciaTimes(){
        for(int i = 0; i < this.times.length; i++){
            this.times[i] = new Equipes();
        }

        this.times[0].setEquipes("Grêmio");
        this.times[1].setEquipes("Internacional");
        this.times[2].setEquipes("Palmeiras");
        this.times[3].setEquipes("Barcelona");
    }

    public void novaRodada(int temp){
        int num1 = this.random.nextInt(4);
        int num2 = this.random.nextInt(4);
        int num3 = this.random.nextInt(4);
        int num4 = this.random.nextInt(4);

        while (!this.verificaTime(num1, num2, num3, num4)){
            num1 = this.random.nextInt(4);
            num2 = this.random.nextInt(4);
            num3 = this.random.nextInt(4);
            num4 = this.random.nextInt(4);
        }

        int golsNum1 = this.random.nextInt(this.verificaMaxGols(temp) + 1);
        int golsNum2 = this.random.nextInt(this.verificaMaxGols(temp) + 1);
        int golsNum3 = this.random.nextInt(this.verificaMaxGols(temp) + 1);
        int golsNum4 = this.random.nextInt(this.verificaMaxGols(temp) + 1);


        times[num1].setGols(golsNum1, golsNum2);
        times[num2].setGols(golsNum2, golsNum1);
        times[num3].setGols(golsNum3, golsNum4);
        times[num4].setGols(golsNum4, golsNum3);

        int pontosNum1, pontosNum2, pontosNum3,  pontosNum4;
        if (this.verificaPontuacao(golsNum1, golsNum2) == 0){
            pontosNum1 = 1;
            pontosNum2 = 1;
            times[num1].setEmpates();
            times[num2].setEmpates();
        } else if (this.verificaPontuacao(golsNum1, golsNum2) == 1) {
            pontosNum1 = 3;
            pontosNum2 = 0;
            times[num1].setVitorias();
            times[num2].setDerrotas();
        }else {
            pontosNum1 = 0;
            pontosNum2 = 3;
            times[num1].setDerrotas();
            times[num2].setVitorias();
        }

        if (this.verificaPontuacao(golsNum3, golsNum4) == 0){
            pontosNum3 = 1;
            pontosNum4 = 1;
            times[num3].setEmpates();
            times[num4].setEmpates();
        } else if (this.verificaPontuacao(golsNum3, golsNum4) == 1) {
            pontosNum3 = 3;
            pontosNum4 = 0;
            times[num3].setVitorias();
            times[num4].setDerrotas();
        }else {
            pontosNum3 = 0;
            pontosNum4 = 3;
            times[num3].setDerrotas();
            times[num4].setVitorias();
        }


        Jogos partida1 = new Jogos();
        partida1.setPartida(proximoID++, times[num1].getNome(), times[num2].getNome(), golsNum1, golsNum2, pontosNum1, pontosNum2, temp);
        this.jogos.add(partida1);

        Jogos partida2 = new Jogos();
        partida2.setPartida(proximoID++, times[num3].getNome(), times[num4].getNome(), golsNum3, golsNum4, pontosNum3, pontosNum4, temp);
        this.jogos.add(partida2);

        partida1.getPartida();
        partida2.getPartida();
    }

    private int verificaPontuacao(int golsTime1, int golsTime2){
        if (golsTime1 == golsTime2){
            return 0;
        } else if (golsTime1 > golsTime2) {
            return 1;
        }else{
            return 2;
        }
    }

    private int verificaMaxGols(int temp){
        if (temp <= 20){
            return 3;
        }else if (temp <= 30){
            return 4;
        }else {
            return 5;
        }
    }

    private boolean verificaTime(int num1, int num2, int num3,  int num4){
        if (num1 == num2 || num1 == num3 || num1 == num4){
            return false;
        }else if (num2 == num3 || num2 == num4){
            return false;
        }else if (num3 == num4){
            return false;
        }else {
            return true;
        }
    }
}
