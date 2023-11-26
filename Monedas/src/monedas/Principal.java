
package monedas;

/**
 *
 * @author migue
 */
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
        
public class Principal extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Principal.class.getResource("InterfazFXML.fxml"));
            primaryStage.setTitle("DIVISAS");
            Pane ventana = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(ventana);
            primaryStage.getIcons().add(new Image("monedas/icono.png"));
            scene.getStylesheets().add(getClass().getResource("interfazfxml.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}