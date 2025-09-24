package Secao_4;
import java.util.Scanner;
public class Pratica_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Solicita ao usuário o nome completo
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = ler.nextLine();

        //Identifica o último espaço anterior ao último sobrenome
        int ultimoEspaco = nomeCompleto.lastIndexOf(" ");

        //Imprimi o último sobrenome seguido da inicial do seu primeiro nome
        System.out.println("Olá " + nomeCompleto + ", seu nome formatado ficou da seguinte forma: " +
                nomeCompleto.substring(ultimoEspaco + 1) + ", " + nomeCompleto.charAt(0));

        ler.close();
    }
}
