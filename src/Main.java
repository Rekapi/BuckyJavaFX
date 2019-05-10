import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// making window with single button which printing out "Hello Lambda Exp"
public class Main extends Application {
    Button button;
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
         window = primaryStage;
        window.setTitle("Hello FX");
        // closing method
        window.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });
        button = new Button();
        Button button2 = new Button("Close the window ");
        button.setText("Click me");
        button.setOnAction(event -> {
            System.out.println("Hello Lambda Exp"); // to make multilines
            // confirmBox
           boolean result =  ConfirmBox.display("Title of the window", "Are you sure do this ");
            System.out.println(result);
        });
        button2.setOnAction(event -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button,button2);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display("title "," Are sure you want to close ");
        if(answer)
            window.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
