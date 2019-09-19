package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Drag and drop experiments");

        HBox mainBox = new HBox();

        VBox list1 = new VBox();
        VBox list2 = new VBox();

        Button button11 = new Button("11");
        button11.setMinSize(100,30);

        Button button12 = new Button("12");
        button12.setMinSize(100,30);

        Button button13 = new Button("13");
        button13.setMinSize(100,30);

        Button button21 = new Button("21");
        button21.setMinSize(100,30);

        Button button22 = new Button("22");
        button22.setMinSize(100,30);

        Button button23 = new Button("23");
        button23.setMinSize(100,30);

        list1.getChildren().addAll(button11,button12,button13);
        list2.getChildren().addAll(button21,button22,button23);

        mainBox.getChildren().addAll(list1,list2);

        Scene scene = new Scene(mainBox, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
