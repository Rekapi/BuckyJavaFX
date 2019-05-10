import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxesTut extends Application {
    Stage window;
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Title");

        // Declaring CheckBoxes
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);  // make it default checked

        button = new Button(" Order now");
        button.setOnAction(event -> handleOptions(box1,box2));
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1,box2,button); // arranging your components the first will appear first and so on ...
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    // handle option method
    private void handleOptions(CheckBox box1, CheckBox box2){
        String message = "user order : ";
        if(box1.isSelected())
            message += "Bacon\n";

        if(box2.isSelected())
            message +="Tuna\n";
        System.out.print(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
