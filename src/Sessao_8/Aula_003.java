package Sessao_8;
import java.util.Scanner;
public class Aula_003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 100, res;
        try{

            System.out.println("Informe o valor de b");
            int b = ler.nextInt();

            System.out.println("Informe o valor de c");
            int c = ler.nextInt();

            res = 10 / (b - c);

            System.out.println("O resultado é: " + res);

        }catch(Exception e){
            String errMSG = e.getMessage();
            System.out.println(errMSG);
        }

        System.out.println("Depois do bloco catch");
    }
}
