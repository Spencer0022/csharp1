package javafxapp2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.*;
public class JavaFXApp2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        Group root=new Group();
        Scene scene=new Scene(root,600,600,Color.CORNFLOWERBLUE);
        Stage stage=new Stage();
        Text text=new Text();
        text.setText("Runescape 5.0");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("HACK"));
        text.setFill(Color.LIMEGREEN);
        Line line=new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);
        
        Rectangle rectangle =new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.ANTIQUEWHITE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        
        Polygon triangle =new Polygon();
        triangle.getPoints().setAll(200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.YELLOW);
        
        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);
        Image smallpepe =new Image("smallpepe.jpg");
        ImageView smallpepeIW=new ImageView(smallpepe);
        smallpepeIW.setX(400);
        smallpepeIW.setY(400);
        
        
        root.getChildren().add(smallpepeIW);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        
        stage.setScene(scene);
        stage.show();
        
        
    } 
     
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
