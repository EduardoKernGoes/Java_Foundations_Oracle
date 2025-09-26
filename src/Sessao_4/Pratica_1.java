package Sessao_4;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Pratica_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Solicita a temperatura em Fahrenheit
        System.out.println("Digite a temperatura em Fahrenheit que deseja converter:");
        int tempF = ler.nextInt();

        //Imprime a temperatura em Celsius
        System.out.println("\nA temperatura que você digitou em Celsius é:" + converterTemp(tempF));

        //Solicita o primeiro lado do triângulo
        System.out.println("\nDigite o lado 1 do triângulo");
        double lado1 = ler.nextInt();

        //Solicita o segundo lado do triângulo
        System.out.println("Digite o lado 2 do triângulo");
        double lado2 = ler.nextInt();

        //Imprime a hipotenusa conforme com os valores passados dos lados do triângulo
        System.out.printf("\nA hipotenusa do seu triângulo é: %.2f", calcularHipotenusa(lado1, lado2));

        //Solicita os valores dos dados
        int dado1 = randomDado();
        int dado2 = randomDado();

        //Imprime os valores dos dados separadamente
        System.out.println("\n\nVocê jogou um dado D6, seu resultado foi: " + dado1);
        System.out.println("Você jogou outro dado D6, seu resultado foi: " + dado2);

        //Imprime o valor total dos dados somados
        System.out.println("\nSeu resultado total (soma dos dois dados) foi: " + (dado1 + dado2));

        ler.close();
    }
    //Método que gera um número aleatório de 1 a 6 para os dados
    static int randomDado(){
        Random random = new Random();
        return (random.nextInt(6) + 1);
    }

    //Método que calcula a hipotenusa do triângulo
    static double calcularHipotenusa(double lado1, double lado2){
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }

    //Método que converte Fahrenheit em Celsius
    static int converterTemp(int tempF){
        return (tempF - 32) * 5 / 9;
    }
}
