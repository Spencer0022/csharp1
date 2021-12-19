/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;

/**
 *
 * @author sp
 */
public class JavaFXApp1 extends Application {
    
    @Override
    public void start(Stage stage) {
       Group root = new Group();
       Scene scene = new Scene(root,Color.BLACK);
       stage.setTitle("Stage Demo Program");
       Image icon = new Image("guywithhaticon.png");
       stage.getIcons().add(icon);
       stage.setWidth(420);
       stage.setHeight(420);
       stage.setResizable(false);
       //stage.setX(350);
       //stage.setY(350);
       stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CANNOT ESCAPE");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
       stage.setScene(scene);
       
       stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
