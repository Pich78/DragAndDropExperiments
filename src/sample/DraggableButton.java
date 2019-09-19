package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.beans.EventHandler;

public class DraggableButton extends Button {

    public DraggableButton (String name) {

        super(name);
        this.setMinSize(100,30);
        this.setOnMousePressed(e -> MousePressedAction(e));
        this.setOnMouseDragged(e -> MouseDraggedAction(e));
        this.setOnDragDetected(e -> MouseDragDetectedAction(e));
        this.setOnMouseReleased(e -> MouseReleasedAction(e));

    }

    void MousePressedAction(MouseEvent e) {
        print("Source: " + ((Button)e.getSource()).getText() + " pressed");
    }
    void MouseDraggedAction(MouseEvent e) {
        print("Source: " + ((Button)e.getSource()).getText() + " dragged");
    }
    void MouseDragDetectedAction(MouseEvent e) {
        print("Source: " + ((Button)e.getSource()).getText() + " drag detected");
    }
    void MouseReleasedAction(MouseEvent e) {
        print("Source: " + ((Button)e.getSource()).getText() + " released");
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
