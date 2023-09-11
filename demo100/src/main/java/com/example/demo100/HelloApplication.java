//package name
package com.example.demo100;
//importing our application class library
import javafx.application.Application;
//importing our FXML(XML) File class library
import javafx.fxml.FXMLLoader;
//importing scene library
import javafx.scene.Scene;
//importing stage library
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//importing IO Exception Library
import java.io.IOException;
/* we need to extend a class named application within our main class(inherit properties of
 our application class into main class) so that in order to work with JavaFX application
  this will be our entry point for our JavaFX application*/
public class HelloApplication extends Application {
    /*application class has 3 main methods which we have to override 1)init() 2)start() 3)stop()*/
    @Override
    /*method to initialise items and stuff(things to do when application loads*/
    public void init(){
        System.out.println("Inside the init()");
    }
    //this method is where we define our main UI elements and write stuff
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("Inside the start()");
        VBox root = new VBox();
        Button b = new Button("Click Here");
        root.getChildren().add(b);
        //b.setOnAction(this :: handleButtonClick);
        /*loading an FXML file */
        /* HelloController.java reference is present here inside the FXML file */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        /* In this line of code, you are creating
         a Scene object and initializing it with the content loaded from an FXML file
         using the FXMLLoader. FXML contains root node:*/
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(root, 320, 240);
        //linking css through root node
        //Scene myScene_css = new Scene(VBox); ( Load FXML first if we  want to link css and get root node )
        /* css_link */

        /* css_link stop */

        /* sets stage title to hello*/
        stage.setTitle("Hello!");
        /* setting scene on stage */
        stage.setScene(scene);
        /*displaying window on screen using show() method */
        stage.show();
    }
    @Override
    /*this method is used to perform all operations to be performed during an exit of an application*/
    public void stop(){
        System.out.println("Inside the stop()");
    }
    /*Our main method which contains the launch() method in order to launch the application*/
    public static void main(String[] args) {
        launch();
    }
    public void handleButtonClick(){

    }
}