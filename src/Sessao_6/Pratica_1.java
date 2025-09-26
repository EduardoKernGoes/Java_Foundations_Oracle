package Sessao_6;
import java.util.Scanner;
public class Pratica_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int senhaBanco = 7682;

        System.out.println("Digite a senha para acessar o banco:");
        int senhaUsuario = ler.nextInt();

        while(senhaUsuario != senhaBanco){
            System.out.println("Senha incorreta, tente novamente:");
            senhaUsuario = ler.nextInt();
        }

        System.out.println("Você acessou o banco com sucesso!!!");

        ler.close();
    }
}
