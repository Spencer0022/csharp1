
package scenebuilder1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class SceneBuilder1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          try{
              Parent root =FXMLLoader.load(getClass().getResource("/FXML1.fxml"));
              Scene scene=new Scene(root);
              primaryStage.setScene(scene);
              primaryStage.show();
          }  catch(Exception e){
              e.printStackTrace();
          }
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
