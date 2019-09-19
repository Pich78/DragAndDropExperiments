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
        // Generate drag detect event after the current mouse pressed event
        e.setDragDetect(true);
    }
    void MouseDraggedAction(MouseEvent e) {
        print("Source: " + ((Button)e.getSource()).getText() + " dragged");
        // Suppress the drag detected default event generation after mouse dragged
        e.setDragDetect(false);
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
