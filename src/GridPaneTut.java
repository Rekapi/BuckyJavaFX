import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
// Grid layout tutorial
public class GridPaneTut extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("title");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(8);  // vertical spacing
        gridPane.setHgap(10); // horizontal spacing
         // adding some stuff
        Label nameLabel = new Label("user name : ");
        GridPane.setConstraints(nameLabel,0,0);
        TextField nameInput = new TextField("ex. Bucky");
        GridPane.setConstraints(nameInput,1,0);
        Label password = new Label("Pass word : ");
        GridPane.setConstraints(password,0,1);
        TextField passInput = new TextField();
        passInput.setPromptText("****************");
        GridPane.setConstraints(passInput,1,1);
        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton,1,2);

        gridPane.getChildren().addAll(nameInput,nameLabel,passInput,password,loginButton);
        Scene scene = new Scene(gridPane,300,200); // set dimension of the scene
        window.setScene(scene);  // adding the scene to the window
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
