package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.beans.EventHandler;

public class DraggableButton extends JFXButton {

    public DraggableButton (String name) {

        super(name);
        this.setMinSize(100,30);
        this.setOnMousePressed(e -> MousePressedAction(e));
        this.setOnMouseDragged(e -> MouseDraggedAction(e));
        this.setOnDragDetected(e -> MouseDragDetectedAction(e));
        this.setOnMouseReleased(e -> MouseReleasedAction(e));

    }

    void MousePressedAction(MouseEvent e) {
        // Make sure the node is not picked
        //setMouseTransparent(true);
        print("Source: " + ((Button)e.getSource()).getText() + " pressed");
        print("Mouse x: "+ e.getX());
        print("Mouse y: "+ e.getY());
        print("Button x: " + ((Button)e.getSource()).getLayoutX());
        print("Button y: " + ((Button)e.getSource()).getLayoutY());
        // Generate drag detect event after the current mouse pressed event
        e.setDragDetect(true);
    }
    void MouseDraggedAction(MouseEvent e) {
        // Start a full press-drag-release gesture
        //startFullDrag();
        print("Source: " + ((Button)e.getSource()).getText() + " dragged");
        //print("x: "+ e.getX());
        //print("y: "+ e.getY());
        // Suppress the drag detected default event generation after mouse dragged
        e.setDragDetect(false);
    }
    void MouseDragDetectedAction(MouseEvent e) {
        print("Source: " + ((Button)e.getSource()).getText() + " drag detected");
        //print("x: "+ e.getX());
        //print("y: "+ e.getY());
    }
    void MouseReleasedAction(MouseEvent e) {
        // Make sure the node is picked
        setMouseTransparent(false);
        print("Source: " + ((Button)e.getSource()).getText() + " released");
        //print("x: "+ e.getX());
        //print("y: "+ e.getY());
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
