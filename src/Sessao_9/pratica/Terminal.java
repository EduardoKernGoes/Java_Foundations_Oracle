package Sessao_9.pratica;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Terminal extends Application {
    private Group group;
    private Scene scene;
    private Locais locais;
    private Node dorm1, dorm2, dorm3, dorm4, dorm5, areaCentral, park1, park2, park3, park4, centroEstudos;

    public void start (Stage primeiroStage){
        iniciaObjetos();

        group.getChildren().addAll(dorm1, dorm2, dorm3, dorm4, dorm5, areaCentral, park1, park2, park3, park4, centroEstudos);

        posicaoObjetos();

        primeiroStage.setTitle("Mapa do Campus");
        primeiroStage.setScene(scene);
        primeiroStage.show();
    }

    private void posicaoObjetos(){
        dorm1.setLayoutX(130);
        dorm1.setLayoutY(10);

        dorm2.setLayoutX(10);
        dorm2.setLayoutY(130);

        dorm3.setLayoutX(380);
        dorm3.setLayoutY(10);

        dorm4.setLayoutX(500);
        dorm4.setLayoutY(450);

        dorm5.setLayoutX(10);
        dorm5.setLayoutY(560);

        areaCentral.setLayoutX(340);
        areaCentral.setLayoutY(340);

        park1.setLayoutX(150);
        park1.setLayoutY(150);

        park2.setLayoutX(350);
        park2.setLayoutY(350);

        park3.setLayoutX(350);
        park3.setLayoutY(150);

        park4.setLayoutX(150);
        park4.setLayoutY(350);
    }

    private void iniciaObjetos(){
        group = new Group();
        scene = new Scene(group, 700, 650, Color.rgb(200,200,200));
        locais = new Locais();
        dorm1 = locais.getDorms(1);
        dorm2 = locais.getDorms(2);
        dorm3 = locais.getDorms(3);
        dorm4 = locais.getDorms(4);
        dorm5 = locais.getDorms(5);
        areaCentral = locais.getAreaCentral();
        park1 = locais.getParks(1);
        park2 = locais.getParks(2);
        park3 = locais.getParks(3);
        park4 = locais.getParks(4);
        centroEstudos = locais.getCentroestudos();
    }

    public void iniciar (String[] args){
        launch(args);
    }
}
