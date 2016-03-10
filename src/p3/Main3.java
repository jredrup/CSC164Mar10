package p3;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main3 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle circle = new Circle(50); //radius...can also put location coordinates in here (100, 100, 50)
        circle.setCenterX(100);
        circle.setCenterY(100);
        //circle.setRadius(50);
        //Stroke = border
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.CRIMSON);

        Circle circle2 = new Circle(200, 200, 50);

        //Button btOK = new Button("OK");
        //200 by 300 dimensions
        //Scene scene = new Scene(btOK, 200, 300);
        //Stack Pane will stack one or more things or something?  Will keep button in center, on top or under other button
        Pane pane = new Pane(); //if new StackPane, would be centered
        //pane.getChildren().add(circle);
        //pane.getChildren().add(circle2);
        //or
        pane.getChildren().addAll(circle, circle2);
        //pane.getChildren().add(new Button("Very Very Extremely OK"));
        //pane.getChildren().add(new Button("Very OK"));

        Scene scene = new Scene(pane, 200, 300);

        primaryStage.setTitle("My First JavaFX Project");
        primaryStage.setScene(scene);
        //need a .show or won't see anything
        primaryStage.show();
    }
}
