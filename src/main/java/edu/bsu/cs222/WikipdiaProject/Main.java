package edu.bsu.cs222.WikipdiaProject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application implements EventHandler<ActionEvent>
{
    TextField UserInput;
    Button Search;
    Text APIOutput;


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //VBox parent = new VBox();
        primaryStage.setTitle("Wikipedia API Search");
        Search = new Button();
        Search.setText("Click to search");
        Search.setOnAction(this);
        Search.setLayoutX(50);
        Search.setLayoutY(500);
        Search.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");

        UserInput = new TextField();
        APIOutput = new Text();
        UserInput.setLayoutX(50);
        UserInput.setLayoutY(500);
        APIOutput.setStyle("-fx-font-size: 9.5pt;");
        ScrollPane APIScroll = new ScrollPane();
        APIScroll.setContent(APIOutput);
        APIScroll.setPrefSize(500,500);
        APIScroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        APIScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);



        StackPane layout = new StackPane();
        layout.getChildren().add(Search);
        layout.getChildren().add(UserInput);
        VBox box = new VBox(Search,UserInput,APIScroll,APIOutput);

        Scene scene = new Scene(box,500,575);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    @Override
    public void handle(ActionEvent event)
    {
        if (event.getSource()==Search)
        {
            try
            {

                ApiFetch JavaFXFetch = new ApiFetch(UserInput.getText());
               APIOutput.setText(JavaFXFetch.APIStringOutput(UserInput.getText()));

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            //APIOutput.setText("This finally works");
        }

    }
}
