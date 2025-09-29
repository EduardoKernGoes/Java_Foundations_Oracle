package Sessao_9;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class Aula_002 extends Application{
    public void start(Stage stage){
        StackPane root = new StackPane();
        Group group = new Group();
        Scene scene = new Scene(root, 600, 400, Color.rgb(10,100,100));
        Rectangle retangulo = new Rectangle(300, 200, 100, 10);
        Rectangle retangulo2 = new Rectangle(400, 200, 100, 200);
        Polygon poligono = new Polygon();

        poligono.getPoints().addAll(new Double[]{
                100.0, 100.0,
                50.0, 200.0,
                150.0, 200.0
        });

        LinearGradient gradiente = new LinearGradient(
                0, 0, 1, 0, //startX: 0, startY: 0, endX:1, endY:0
                true, //proporcional ao tamanho da forma
                null, //CycleMethod, valor padrão é null
                new Stop[]{
                        new Stop(0, Color.WHITE),
                        new Stop(1, Color.BLACK)
                }
        );

        retangulo.setFill(Color.rgb(0, 200, 10));
        retangulo.setStroke(Color.BLACK);
        retangulo2.setFill(gradiente);
        retangulo.setStroke(Color.BLACK);

        root.getChildren().add(group);
        group.getChildren().addAll(retangulo, retangulo2, poligono);



        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
