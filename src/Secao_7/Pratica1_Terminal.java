package Secao_7;
public class Pratica1_Terminal {
    private final Pratica1_Cartao cartao1 = new Pratica1_Cartao();
    private final Pratica1_Cartao cartao2 = new Pratica1_Cartao();
    private final Pratica1_Jogo jogo1 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo2 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo3 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo4 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo5 = new Pratica1_Jogo();

    public void getResultadoJogo(String nome, int jogo){
        switch (jogo){

            case 1:

                if(nome.equals(cartao1.verificaCartao())){
                    if(cartao1.verificaSaldo() < jogo1.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo1.resultadoJogo(400, 500);
                        cartao1.setRemoverSaldo(jogo1.getCusto());
                        cartao1.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaSaldo() < jogo1.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo1.resultadoJogo(400, 500);
                        cartao2.setRemoverSaldo(jogo1.getCusto());
                        cartao2.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao2.getSaldo();
                        System.out.print("\nTickets:");
                        cartao2.getTickets();

                    }

                }

                break;

            case 2:

                if(nome.equals(cartao1.verificaCartao())){
                    if(cartao1.verificaSaldo() < jogo2.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo2.resultadoJogo(100, 200);
                        cartao1.setRemoverSaldo(jogo2.getCusto());
                        cartao1.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaSaldo() < jogo2.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo2.resultadoJogo(100, 200);
                        cartao2.setRemoverSaldo(jogo2.getCusto());
                        cartao2.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao2.getSaldo();
                        System.out.print("\nTickets:");
                        cartao2.getTickets();

                    }

                }

                break;

            case 3:

                if(nome.equals(cartao1.verificaCartao())){
                    if(cartao1.verificaSaldo() < jogo3.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo3.resultadoJogo(200, 300);
                        cartao1.setRemoverSaldo(jogo3.getCusto());
                        cartao1.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaSaldo() < jogo3.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo3.resultadoJogo(200, 300);
                        cartao2.setRemoverSaldo(jogo3.getCusto());
                        cartao2.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao2.getSaldo();
                        System.out.print("\nTickets:");
                        cartao2.getTickets();

                    }

                }

                break;

            case 4:

                if(nome.equals(cartao1.verificaCartao())){
                    if(cartao1.verificaSaldo() < jogo4.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo4.resultadoJogo(300, 400);
                        cartao1.setRemoverSaldo(jogo4.getCusto());
                        cartao1.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaSaldo() < jogo4.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo4.resultadoJogo(300, 400);
                        cartao2.setRemoverSaldo(jogo4.getCusto());
                        cartao2.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao2.getSaldo();
                        System.out.print("\nTickets:");
                        cartao2.getTickets();

                    }

                }

                break;

            case 5:

                if(nome.equals(cartao1.verificaCartao())){
                    if(cartao1.verificaSaldo() < jogo5.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo5.resultadoJogo(200, 300);
                        cartao1.setRemoverSaldo(jogo5.getCusto());
                        cartao1.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaSaldo() < jogo5.getCusto()){
                        System.out.println("Você não tem saldo o suficiente para jogar este jogo," +
                                " escolha outro ou compre mais créditos");
                    }else{
                        int resultado = jogo5.resultadoJogo(200, 300);
                        cartao2.setRemoverSaldo(jogo5.getCusto());
                        cartao2.setAdicionaTickets(resultado);
                        System.out.println("Parabéns, você ganhou " + resultado + " tickets.");

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao2.getSaldo();
                        System.out.print("\nTickets:");
                        cartao2.getTickets();

                    }

                }

                break;

        }
    }

    //Instância os jogos
    public void setJogos(){
        jogo1.setJogo("Boliche", 30);
        jogo2.setJogo("Basquete Pequeno", 5);
        jogo3.setJogo("Basquete Médio", 10);
        jogo4.setJogo("Bate-Bate", 20);
        jogo5.setJogo("Fliperama", 10);
    }

