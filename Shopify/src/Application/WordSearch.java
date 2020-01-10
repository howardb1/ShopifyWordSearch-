package Application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class WordSearch extends Application {

	Stage window;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		window = stage;
		window.setTitle("the Wordy WordSearch");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));

		grid.setVgap(8);
		grid.setHgap(10);

		window.show();

	}

}
