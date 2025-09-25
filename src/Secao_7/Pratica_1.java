package Secao_7;
import java.util.Scanner;
public class Pratica_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pratica1_Terminal terminal =  new Pratica1_Terminal();
        terminal.setJogos();
        int contCartao = 1;

        //Inicia o programa
        System.out.println("Olá bem vindo(a) a Star Games, o que você deseja fazer?\n1.Criar um cartão novo" +
                "\n2.Acessar um cartão existente\n3.Resgatar um prêmio\n4.Jogar algo\n5.Sair");
        int opcao = ler.nextInt();

        //Verifica o valor digitado
        while (opcao < 1 || opcao > 5) {
            System.out.println("!Opção inválida!\nO que você deseja fazer?\n1.Criar um cartão novo" +
                    "\n2.Acessar um cartão existente\n3.Resgatar um prêmio\n4.Jogar algo\n5.Sair");
            opcao = ler.nextInt();
        }

        //Ciclo para manter o programa rodando até o usuário digitar 5 (sair)
        while(opcao != 5) {

            //Switch para as decisões do usuário
            switch (opcao){

                //Cadastrar um cartão novo
                case 1:

                    //Pede nome de cadastro
                    System.out.println("\nNos informe seu nome completo:");
                    ler.nextLine();
                    String nome = ler.nextLine();

                    if(contCartao == 1){
                        //Cria um cartão no nome da pessoa
                        terminal.setCartao1(nome);
                        contCartao++;
                    }else if(contCartao == 2){
                        terminal.setCartao2(nome);
                    }

                    //Pergunta se o usuário quer fazer um depósito
                    System.out.println("\nA cada R$1 depositado você ganha 2 créditos para jogar, podendo ter no máximo 1000 créditos," +
                            " quando deseja depositar?");
                    int valor  = ler.nextInt();

                    //Garante que o depósito não ultrapasse o valor máximo de tickets no cartão
                    while (valor < 0 || valor > 500) {
                        System.out.println("\n!Valor inválido!\nDigite um valor entre 0 e 500");
                        valor = ler.nextInt();
                    }

                    //Insere o valor escolhido no cartão
                    terminal.setDinheiro(nome, valor);

                    //Retorna as informações da conta
                    terminal.getInformacoesConta(nome);

                    //Pergunta o que o usuário deseja fazer
                    System.out.println("\n\nO que deseja fazer agora?\n1.Criar um cartão novo\n2.Acessar um cartão existente" +
                            "\n3.Resgatar um prêmio\n4.Jogar algo\n5.Sair");
                    opcao = ler.nextInt();

                break; //-----FIM CASE 1 (SWITCH OPÇÃO)

                //Acessar um cartão existente
                case 2:

                    //Solicita o nome do usuário para acessar o cartão
                    System.out.println("\nDigite seu nome completo:");
                    ler.nextLine();
                    nome = ler.nextLine();

                    //Busca as informações do usuário
                    terminal.getInformacoesConta(nome);

                    //Verifica o que o usuário quer
                    System.out.println("\n\nO que deseja fazer?\n1.Comprar mais créditos\n2.Transferir créditos para outro cartão" +
                            "\n3.Transferir tickets para outro cartão\n4.Sair");
                    int opcao2 = ler.nextInt();

                    //Verifica o valor digitado
                    while (opcao2 < 1 || opcao2 > 4) {
                        System.out.println("!Opção inválida!\nO que você deseja fazer?\n1.Comprar mais créditos" +
                                "\n2.Transferir créditos para outro cartão\n3.Transferir tickets para outro cartão\n4.Sair");
                        opcao2 = ler.nextInt();
                    }

                    //Ciclo para manter o usuário dentro do cartão
                    while(opcao2 != 4) {

                        //Switch para escolha do usuário
                        switch (opcao2){

                            //Comprar mais crédito para o cartão
                            case 1:

                                //Solicita o valor desejado
                                System.out.println("\nInsira o valor que deseja comprar:");
                                valor = ler.nextInt();
                                terminal.setDinheiro(nome, valor);

                                //Imprime as informações atualizadas
                                System.out.print("\nInformações atualizadas:\nCréditos:");
                                terminal.getSaldoCartao(nome);
                                System.out.print("\nTickets:");
                                terminal.getTicketsCartao(nome);

                                //Pergunta o que o usuário quer
                                System.out.println("\n\nO que deseja fazer?\n1.Comprar mais créditos\n2.Transferir créditos para outro cartão" +
                                        "\n3.Transferir tickets para outro cartão\n4.Sair");
                                opcao2 = ler.nextInt();

                            break;

                            //Transferir crédito para outro cartão
                            case 2:

                                //Solicita o nome do dono do outro cartão
                                System.out.println("\nInsira o nome do dono do cartão que deseja transferir:");
                                ler.nextLine();
                                String nome2 = ler.nextLine();

                                //Solicita o valor a ser transferido
                                System.out.println("\nInsira o valor que deseja transferir:");
                                valor = ler.nextInt();

                                //Solicita o acréscimo ao cartão
                                terminal.setTransferencia(nome2, nome, valor);

                                //Imprime as informações atualizadas
                                System.out.print("\nInformações atualizadas:\nCréditos:");
                                terminal.getSaldoCartao(nome);
                                System.out.print("\nTickets:");
                                terminal.getTicketsCartao(nome);

                                //Pergunta o que o usuário quer
                                System.out.println("\n\nO que deseja fazer?\n1.Comprar mais créditos\n2.Transferir créditos para outro cartão" +
                                        "\n3.Transferir tickets para outro cartão\n4.Sair");
                                opcao2 = ler.nextInt();

                            break;

                            //Transferir tickets para outro cartão
                            case 3:


                            break;
                        }

                    }//-----FIM WHILE OPÇÃO2

                    System.out.println("\n\nO que deseja fazer agora?\n1.Criar um cartão novo\n2.Acessar um cartão existente" +
                            "\n3.Resgatar um prêmio\n4.Jogar algo\n5.Sair");
                    opcao = ler.nextInt();

                break;//-----FIM CASE 2 (SWITCH OPÇÃO)

                //Resgatar um Prêmio
                case 3:


                    System.out.println("\n\nO que deseja fazer agora?\n1.Criar um cartão novo\n2.Acessar um cartão existente" +
                            "\n3.Resgatar um prêmio\n4.Jogar algo\n5.Sair");
                    opcao = ler.nextInt();

                break;//-----FIM CASE 3 (SWITCH OPÇÃO)

                //Jogar algo
                case 4:

                    //Pergunta ao usuário qual jogo ele deseja jogar
                    System.out.println("\nSelecione o jogo que deseja jogar.");

                    //Mostra os jogos disponíveis
                    terminal.getJogosDisponiveis();


                    System.out.println("\n\nO que deseja fazer agora?\n1.Criar um cartão novo\n2.Acessar um cartão existente" +
                            "\n3.Resgatar um prêmio\n4.Jogar algo\n5.Sair");
                    opcao = ler.nextInt();

                break;//-----FIM CASE 4 (SWITCH OPÇÃO)

            } //-----FIM SWITCH OPÇÃO

        } //-----FIM WHILE OPÇÃO

    }

}
