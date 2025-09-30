package Sessao_9.pratica;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

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
            descricao.setFont(new Font("Arial", 20));

            descricao.setText("Dormitório 1");

            descricao.setX(100 - (descricao.getLayoutBounds().getWidth() / 2));
            descricao.setY(45);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm1, descricao);

            acaoMouse(dormNode, "dorm1");
            return dormNode;
        }else if (num == 2){
            descricao.setFont(new Font("Arial", 20));

            descricao.setText("Dormitório 2");

            descricao.setX(-15);
            descricao.setY(115 - (descricao.getLayoutBounds().getHeight() / 2));
            descricao.setRotate(90);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm2, descricao);

            acaoMouse(dormNode, "dorm2");
            return dormNode;
        }else if (num == 3){

            descricao.setText("Dormitório 3");

            descricao.setX(45);
            descricao.setY(100 - (descricao.getLayoutBounds().getWidth() / 2));

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm3, descricao);

            acaoMouse(dormNode, "dorm3");
            return dormNode;
        }else if  (num == 4){

            descricao.setText("Dormitório 4");

            descricao.setX(45);
            descricao.setY(155 - (descricao.getLayoutBounds().getWidth() / 2));
            descricao.setRotate(-46);

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm4, descricao);

            dorm4.setFill(Color.DIMGREY);

            acaoMouse(dormNode, "dorm4");
            return dormNode;
        }else{

            descricao.setText("Dormitório 5");

            descricao.setX(45);
            descricao.setY(100 - (descricao.getLayoutBounds().getWidth() / 2));

            Group dormNode = new Group();
            dormNode.getChildren().addAll(dorm5, descricao);

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
        System.out.println(local);
    }
}
