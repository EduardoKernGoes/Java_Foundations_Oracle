package Sessao_8;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Aula_003 {
    public static void main(String[] args) {
        //Exemplo 1
        /*
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
         */

        //Exemplo 2
        /*
        try{
            int[] intArray = new int[5];
            intArray[5] = 27;
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
         */

        //Exemplo 3
        /*
        try{
            String nome = null;
            System.out.println(nome.length());
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
         */

        //Exemplo 4

        try{
            File testFile = new File("//testFile.txt");
            testFile.createNewFile();
            System.out.println("testFile exists:" + testFile.exists());
        }catch(IOException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
