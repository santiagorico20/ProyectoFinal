package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import co.edu.uniquindio.poo.academiamusicajfx.ViewUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContrasena;
    @FXML private Button btnLogin;

    @FXML
    public void initialize() {
        btnLogin.setOnAction(event -> iniciarSesion());
    }

    private void iniciarSesion() {
        try {
            Stage stage = (Stage) btnLogin.getScene().getWindow();

            // 🔥 AQUÍ ES DONDE VA ESA LÍNEA
            ViewUtils.loadView(
                    "/co/edu/uniquindio/poo/academiamusicajfx/view/MenuPrincipal.fxml",
                    stage,
                    "Menú Principal"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



