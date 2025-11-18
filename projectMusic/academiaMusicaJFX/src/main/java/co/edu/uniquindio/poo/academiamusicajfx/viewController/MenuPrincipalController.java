package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import co.edu.uniquindio.poo.academiamusicajfx.ViewUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuPrincipalController {

    @FXML private Button btnCerrarSesion;
    @FXML private VBox menuContainer;

    @FXML
    public void initialize() {

        // Botones agregados dinámicamente
        Button administradorBtn = new Button("Panel Administrador");
        administradorBtn.setOnAction(e -> abrirAdministrador());

        Button estudianteBtn = new Button("Panel Estudiante");
        estudianteBtn.setOnAction(e -> abrirEstudiante());

        Button profesorBtn = new Button("Panel Profesor");
        profesorBtn.setOnAction(e -> abrirProfesor());

        menuContainer.getChildren().addAll(administradorBtn, estudianteBtn, profesorBtn);
    }

    @FXML
    private void cerrarSesion() {
        try {
            Stage stage = (Stage) btnCerrarSesion.getScene().getWindow();
            ViewUtils.loadView(
                    "/co/edu/uniquindio/poo/academiamusicajfx/view/LoginView.fxml",
                    stage,
                    "Login"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void abrirAdministrador() {
        cambiarVista("AdministradorView.fxml", "Panel Administrador");
    }

    private void abrirEstudiante() {
        cambiarVista("EstudianteView.fxml", "Panel Estudiante");
    }

    private void abrirProfesor() {
        cambiarVista("ProfesorView.fxml", "Panel Profesor");
    }

    private void cambiarVista(String archivo, String titulo) {
        try {
            Stage stage = (Stage) menuContainer.getScene().getWindow();
            ViewUtils.loadView(
                    "/co/edu/uniquindio/poo/academiamusicajfx/view/" + archivo,
                    stage,
                    titulo
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