    //Mostra os jogos disponíveis para o usuário
    public void getJogosDisponiveis(){
        //Jogo 1
        System.out.print("Jogos disponíveis, valores e possíveis ganhos:\n1.");
        jogo1.getNome();
        System.out.print(" (");
        jogo1.getSaldoNecessario();
        System.out.println(" créditos) (400-500 tickets)");

        //Jogo 2
        System.out.print("2.");
        jogo2.getNome();
        System.out.print(" (");
        jogo2.getSaldoNecessario();
        System.out.println(" créditos) (100-200 tickets)");

        //Jogo 3
        System.out.print("3.");
        jogo3.getNome();
        System.out.print(" (");
        jogo3.getSaldoNecessario();
        System.out.println(" créditos) (200-300 tickets)");

        //Jogo 4
        System.out.print("4.");
        jogo4.getNome();
        System.out.print(" (");
        jogo4.getSaldoNecessario();
        System.out.println(" créditos) (300-400 tickets)");

        //Jogo 5
        System.out.print("5.");
        jogo5.getNome();
        System.out.print(" (");
        jogo5.getSaldoNecessario();
        System.out.println(" créditos) (200-300 tickets)");
    }

    //--------------------MÉTODOS CARTÕES--------------------//
    //Cria o cartão 1
    public void setCartao1(String nome){
        cartao1.setCartao(nome);
    }

    //Cria o cartão 2
    public void setCartao2(String nome){
        cartao2.setCartao(nome);
    }

    //Adiciona saldo ao cartão (valor que entra em dinheiro)
    public void setDinheiro(String nome, int valor){
        if(nome.equals(cartao1.verificaCartao())){
            cartao1.setAdicionarSaldo((valor * 2));
        }else{
            cartao2.setAdicionarSaldo((valor * 2));
        }
    }

    public void setTransferencia(String nomeReceptor, String nomePagador, int valor){
        if(nomeReceptor.equals(cartao1.verificaCartao())){
            if((cartao1.verificaSaldo() + valor) > 1000 || (cartao2.verificaSaldo() - valor) < 0){
                System.out.println("Impossível realizar esta transferência");
            }else{
                cartao1.setAdicionarSaldo(valor);
                cartao2.setRemoverSaldo(valor);
            }
        }else{
            if((cartao2.verificaSaldo() + valor) > 1000 || (cartao1.verificaSaldo() - valor) < 0){
                System.out.println("Impossível realizar esta transferência");
            }else{
                cartao2.setAdicionarSaldo(valor);
                cartao1.setRemoverSaldo(valor);
            }
        }
    }

    //Adiciona saldo ao cartão (valor que entra em créditos)
    public void adicionaCredito(String nome, int valor){
        if(nome.equals(cartao1.verificaCartao())){
            cartao1.setAdicionarSaldo(valor);
        }else{
            cartao2.setAdicionarSaldo(valor);
        }
    }

    public void removeCredito(String nome, int valor){
        if(nome.equals(cartao1.verificaCartao())){
            cartao1.setRemoverSaldo(valor);
        }else{
            cartao2.setRemoverSaldo(valor);
        }
    }

    //Exibi o saldo do cartão
    public void getSaldoCartao(String nomeDonoCartao){
        if(nomeDonoCartao.equals(cartao1.verificaCartao())){
            cartao1.getSaldo();
        }else{
            cartao2.getSaldo();
        }
    }

    //Exibi os tickets do cartão
    public void getTicketsCartao(String nomeDonoCartao){
        cartao1.getTickets();
    }

    //Exibi as informações do cartão
    public void getInformacoesConta(String nomeDonoCartao){

        if(nomeDonoCartao.equals(cartao1.verificaCartao())){
            System.out.print("\nBem vindo(a) ");
            cartao1.getNomeDono();
            System.out.print(", aqui estão as informações atualizadas sobre sua conta:");
            System.out.print("\nCréditos:");
            cartao1.getSaldo();
            System.out.print("\nTickets: ");
            cartao1.getTickets();
        }else{
            System.out.print("\nBem vindo(a) ");
            cartao2.getNomeDono();
            System.out.print(", aqui estão as informações atualizadas sobre sua conta:");
            System.out.print("\nCréditos:");
            cartao2.getSaldo();
            System.out.print("\nTickets: ");
            cartao2.getTickets();
        }
    }
}
