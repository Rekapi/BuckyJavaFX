import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenusTut extends Application {
    Stage window;
    Scene scene;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        window =stage;
        window.setTitle("Menu Tutorial");
        // File menu
        Menu fileMenu = new Menu("File");
        // menu items
        fileMenu.getItems().add(new MenuItem("New Project..."));
        fileMenu.getItems().add(new MenuItem("New Module..."));
        fileMenu.getItems().add(new MenuItem("Import Projects..."));
        // three dots means that there is a new dialog will be appears - arrows means there is sub menu will appear - nothing means that's it
        // main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);
        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
}
