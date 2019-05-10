import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

// communications from window to another
public class ConfirmBox {
    static boolean answer;
    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);  // open new window over the old one but u cant change anything until handle this one
        window.setTitle(title);
        window.setWidth(250);

        Label label = new Label();
        label.setText(message);
        // create 2 buttons
        Button yesButton = new Button("yes");
        Button NoButton = new Button("No");
        // add actions for your buttons great lambda
        yesButton.setOnAction(event -> {
            answer = true;
            window.close();
        });
        NoButton.setOnAction(event -> {
            answer = false;
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesButton,NoButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();  // u cant work on Main window until closing the current

        return answer;
    }
}
