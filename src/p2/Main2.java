package p2;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Button btOK = new Button("OK");
        //200 by 300 dimensions
        //Scene scene = new Scene(btOK, 200, 300);
        //Stack Pane will stack one or more things or something?  Will keep button in center, on top or under other button
        Pane pane = new StackPane();
        pane.getChildren().add(new Button("Very Very Extremely OK"));
        //pane.getChildren().add(new Button("Very OK"));

        Scene scene = new Scene(pane, 200, 50);

        primaryStage.setTitle("My First JavaFX Project");
        primaryStage.setScene(scene);
        //need a .show or won't see anything
        primaryStage.show();
    }
}
