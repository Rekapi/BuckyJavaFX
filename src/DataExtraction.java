import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

// extracting inputs from user and save it on another window (data base)
public class DataExtraction extends Application {
    Stage window;
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        // adding stuff
        TextField nameInput = new TextField();
        button = new Button("Click me");
        button.setOnAction(event -> isInt(nameInput,nameInput.getText()));
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);
        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }
    // isInt method
    private boolean isInt(TextField input,String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("user is : " + age);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Error : " + message + " is not a number ");
            return false ;
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
