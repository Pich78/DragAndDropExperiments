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

        DraggableButton button11 = new DraggableButton("11");
        DraggableButton button12 = new DraggableButton("12");
        DraggableButton button13 = new DraggableButton("13");
        DraggableButton button21 = new DraggableButton("21");
        DraggableButton button22 = new DraggableButton("22");
        DraggableButton button23 = new DraggableButton("23");
        
        list1.getChildren().addAll(button11,button12,button13);
        list2.getChildren().addAll(button21,button22,button23);

        mainBox.getChildren().addAll(list1,list2);

        Scene scene = new Scene(mainBox, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
