package AutoMobile;
	
import Auto.Model.Archivio;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader aLoader = new FXMLLoader(getClass().getResource("AutoView.fxml"));
			BorderPane root = aLoader.load();
			AutoController controller=aLoader.getController();
			Archivio arch = new Archivio();
			controller.setModel(arch);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
