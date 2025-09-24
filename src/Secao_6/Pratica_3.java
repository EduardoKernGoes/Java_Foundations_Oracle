package Secao_6;
import java.util.Scanner;
public class Pratica_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        AuxilioPratica3 ap3 = new AuxilioPratica3();

        //Solicita a altura do retângulo
        System.out.println("Digite o tamanho do retângulo (2-10):");
        int alturaRetangulo = ler.nextInt();

        //Garante que a altura estará no range
        while (alturaRetangulo < 2 || alturaRetangulo > 10){
            System.out.println("Valor inválido, digite novamente (2-10):");
            alturaRetangulo = ler.nextInt();
        }

        //Solicita a largura do retângulo
        System.out.println("Digite a largura do retângulo (2-10):");
        int larguraRetangulo = ler.nextInt();

        //Garante que a largura estará no range
        while (larguraRetangulo < 2 || larguraRetangulo > 10){
            System.out.println("Valor inválido, digite novamente (2-10):");
            larguraRetangulo = ler.nextInt();
        }

        //Chama o método para imprimir o retângulo
        System.out.println("Aqui esta seu retângulo:");
        ap3.retangulo(alturaRetangulo, larguraRetangulo);



        //Solicita a altura do triângulo
        System.out.println("Digite a altura do triângulo (2-10):");
        int alturaTriangulo = ler.nextInt();

        //Garante que a altura estará no range
        while (alturaTriangulo < 2 || alturaTriangulo > 10){
            System.out.println("Valor inválido, digite novamente (2-10):");
            alturaTriangulo = ler.nextInt();
        }

        //Solicita a largura do triângulo
        System.out.println("Digite a largura do triângulo (2-10):");
        int larguraTriangulo = ler.nextInt();

        //Garante que a largura estará no range
        while (larguraTriangulo < 2 || larguraTriangulo > 10){
            System.out.println("Valor inválido, digite novamente (2-10):");
            larguraTriangulo = ler.nextInt();
        }

        //Chama o método para imprimir o triângulo
        System.out.println("Aqui esta seu triângulo:");
        ap3.triangulo(alturaTriangulo, alturaTriangulo);
    }
}
