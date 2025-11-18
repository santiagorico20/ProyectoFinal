package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class EstudianteViewController {

    @FXML
    private Button btnCursos;

    @FXML
    private Button btnProgreso;

    @FXML
    private Button btnAsistencia;

    @FXML
    private Button btnSolicitarClase;

    @FXML
    private Button btnInscribir;

    @FXML
    private void initialize() {
        System.out.println("Panel Estudiante cargado correctamente");
    }

    @FXML
    private void verCursos() {
        mostrarMensaje("Cursos Inscritos", "Aquí se mostrarán los cursos del estudiante.");
    }

    @FXML
    private void verProgreso() {
        mostrarMensaje("Progreso", "Aquí podrá ver su progreso académico.");
    }

    @FXML
    private void verAsistencia() {
        mostrarMensaje("Asistencia", "Aquí se registrará la asistencia del estudiante.");
    }

    @FXML
    private void solicitarClase() {
        mostrarMensaje("Clase Individual", "Aquí podrá solicitar una clase individual.");
    }

    @FXML
    private void inscribirse() {
        mostrarMensaje("Inscripción", "Aquí podrá inscribirse a nuevos cursos.");
    }

    private void mostrarMensaje(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(titulo);
        alert.setContentText(contenido);
        alert.show();
    }
}
