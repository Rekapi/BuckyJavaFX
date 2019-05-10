import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
// ChoicesBoxes tutorial Drop down menu
public class ChoiceBoxesTut extends Application {
    Stage window;
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Choice Boxes");
        button = new Button("Click me");
        // creating ChoiceBoxes
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        // get items returns the observable objects which you can add
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().add("bacon");
        choiceBox.getItems().add("ham");
        choiceBox.getItems().add("meatballs");
        choiceBox.setValue("Apples");  // set this value as the default value
        button.setOnAction(event -> getChoice(choiceBox) );

        VBox layout = new VBox(10); // spacing between layout component
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    // to get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
