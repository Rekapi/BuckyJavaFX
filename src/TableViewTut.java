import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewTut extends Application {
    Stage window;
    Button button;
    Scene scene;
    TableView<Product> tableView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window =primaryStage;
        window.setTitle("Table View ");
        window.setResizable(false);
        // table columns
        // name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name"); // the column Address
        nameColumn.setMinWidth(100);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name")); // make sure that the property is with the same name on product class
        // price column
        TableColumn<Product, String> priceColumn = new TableColumn<>("Price"); // the column Address
        priceColumn.setMinWidth(50);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        // quantity column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity"); // the column Address
        quantityColumn.setMinWidth(50);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        // adding this stuff to the table
        tableView = new TableView<>();
        tableView.setItems(getProduct());
        tableView.getColumns().addAll(nameColumn,priceColumn,quantityColumn);


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(tableView);
        scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }

    // data list
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Lab top",859.00,20));
        products.add(new Product("Bouncy ball",2.49,198));
        products.add(new Product("Toilets",99.00,74));
        products.add(new Product("The Notebook DVD",19.99,12));

        return products;
    }
}
