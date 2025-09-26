package Sessao_8.Pratica;

public class Temperaturas {
    private int contTempMin = 0;
    private final int temperaturaMinima = 10;

    public int verificaTemperatura(int temp) {
        if (temp < temperaturaMinima) {

            this.contTempMin += 1;

            if (this.contTempMin !=  3){
                System.out.println("\nHoje está muito frio, não teremos nenhuma partida, até semana que vem.");
                return 0;
            }else{
                System.out.println("\nJá esta frio a 3 semanas seguidas, parece que o inverno chegou, até ano que vem.");
                return 0;
            }

        }else{
            this.contTempMin = 0;
            return 1;
        }
    }

    public int retornaContTempMin() {
        return this.contTempMin;
    }
}
