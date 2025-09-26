package Secao_7;
public class Pratica1_Terminal {
    private final Pratica1_Cartao cartao1 = new Pratica1_Cartao();
    private final Pratica1_Cartao cartao2 = new Pratica1_Cartao();
    private final Pratica1_Jogo jogo1 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo2 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo3 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo4 = new Pratica1_Jogo();
    private final Pratica1_Jogo jogo5 = new Pratica1_Jogo();
    private final Pratica1_Premio premio1 = new Pratica1_Premio();
    private final Pratica1_Premio premio2 = new Pratica1_Premio();
    private final Pratica1_Premio premio3 = new Pratica1_Premio();
    private final Pratica1_Premio premio4 = new Pratica1_Premio();
    private final Pratica1_Premio premio5 = new Pratica1_Premio();

    public void setPremios(){
        premio1.setPremio("Espada Pequena", 3, 1000, 68);
        premio2.setPremio("Casaco de Couro (colecionável)", 1, 500000, 10);
        premio3.setPremio("Espada Grande", 2, 55000, 34);
        premio4.setPremio("Cajado", 3, 2500, 106);
        premio5.setPremio("Capacete Espartano", 2, 36000, 52);
    }

    public void getCompraPremio(String nome, int premio){
        switch (premio){

            case 1:

                if(nome.equals(cartao1.verificaCartao())){
                    if(cartao1.verificaTickets() < premio1.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao1.setRemoverTickets(premio1.retornaPreco());
                        premio1.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio1.getNome();

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaTickets() < premio1.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao2.setRemoverTickets(premio1.retornaPreco());
                        premio1.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio1.getNome();

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
                    if(cartao1.verificaTickets() < premio2.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao1.setRemoverTickets(premio2.retornaPreco());
                        premio2.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio2.getNome();

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaTickets() < premio2.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao2.setRemoverTickets(premio2.retornaPreco());
                        premio2.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio2.getNome();

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
                    if(cartao1.verificaTickets() < premio3.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao1.setRemoverTickets(premio3.retornaPreco());
                        premio3.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio3.getNome();

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaTickets() < premio3.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao2.setRemoverTickets(premio3.retornaPreco());
                        premio3.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio3.getNome();

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
                    if(cartao1.verificaTickets() < premio4.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao1.setRemoverTickets(premio4.retornaPreco());
                        premio4.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio4.getNome();

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaTickets() < premio4.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao2.setRemoverTickets(premio4.retornaPreco());
                        premio4.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio4.getNome();

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
                    if(cartao1.verificaTickets() < premio5.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao1.setRemoverTickets(premio5.retornaPreco());
                        premio5.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio5.getNome();

                        //Imprime as informações atualizadas
                        System.out.print("\nInformações atualizadas:\nCréditos:");
                        cartao1.getSaldo();
                        System.out.print("\nTickets:");
                        cartao1.getTickets();

                    }
                }else{

                    if(cartao2.verificaTickets() < premio5.retornaPreco()){
                        System.out.println("Você não tem tickets o suficiente para retirar esse prêmio," +
                                " escolha outro ou adquira mais tickets");
                    }else{
                        cartao2.setRemoverTickets(premio5.retornaPreco());
                        premio5.setQuantidade();
                        System.out.println("Parabéns, você resgatou ");
                        premio5.getNome();

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

    public void getPremiosDisponiveis(){
        //Prêmio 1
        System.out.print("Prêmios disponíveis e valores:\n1. ");
        premio1.getNome();
        System.out.print("\n   Categoria: ");
        premio1.getCategoria();
        System.out.print("\n   Preço: ");
        premio1.getPreco();
        System.out.println(" tickets");
        System.out.print("   Quantidade:");
        premio1.getQuantidade();

        //Prêmio 2
        System.out.print("\n\n2. ");
        premio2.getNome();
        System.out.print("\n   Categoria: ");
        premio2.getCategoria();
        System.out.print("\n   Preço: ");
        premio2.getPreco();
        System.out.println(" tickets");
        System.out.print("   Quantidade:");
        premio2.getQuantidade();

        //Prêmio 3
        System.out.print("\n\n3. ");
        premio3.getNome();
        System.out.print("\n   Categoria: ");
        premio3.getCategoria();
        System.out.print("\n   Preço: ");
        premio3.getPreco();
        System.out.println(" tickets");
        System.out.print("   Quantidade:");
        premio3.getQuantidade();

        //Prêmio 4
        System.out.print("\n\n4. ");
        premio4.getNome();
        System.out.print("\n   Categoria: ");
        premio4.getCategoria();
        System.out.print("\n   Preço: ");
        premio4.getPreco();
        System.out.println(" tickets");
        System.out.print("   Quantidade:");
        premio4.getQuantidade();

        //Prêmio 5
        System.out.print("\n\n5. ");
        premio5.getNome();
        System.out.print("\n   Categoria: ");
        premio5.getCategoria();
        System.out.print("\n   Preço: ");
        premio5.getPreco();
        System.out.println(" tickets");
        System.out.print("   Quantidade:");
        premio5.getQuantidade();
        System.out.println();
    }

    //--------------------MÉTODOS JOGOS--------------------//

    //Imprime e calcula os resultados dos jogos
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