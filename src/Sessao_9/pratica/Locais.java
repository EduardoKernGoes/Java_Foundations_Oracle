package Sessao_9.pratica;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Locais {
    private Rectangle dorm1 = new Rectangle(200, 80, Color.DIMGREY);
    private Rectangle dorm2 = new Rectangle(80, 200, Color.DIMGREY);
    private Rectangle dorm3 = new Rectangle(200, 80, Color.DIMGREY);
    private Polygon dorm4 = new Polygon(
            0, (dorm1.getWidth() / Math.sqrt(2)),
            (dorm1.getHeight() /  Math.sqrt(2)), ((dorm1.getWidth() / Math.sqrt(2)) + (dorm1.getHeight() /  Math.sqrt(2))),
            ((dorm1.getWidth() / Math.sqrt(2)) + (dorm1.getHeight() /  Math.sqrt(2))), (dorm1.getHeight() /  Math.sqrt(2)),
            (dorm1.getWidth() / Math.sqrt(2)), 0
    );
    private Rectangle dorm5 = new Rectangle(200, 80, Color.DIMGREY);
    private Circle areaCentral = new Circle(100, Color.SADDLEBROWN);
    private Path park1 = new Path(), park2 = new Path(),  park3 = new Path(), park4 = new Path();
    private Text alunosDorm1 = new Text(), alunosDorm2 = new Text(), alunosDorm3 = new Text(),
            alunosDorm4 = new Text(),  alunosDorm5 = new Text();
    private int qntAlunosDorm1, qntAlunosDorm2, qntAlunosDorm3, qntAlunosDorm4,  qntAlunosDorm5;
    private Circle centroEstudos = new Circle(10, Color.RED);

    private void atualizarCentroEstudos() {

        double[] pesos = {qntAlunosDorm1, qntAlunosDorm2, qntAlunosDorm3, qntAlunosDorm4, qntAlunosDorm5};
        double somaPesos = qntAlunosDorm1 + qntAlunosDorm2 + qntAlunosDorm3 + qntAlunosDorm4 + qntAlunosDorm5;
        double[] coordsX = {230, 50, 480, 570, 110};
        double[] coordsY = {50, 230, 50, 520, 600};
        double centroMassaX = 0;
        double centroMassaY = 0;
        double totalPesos = qntAlunosDorm1 +  qntAlunosDorm2 + qntAlunosDorm3 +  qntAlunosDorm4 + qntAlunosDorm5;


        if (somaPesos > 0) {
            for (int i = 0; i < pesos.length; i++) {
                centroMassaX += coordsX[i] * pesos[i];
                centroMassaY += coordsY[i] * pesos[i];
            }
            centroMassaX /= somaPesos;
            centroMassaY /= somaPesos;
        } else {
            centroMassaX = (coordsX[0] + coordsX[1] + coordsX[2] + coordsX[3] + coordsX[4]) / 5.0;
            centroMassaY = (coordsY[0] + coordsY[1] + coordsY[2] + coordsY[3] + coordsY[4]) / 5.0;
        }

        centroEstudos.setLayoutX(centroMassaX - centroEstudos.getRadius());
        centroEstudos.setLayoutY(centroMassaY - centroEstudos.getRadius());
    }

    public Node getCentroestudos(){

        double[] pesos = {qntAlunosDorm1, qntAlunosDorm2, qntAlunosDorm3, qntAlunosDorm4, qntAlunosDorm5};
        double somaPesos = qntAlunosDorm1 + qntAlunosDorm2 + qntAlunosDorm3 + qntAlunosDorm4 + qntAlunosDorm5;
        double[] coordsX = {230, 50, 480, 570, 110};
        double[] coordsY = {50, 230, 50, 520, 600};
        double centroMassaX = 0;
        double centroMassaY = 0;
        double totalPesos = qntAlunosDorm1 +  qntAlunosDorm2 + qntAlunosDorm3 +  qntAlunosDorm4 + qntAlunosDorm5;


        if (totalPesos > 0){
            for (int i = 0; i < pesos.length; i++){
                centroMassaX += coordsX[i] * pesos[i];
                centroMassaY += coordsY[i] * pesos[i];
            }
            centroMassaX /= totalPesos;
            centroMassaY /= totalPesos;
        }else{
            for (int i = 0; i < pesos.length; i++){
                centroMassaX += coordsX[i];
                centroMassaY += coordsY[i];
            }
            centroMassaX /= (pesos.length + 1);
            centroMassaY /= (pesos.length + 1);
        }

        centroEstudos.setLayoutX(centroMassaX - centroEstudos.getRadius());
        centroEstudos.setLayoutY(centroMassaY - centroEstudos.getRadius());

        return centroEstudos;
    }

    public Node getParks(int num){
        Text descricao = new Text();
        descricao.setFont(new Font("Arial", 20));

        double largura = 180;
        double altura = 180;
        double curva = 90;

        if (num == 1){

            park1.getElements().addAll(
                    new MoveTo(0,0),
                    new LineTo(largura, 0),
                    new LineTo(largura, curva / 2),
                    new QuadCurveTo(curva / 2, curva / 2, curva / 2, altura),
                    new LineTo(0, altura),
                    new ClosePath()
            );

            park1.setFill(Color.DARKGREEN);

            descricao.setText("Park1");

            descricao.setX(curva / 2 - 15);
            descricao.setY(curva / 2 + 10);

            Group parkNode = new Group();
            parkNode.getChildren().addAll(park1, descricao);

            return parkNode;

        }else if (num == 2){

            park2.getElements().addAll(
                    new MoveTo(largura, altura),
                    new LineTo(largura, 0),
                    new LineTo(curva + (curva / 2), 0),
                    new QuadCurveTo(curva + (curva / 2), curva + (curva / 2), 0, curva + (curva / 2)),
                    new LineTo(0, altura),
                    new ClosePath()
            );

            park2.setFill(Color.DARKGREEN);

            descricao.setText("Park2");

            descricao.setX(curva + (curva / 2) - 30);
            descricao.setY(curva + (curva / 2) + 10);

            Group parkNode = new Group();
            parkNode.getChildren().addAll(park2, descricao);

            return parkNode;

        }else if (num == 3){

            park3.getElements().addAll(
                    new MoveTo(largura, 0),
                    new LineTo(0, 0),
                    new LineTo(0, curva / 2),
                    new QuadCurveTo(curva + (curva / 2), curva / 2, curva + (curva / 2), altura),
                    new LineTo(largura, altura),
                    new ClosePath()
            );

            park3.setFill(Color.DARKGREEN);

            descricao.setText("Park3");

            descricao.setX(curva + (curva / 2) - 30);
            descricao.setY(curva / 2 + 10);

            Group parkNode = new Group();
            parkNode.getChildren().addAll(park3, descricao);

            return parkNode;
        }else{

            park4.getElements().addAll(
                    new MoveTo(0, altura),
                    new LineTo(largura, altura),
                    new LineTo(largura, curva + (curva / 2)),
                    new QuadCurveTo(curva / 2, curva + (curva / 2), curva / 2, 0),
                    new LineTo(0, 0),
                    new ClosePath()
            );

            park4.setFill(Color.DARKGREEN);

            descricao.setText("Park4");

            descricao.setX(curva / 2 - 15);
            descricao.setY(curva + (curva / 2) + 10);

            Group parkNode = new Group();
            parkNode.getChildren().addAll(park4, descricao);

            return parkNode;
        }
    }

    public Node getDorms(int num){
        Text descricao = new Text();
        descricao.setFont(new Font("Arial", 20));

        if (num == 1){

            alunosDorm1 = new Text("Alunos: " + qntAlunosDorm1);

            descricao.setText("Dormitório 1");

            descricao.setX(100 - (descricao.getLayoutBounds().getWidth() / 2));
            descricao.setY(45);

            alunosDorm1.setX(100 - (alunosDorm1.getLayoutBounds().getWidth() / 2));
            alunosDorm1.setY(60);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm1, descricao, alunosDorm1);

            acaoMouse(dormNode, "dorm1");
            return dormNode;

        }else if (num == 2){

            alunosDorm2 = new Text("Alunos: " + qntAlunosDorm2);

            descricao.setText("Dormitório 2");

            descricao.setX(-15);
            descricao.setY(115 - (descricao.getLayoutBounds().getHeight() / 2));
            descricao.setRotate(90);

            alunosDorm2.setX(0);
            alunosDorm2.setY(115 - (descricao.getLayoutBounds().getHeight() / 2));
            alunosDorm2.setRotate(90);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm2, descricao, alunosDorm2);

            acaoMouse(dormNode, "dorm2");
            return dormNode;

        }else if (num == 3){

            alunosDorm3 = new Text("Alunos: " +  qntAlunosDorm3);

            descricao.setText("Dormitório 3");

            descricao.setX(45);
            descricao.setY(100 - (descricao.getLayoutBounds().getWidth() / 2));

            alunosDorm3.setX(100 - (alunosDorm3.getLayoutBounds().getWidth() / 2));
            alunosDorm3.setY(60);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm3, descricao, alunosDorm3);

            acaoMouse(dormNode, "dorm3");
            return dormNode;

        }else if  (num == 4){

            alunosDorm4 = new Text("Alunos: " + qntAlunosDorm4);

            descricao.setText("Dormitório 4");

            descricao.setX(45);
            descricao.setY(155 - (descricao.getLayoutBounds().getWidth() / 2));
            descricao.setRotate(-46);

            alunosDorm4.setX(95);
            alunosDorm4.setY(165 - (descricao.getLayoutBounds().getWidth() / 2));
            alunosDorm4.setRotate(-46);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm4, descricao, alunosDorm4);

            dorm4.setFill(Color.DIMGREY);

            acaoMouse(dormNode, "dorm4");
            return dormNode;

        }else{

            alunosDorm5 = new Text("Alunos: " + qntAlunosDorm5);

            descricao.setText("Dormitório 5");

            descricao.setX(45);
            descricao.setY(100 - (descricao.getLayoutBounds().getWidth() / 2));

            alunosDorm5.setX(100 - (alunosDorm5.getLayoutBounds().getWidth() / 2));
            alunosDorm5.setY(60);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm5, descricao, alunosDorm5);

            acaoMouse(dormNode, "dorm5");
            return dormNode;
        }
    }

    public Node getAreaCentral(){
        Text descricao = new Text();
        descricao.setFont(new Font("Arial", 20));

        descricao.setText("Area Central");

        descricao.setX(-55);
        descricao.setY(5);

        Group areaCentralNode = new Group();
        areaCentralNode.getChildren().addAll(areaCentral, descricao);

        return areaCentralNode;
    }

    private void acaoMouse(Group node, String local){
        node.setOnMouseClicked(event -> {
            adicionarInformacoes(local);
        });
    }

    private void adicionarInformacoes(String local){
        Stage informacoes = new Stage();
        TextField alunos = new TextField();
        Button salvar = new Button("Salvar");
        Text titulo =  new Text("Quantos alunos há neste dormitório?");
        VBox root = new VBox(10);
        Scene infoScene = new Scene(root, 300, 150);

        if (local.equals("dorm1")){
            informacoes.setTitle("Inf. Dormitório 1");

            salvar.setOnAction(event -> {
                try {
                    qntAlunosDorm1 = Integer.parseInt(alunos.getText());

                    alunosDorm1.setText("Alunos: " + qntAlunosDorm1);

                    atualizarCentroEstudos();

                    informacoes.close();
                }catch (NumberFormatException e){
                    Text erro = new Text("Valor inválido! Digite apenas números.");

                    erro.setFill(Color.RED);

                    root.getChildren().add(erro);
                }
            });

        }else if (local.equals("dorm2")){
            informacoes.setTitle("Inf. Dormitório 2");

            salvar.setOnAction(event -> {
                try {
                    qntAlunosDorm2 = Integer.parseInt(alunos.getText());

                    alunosDorm2.setText("Alunos: " + qntAlunosDorm2);

                    atualizarCentroEstudos();

                    informacoes.close();
                }catch (NumberFormatException e){
                    Text erro = new Text("Valor inválido! Digite apenas números.");

                    erro.setFill(Color.RED);

                    root.getChildren().add(erro);
                }
            });

        }else if (local.equals("dorm3")){
            informacoes.setTitle("Inf. Dormitório 3");

            salvar.setOnAction(event -> {
                try {
                    qntAlunosDorm3 = Integer.parseInt(alunos.getText());

                    alunosDorm3.setText("Alunos: " + qntAlunosDorm3);

                    atualizarCentroEstudos();

                    informacoes.close();
                }catch (NumberFormatException e){
                    Text erro = new Text("Valor inválido! Digite apenas números.");

                    erro.setFill(Color.RED);

                    root.getChildren().add(erro);
                }
            });

        }else if (local.equals("dorm4")){
            informacoes.setTitle("Inf. Dormitório 4");

            salvar.setOnAction(event -> {
                try {
                    qntAlunosDorm4 = Integer.parseInt(alunos.getText());

                    alunosDorm4.setText("Alunos: " + qntAlunosDorm4);

                    atualizarCentroEstudos();

                    informacoes.close();
                }catch (NumberFormatException e){
                    Text erro = new Text("Valor inválido! Digite apenas números.");

                    erro.setFill(Color.RED);

                    root.getChildren().add(erro);
                }
            });

        }else if (local.equals("dorm5")){
            informacoes.setTitle("Inf. Dormitório 5");

            salvar.setOnAction(event -> {
                try {
                    qntAlunosDorm5 = Integer.parseInt(alunos.getText());

                    alunosDorm5.setText("Alunos: " + qntAlunosDorm5);

                    atualizarCentroEstudos();

                    informacoes.close();
                }catch (NumberFormatException e){
                    Text erro = new Text("Valor inválido! Digite apenas números.");

                    erro.setFill(Color.RED);

                    root.getChildren().add(erro);
                }
            });

        }


        alunos.setPromptText("Alunos");

        root.getChildren().addAll(titulo, alunos, salvar);
        root.setPadding(new Insets(20));

        informacoes.setScene(infoScene);
        informacoes.show();
    }
}
