package edu.bsu.cs222.WikipdiaProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>
{
    TextField UserInput;
    Button Search;
    Text APIOutput;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox parent = new VBox();
        primaryStage.setTitle("Wikipedia API Search");
        Search = new Button();
        Search.setText("Click to search");
        Search.setOnAction(this);

        UserInput = new TextField();
        APIOutput = new Text();

        StackPane layout = new StackPane();
        layout.getChildren().add(Search);
        layout.getChildren().add(UserInput);

        Scene scene = new Scene(layout,500,550);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    @Override
    public void handle(ActionEvent event)
    {
        if (event.getSource()==Search)
        {
            System.out.println("Button Pressed");
        }

    }
}
