package Sessao_9;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Aula_001 extends Application {

    //JavaFXMain, .java disponível no curso
    @Override

    //Main do JavaFX
    public void start(Stage primaryStage) {

        //Botões são como objetos podem ser instanciados, contêm campos e contêm métodos
        Button btn = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();

        btn.setText("Say 'He");
        btn2.setText("ll");
        btn3.setText("oW");
        btn4.setText("or");
        btn5.setText("ld'");

        //Faz a interação do botão, o que vai acontecer se eu clicar nele
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        HBox root = new HBox();
        Group group = new Group();
        group.getChildren().add(root);
        root.getChildren().addAll(btn, btn2, btn3, btn4, btn5);


        Scene scene = new Scene(group, 300, 300);

        group.setLayoutY((scene.getHeight() - 30));

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        //to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
