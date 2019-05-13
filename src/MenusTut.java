import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        Menu fileMenu = new Menu("_File");
        MenuItem newFile = new MenuItem("New ...");
        newFile.setOnAction(event -> System.out.println("create new file"));
        fileMenu.getItems().add(newFile);
        // menu items
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        // Adding separators between menu items - between save and setting
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Setting..."));
        fileMenu.getItems().add(new MenuItem("Exit..."));
        // Edit menu
        Menu editMenu = new Menu("_Edit"); // underScore is for clicking alt to shortcut
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));
        MenuItem paste = new MenuItem("paste");
        paste.setOnAction(event -> System.out.println("paste something"));
        // paste.setDisable(true); // this will disable the menu item
        editMenu.getItems().add(paste);

        // Lesson 23- check menu Item
        // help menu
        Menu helpMenu = new Menu("Help");
        // check menu item
        CheckMenuItem showLines = new CheckMenuItem("Show Line numbers "); // will put a check mark beside your menu item
        showLines.setOnAction(event -> {
            if(showLines.isSelected())
                System.out.println("display lines numbers ");
            else
                System.out.println("hiding lines numbers ");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Auto Save");
        autoSave.setSelected(true); // make it default checked
        helpMenu.getItems().addAll(showLines,autoSave);
        // three dots means that there is a new dialog will be appears - arrows means there is sub menu will appear - nothing means that's it
        // main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu);
        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
}
