package com.example.demo100;
/* These lines are importing necessary JavaFX and Java libraries.
 import javafx.fxml.FXML;
 indicates that this class will use the @FXML annotation, and
  import javafx.scene.control.Label;
  imports the Label class, which is a JavaFX UI control used to display text. */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
/*This line declares the class HelloController.
It's a typical naming convention to name controller classes
based on the name of the corresponding FXML file.
This class will serve as the controller for UI elements defined
in an associated FXML file. */
public class HelloController {
    /*This line uses the @FXML annotation to inject a JavaFX Label named welcomeText.
    This label corresponds to a UI element defined in the associated FXML file,
     and the annotation allows the FXML loader to bind this Java field to the
     corresponding UI element in the FXML*/
    @FXML
    private Label welcomeText;
/*This method, onHelloButtonClick, is annotated with @FXML,
 indicating that it is an event handler method for an element
  defined in the associated FXML file. It responds to a button click event.
When the button (which should be defined in the associated FXML) is clicked,
 this method will be invoked.*/
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}