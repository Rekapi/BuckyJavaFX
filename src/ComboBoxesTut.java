import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxesTut extends Application {
    Stage window;
    Scene scene;
    Button button;
    ComboBox<String > combobox;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Combo Boxes");
        button = new Button("Combo box submit");

        combobox = new ComboBox<>();
        combobox.getItems().addAll("Good will hunting ","ST, Vincent","Black hat");
        combobox.setPromptText("Whats your movie?");
        combobox.setEditable(true); // you can write what you want
        button.setOnAction(event -> printMovie());
        combobox.setOnAction(event -> System.out.println("User selected " + combobox.getValue())); // no need for button

        VBox layout = new VBox(10); // don t forget spacing
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(combobox,button);
        scene = new Scene(layout,300,250); // dimension of scene
        window.setScene(scene);
        window.show();
    }
// print movie method
    private void printMovie(){
        System.out.println(combobox.getValue());
    }
    public static void main(String[] args) {
        launch(args);
    }
}
