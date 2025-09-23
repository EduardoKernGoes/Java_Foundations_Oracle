package Secao_3;
import javax.swing.JOptionPane;

public class Pratica {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao seu caixa," +
                        " adicione alguns itens e suas informações.",
                "Seu caixa", 1);

        String nomeDono = JOptionPane.showInputDialog("Digite seu nome:");

        String nomeLoja = JOptionPane.showInputDialog("Digite o nome da sua loja:");

        String nomeItem1 = JOptionPane.showInputDialog("Digite o nome do item 1:");
        double precoItem1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item:"));
        int quantidadeItem1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item:"));

        String nomeItem2 = JOptionPane.showInputDialog("Digite o nome do item 2:");
        double precoItem2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item:"));
        int quantidadeItem2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item:"));

        String nomeItem3 = JOptionPane.showInputDialog("Digite o nome do item 3:");
        double precoItem3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item:"));
        int quantidadeItem3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do item:"));

        JOptionPane.showMessageDialog(null, "Olá " + nomeDono + ", bem-vindo a " + nomeLoja +
                ".\nEste é o inventário atual:\nItem 1:\n   Nome: " + nomeItem1 + "\n   Preço: R$" + precoItem1 +
                        "\n   Quantidade: " + quantidadeItem1 + " unidades\nItem 2:\n   Nome: " + nomeItem2 +
                        "\n   Preço: R$" + precoItem2 + "\n   Quantidade: " + quantidadeItem2 + " unidades\nItem 3:\n   Nome:"
                        + nomeItem3 + "\n   Preço: R$" + precoItem3 + "\n   Quantidade: " + quantidadeItem3 + " unidades",
                "Seu caixa", 1);

        JOptionPane.showMessageDialog(null, "Essas são as informações gerais sobre a " + nomeLoja + ":" +
                "\nQuantidade de Itens: " + 3 + "\nQuantidade de unidades: " + (quantidadeItem1 + quantidadeItem2 + quantidadeItem3) +
                " unidades\nValor total da loja (em itens): R$" + (precoItem1 + precoItem2 + precoItem3), "Informações " + nomeLoja, 1);
    }
}
