package co.edu.uniquindio.poo.academiamusicajfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewUtils {

    public static void loadView(String rutaFXML, Stage stage, String tituloVentana) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                ViewUtils.class.getResource(rutaFXML)
        );

        if (loader.getLocation() == null) {
            throw new IllegalStateException("No se encontró el archivo FXML: " + rutaFXML);
        }

        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle(tituloVentana);
        stage.setScene(scene);
        stage.show();
    }
}


