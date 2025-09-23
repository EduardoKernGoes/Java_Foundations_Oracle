package Secao_3;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Aula_005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*
        //Exercício 1
        String input = JOptionPane.showInputDialog("Digite seu nome: ");

        System.out.println(input);

        String input2 = JOptionPane.showInputDialog("Digite sua idade: ");

        System.out.println(input2);

        int num = Integer.parseInt(input2);

        System.out.println(num);

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade novamente"));

        System.out.println(num2);
        */

        /*
        //Exemplo 1 do slide
        String input3 = (String)JOptionPane.showInputDialog(null, "Pergunta da caixa",
                "Título da caixa", 2, null, null,
                "Digite algo aqui");

        //Exemplo 2 do slide
        String[] valoresAceitaveis = {"Escolha 1", "Escolha 2", "Escolha 3"};
        String input4 = (String)JOptionPane.showInputDialog(null, "Pergunta da caixa",
                "Título da caixa", 2, null, valoresAceitaveis, valoresAceitaveis[0]);

        //Exemplo 3 do slide
        JOptionPane.showMessageDialog(null, "Não há uma entrada aqui, apenas uma mensagem",
                "Título da caixa", 0);

        int num1, num2, num3;
        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = ler.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = ler.nextInt();

        System.out.println("A soma dos três números digitados é: " + (num1 + num2 + num3));
        ler.close();
        */
        /*
        //Exercício 4
        Scanner lerDocumento = new Scanner(aula_005.class.getResourceAsStream("input04text.txt"));

        lerDocumento.nextLine();
        lerDocumento.nextLine();
        lerDocumento.nextLine();
        lerDocumento.next();
        lerDocumento.next();
        lerDocumento.next();
        System.out.println(lerDocumento.nextInt());
        System.out.println(lerDocumento.nextInt());

        lerDocumento.close();
         */
    }
}