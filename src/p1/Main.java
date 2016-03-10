package p1;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("OK");
        //200 by 300 dimensions
        Scene scene = new Scene(btOK, 200, 300);
        primaryStage.setTitle("My First JAvaFX Project");
        primaryStage.setScene(scene);
        //need a .show or won't see anything
        primaryStage.show();
    }
}
