package Sessao_6;
import java.util.Scanner;
public class Pratica_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número para saber a tábuada dele de 1 a 10:");
        int num = ler.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + " = " + (num * i));
        }
    }
}
