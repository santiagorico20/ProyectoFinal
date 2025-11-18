package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import co.edu.uniquindio.poo.academiamusicajfx.ViewUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdministradorViewController {

    @FXML private Button btnCrearCurso;
    @FXML private Button btnAsignar;
    @FXML private Button btnAulas;
    @FXML private Button btnGrupales;
    @FXML private Button btnReportes;

    @FXML
    public void initialize() {
        btnCrearCurso.setOnAction(e -> abrirCursos());
        btnGrupales.setOnAction(e -> abrirClases());
        btnReportes.setOnAction(e -> abrirReportes());
    }

    private void abrirCursos() {
        cambiarVista("CursoView.fxml", "Listado de Cursos");
    }

    private void abrirClases() {
        cambiarVista("ClaseView.fxml", "Clases Grupales");
    }

    private void abrirReportes() {
        cambiarVista("ReporteView.fxml", "Reportes");
    }

    private void cambiarVista(String archivo, String titulo) {
        try {
            Stage stage = (Stage) btnCrearCurso.getScene().getWindow();

            // RUTA CORRECTA
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

