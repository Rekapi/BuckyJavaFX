import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// making multiScenes with button clicked to switch between it

public class MultiScenes extends Application {
    Stage window;
    Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        // button 1 and label 1
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(event -> window.setScene(scene2));

        // Layout 1- children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,200,200);

        // button 2 and label 2
        Button button2 = new Button("Go to Scene 1");
        button2.setOnAction(event -> window.setScene(scene1));

        // Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Title ");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
