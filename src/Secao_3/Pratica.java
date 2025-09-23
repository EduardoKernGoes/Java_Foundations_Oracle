package Secao_3;
import javax.swing.JOptionPane;
public class Pratica {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao seu caixa," +
                        " adicione alguns itens e suas informações.",
                "Seu caixa", 1);

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
    }
}
