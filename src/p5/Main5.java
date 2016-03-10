package p5;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main5 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        //FlowPane pane = new FlowPane();
        GridPane pane = new GridPane();
        //border of pane, (counter?)clockwise starting at top
        pane.setPadding(new Insets(10, 10, 10, 10));
        //borders around nodes within pane
        pane.setHgap(5);
        pane.setVgap(5);

        TextField tfFN = new TextField();
        TextField tfMI = new TextField();
        //tfMI.setPrefColumnCount(1);//does nothing in GridPane
        TextField tfLN = new TextField();

        /*pane.getChildren().addAll(new Label ("First Name"),tfFN,
                new Label("MI"), tfMI,
                new Label("Last Name"),tfLN/*new TextField());
        // text fields shouldn't be anonymous due to not making any damn sense */

        //Place the nodes in the pane
        pane.add(new Label ("First Name"), 0,0);
        pane.add(tfFN, 1, 0);
        pane.add(new Label ("MI"), 0, 1);
        pane.add(tfMI, 1, 1);
        pane.add(new Label ("Last Name"), 0, 2);
        pane.add(tfLN, 1, 2);

        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        //align the button horizontally
        GridPane.setHalignment(btAdd, HPos.CENTER);
        Scene scene = new Scene(pane, 250, 250);

        primaryStage.setTitle("My First JavaFX Project");
        primaryStage.setScene(scene);
        //need a .show or won't see anything
        primaryStage.show();
    }
}
