package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class ReporteViewController {

    @FXML
    public void generarReporteCursos() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Reporte generado");
        alert.setContentText("Reporte de cursos generado correctamente.");
        alert.showAndWait();
    }

    @FXML
    public void generarReporteEstudiantes() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Reporte generado");
        alert.setContentText("Reporte de estudiantes generado correctamente.");
        alert.showAndWait();
    }
}