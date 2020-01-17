package Application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WordSearch extends Application {

	Stage window;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setScene(new Scene(creativeContent()));
		stage.show();

	}

	private Parent creativeContent() {
		Pane root = new Pane();
		root.setPrefSize(600, 600);

		Tile tile = new Tile("A");

		root.getChildren().add(tile);

		return root;

	}

	private class Tile extends StackPane {
		public Tile(String value) {
			Rectangle border = new Rectangle(100, 100);
			border.setFill(null);
			border.setStroke(Color.BLACK);

			Text text = new Text(value);
			text.setFont(Font.font(30));

			getChildren().addAll(border, text);
			setAlignment(Pos.CENTER);

		}

	}

}
