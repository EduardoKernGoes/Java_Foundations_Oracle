package Secao_6;

public class AuxilioPratica3 {

    public void retangulo(int altura, int largura){

        //Imprimi enquanto não percorrer toda altura
        for (int i = 1; i <= altura; i++){

            //Enche a primeira e última linha com "#"
            if(i == 1 || i == altura){

                //Percorrer toda a largura
                for (int j = 1; j <= largura; j++){
                    System.out.print("#");
                }

            }else{

                //Coloca "#" no início da linha do meio do triângulo
                System.out.print("#");

                //Garante que não terá "#" no meio do retângulo
                for (int j = 1; j <= (largura - 2); j++){
                    System.out.print(" ");
                }

                //Coloca "#" no final da linha do meio do triângulo
                System.out.print("#");
            }

            //Quebra de linha
            System.out.println();

        }

    }


    public void triangulo(int altura, int largura){
        //Imprimi enquanto não percorrer toda altura
        for (int i = 1; i <= altura; i++){

            //Enche a última linha com "#"
            if(i == altura){

                //Percorrer toda a largura
                for (int j = 1; j <= largura; j++){
                    System.out.print("#");
                }

            }else{

                //Garante que tenha espaços em branco no meio do triângulo
                if(i != 1 || i != 2){

                    for (int j = 1; j <= i; j++){

                        //Coloca "#" nas "pontas" do meio do triângulo
                        if (j == 1 || j == i){

                            System.out.print("#");

                        //Faz o espaço em branco no meio do triângulo
                        }else{
                            System.out.print(" ");
                        }

                    }

                //Garante que as duas primeiras linhas sejam completas
                }else{

                    for (int j = 1; j <= i; j++){
                        System.out.print("#");
                    }

                }

            }

            //Quebra de linha
            System.out.println();

        }

    }

}
