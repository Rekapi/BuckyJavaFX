import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// making window with single button which printing out "Hello Lambda Exp"
public class Main extends Application {
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello FX");
        button = new Button();
        button.setText("Click me");
        button.setOnAction(event -> {
            System.out.println("Hello Lambda Exp"); // to make multilines
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
