import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewTut extends Application {
    Stage window;
    Button button;
    Scene scene;
    TreeView<String> treeView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("List View ");
        button = new Button("Click me");
        // creating tree view
        // first creating the roots
        TreeItem<String> root, Bucky, megan;
        // Root
        root = new TreeItem<>();
        root.setExpanded(true);

        // Bucky
        Bucky = makeBranch("Bucky", root);
        makeBranch("The new Boston", Bucky);
        makeBranch("you tube", Bucky);
        makeBranch("Chicken", Bucky);

        // Megan
        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Make up", megan);
        // create tree
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue) -> {
            if(newValue != null)
                System.out.println(newValue.getValue());
        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(treeView, button);
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}

