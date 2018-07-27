import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * MainCalculation
 */
public class MainCalculation extends Application {
    String[] rank_Strings = { new String("S"), new String("A"), new String("B"), new String("C"), new String("D"),
            new String("F"), new String("-") };
    ChoiceBox[] subChoiceBoxs = {
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "-")) };
    ChoiceBox[] subNumChoiceBoxs = { new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")),
            new ChoiceBox<String>(FXCollections.observableArrayList("1", "2", "3", "4")) };
    Label lavel = new Label("Œ‹‰Ê");
    Button button = new Button("ŒvŽZ");

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        stage.setHeight(600);
        stage.setWidth(750);
        stage.setTitle("QPAŒvŽZ");

        button.setOnAction(event -> changeQPA());
        GridPane mainGrid = new GridPane();
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);
        for (int i = 0; i < subChoiceBoxs.length; i++) {
            subChoiceBoxs[i].setValue("-");
            subNumChoiceBoxs[i].setValue("1");
            if (i < 10) {
                mainGrid.add(new TextField(), 0, i);
                mainGrid.add(subChoiceBoxs[i], 1, i);
                mainGrid.add(subNumChoiceBoxs[i], 2, i);
            } else {
                mainGrid.add(new TextField(), 3, i - 10);
                mainGrid.add(subChoiceBoxs[i], 4, i - 10);
                mainGrid.add(subNumChoiceBoxs[i], 2, i - 10);
            }
        }
        mainGrid.add(lavel, 0, 11);
        mainGrid.add(button, 1, 11);
        Scene scene = new Scene(mainGrid);
        stage.setScene(scene);
        stage.show();
    }

    private void changeQPA() {
        int num = 0;
        int score = 0;
        for (int i = 0; i < subChoiceBoxs.length; i++) {
            switch (subChoiceBoxs[i].getValue().toString()) {
            case "S":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 4 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "A":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 3 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "B":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 2 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "C":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 1 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "D":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 0 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "E":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 0 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "F":
                num += (int) subNumChoiceBoxs[i].getValue();
                score += 0 * (int) subNumChoiceBoxs[i].getValue();
                break;
            case "-":
                break;
            default:
                break;
            }
        }
        if (num != 0) {
            lavel.setText("QPAScore:" + (float) score / (float) num);
        } else {
            lavel.setText("QPAScore:" + (float) score / (float) num + 1.0);
        }
    }
}