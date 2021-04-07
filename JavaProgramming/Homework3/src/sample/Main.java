package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class Main extends Application {

    private static final int GRID_WIDTH = 300;
    private static final int GRID_HEIGHT = 300;
    private static final int COLUMN_SIZE = 10;
    private static final int ROW_SIZE = 10;

    class SpecialPane extends StackPane {

        public SpecialPane() {
            int rectHeight = GRID_HEIGHT / ROW_SIZE;
            int rectWidth = GRID_WIDTH / COLUMN_SIZE;

            Rectangle rect = new Rectangle();
            rect.setWidth(rectWidth);
            rect.setHeight(rectHeight);
            rect.setFill(Color.color(Math.random(), Math.random(), Math.random()));   // red green blue
            rect.setOpacity(0.5);

            int num = (int) (Math.random() * 100 + 1);

            Text text = new Text(Integer.toString(num));
            text.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 12));

            getChildren().addAll(rect, text);

        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("10 by 10 matrix");

        GridPane grid = new GridPane();

        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COLUMN_SIZE; j++) {
                SpecialPane temp = new SpecialPane();
                grid.add(temp, j, i);
            }
        }

        primaryStage.setScene(new Scene(grid, GRID_WIDTH, GRID_HEIGHT));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
