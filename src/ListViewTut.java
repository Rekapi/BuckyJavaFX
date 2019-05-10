import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewTut extends Application {
    Stage window;
    Button button;
    Scene scene;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("List View ");
        button = new Button("Click me");
        listView = new ListView<>();
        listView.getItems().addAll("Iron man","Titanic", "contact","Surrgates ");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // to select multiple Items
        button.setOnAction(event -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(listView,button);
        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    public void buttonClicked(){
        String message = "";
        ObservableList<String > movies;
        movies = listView.getSelectionModel().getSelectedItems();
        for(String m : movies){
            message += m + "\n"; // + sign to print multi selection
        }
        System.out.print(message);
    }
}
