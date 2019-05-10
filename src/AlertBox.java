import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);  // open new window over the old one but u cant change anything until handle this one
        window.setTitle(title);
        window.setWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close the window ");
        closeButton.setOnAction(event -> window.close());
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();  // close before

    }
}
