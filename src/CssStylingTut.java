import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CssStylingTut extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        window = stage;
        window.setTitle("Log in");
    //    BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setHgap(10);
        gridPane.setVgap(8);
        // adding name label
        Label nameLabel = new Label("User Name ");
        GridPane.setConstraints(nameLabel,0,0);
        // adding name input
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput,1,0);
        // adding email label
        Label emailLabel = new Label("Email Address");
        GridPane.setConstraints(emailLabel,0,1);
        // adding email input
        TextField emailInput = new TextField();
        GridPane.setConstraints(emailInput,1,1);
        // Login button
        Button loginBtn = new Button("Log In");
        GridPane.setConstraints(loginBtn,1,2);
        // starting the lesson from here
        // start building our styling sheet - adding new css file
         gridPane.getChildren().addAll(nameLabel,nameInput,emailLabel,emailInput,loginBtn);
        Scene scene = new Scene(gridPane,300,300);
        // adding styling sheet to the scene ...
        scene.getStylesheets().add("Viper.css");
        window.setScene(scene);
        window.show();
    }
}
