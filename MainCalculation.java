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
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")),
            new ChoiceBox<String>(FXCollections.observableArrayList("S", "A", "B", "C", "D", "E", "F", "履修なし")) };
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

    String[] subNames = { new String("科学技術者倫理"), new String("ソフトウェア工学"), new String("分散システム"), new String("デジタル通信"),
            new String("映像メディア"), new String("計算論"), new String("コンピュータアーキテクチャ実践"), new String("コンピュータグラフィックス"),
            new String("符号と暗号"), new String("情報工学専門実験A・B") };
    String[] subNums = { new String("2"), new String("2"), new String("2"), new String("2"), new String("2"),
            new String("2"), new String("2"), new String("2"), new String("2"), new String("3") };
    Label lavel = new Label("結果");
    Button button = new Button("計算");

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) {
        stage.setHeight(600);
        stage.setWidth(750);
        stage.setTitle("QPA計算");

        button.setOnAction(event -> changeQPA());
        GridPane mainGrid = new GridPane();
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);
        for (int i = 0; i < subChoiceBoxs.length; i++) {
            subChoiceBoxs[i].setValue("履修なし");
            if (i < 10) {
                subNumChoiceBoxs[i].setValue(subNums[i]);
                mainGrid.add(new TextField(subNames[i]), 0, i);
                mainGrid.add(subChoiceBoxs[i], 1, i);
                mainGrid.add(subNumChoiceBoxs[i], 2, i);
            } else {
                subNumChoiceBoxs[i].setValue("1");
                mainGrid.add(new TextField(), 3, i - 10);
                mainGrid.add(subChoiceBoxs[i], 4, i - 10);
                mainGrid.add(subNumChoiceBoxs[i], 5, i - 10);
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
            int subNum = Integer.parseInt(subNumChoiceBoxs[i].getValue().toString());
            System.out.println("Sub:" + subNum);
            switch (subChoiceBoxs[i].getValue().toString()) {
            case "S":
                num += subNum;
                score += 4 * subNum;
                break;
            case "A":
                num += subNum;
                score += 3 * subNum;
                break;
            case "B":
                num += subNum;
                score += 2 * subNum;
                break;
            case "C":
                num += subNum;
                score += 1 * subNum;
                break;
            case "D":
                num += subNum;
                score += 0 * subNum;
                break;
            case "E":
                num += subNum;
                score += 0 * subNum;
                break;
            case "F":
                num += subNum;
                score += 0 * subNum;
                break;
            case "履修なし":
                break;
            default:
                break;
            }
        }
        if (num != 0) {
            lavel.setText("QPAScore:" + (float) score / (float) num);
        } else {
            lavel.setText("QPAScore:" + 0);
        }
    }
}