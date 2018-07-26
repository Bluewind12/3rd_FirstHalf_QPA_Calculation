import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * MainCalculation
 */
public class MainCalculation extends Application {
    String[] rank_Strings = { new String("S"), new String("A"), new String("B"), new String("C"), new String("D"),
            new String("F"), new String("-") };
    ComboBox[] subComboBoxs = {
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ComboBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")) };

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        stage.setHeight(600);
        stage.setWidth(750);
        stage.setTitle("QPAŒvŽZ");

        GridPane mainGrid = new GridPane();
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);
        for (int i = 0; i < subComboBoxs.length; i++) {
            mainGrid.add(new TextField(), 0, i);
            subComboBoxs[i].setValue("-");
            mainGrid.add(subComboBoxs[i], 1, i);
        }

        Scene scene = new Scene(mainGrid);
        stage.setScene(scene);
        stage.show();
    }
}