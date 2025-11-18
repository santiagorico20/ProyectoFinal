package co.edu.uniquindio.poo.academiamusicajfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Cargar la vista inicial (Login)
        Parent root = FXMLLoader.load(getClass().getResource(
                "/co/edu/uniquindio/poo/academiamusicajfx/view/LoginView.fxml"
        ));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Academia de Música");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}