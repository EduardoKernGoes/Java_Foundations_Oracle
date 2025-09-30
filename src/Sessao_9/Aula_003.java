package Sessao_9;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Aula_003 extends Application {

    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Group group = new Group();
        Scene scene = new Scene(root, 600, 400, Color.rgb(50,80,80));

        Image imagem = new Image (getClass().getResource("Captura de tela 2025-09-25 083421.png").toString());

        ImageView imagemView = new ImageView(imagem);




        root.getChildren().add(group);
        group.getChildren().addAll(imagemView);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
