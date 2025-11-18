package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ProfesorViewController {

    @FXML
    private Button btnClases;

    @FXML
    private Button btnAsistencia;

    @FXML
    private Button btnNotas;

    @FXML
    private Button btnHorario;

    @FXML
    private void initialize() {
        System.out.println("Panel del Profesor cargado correctamente");
    }

    @FXML
    private void verClases() {
        mostrarMensaje("Clases Asignadas", "Aquí aparecerán las clases asignadas al profesor.");
    }

    @FXML
    private void registrarAsistencia() {
        mostrarMensaje("Registrar Asistencia", "Aquí podrá registrar la asistencia de los estudiantes.");
    }

    @FXML
    private void registrarProgreso() {
        mostrarMensaje("Registrar Progreso", "Aquí podrá registrar el progreso académico del estudiante.");
    }

    @FXML
    private void verHorario() {
        mostrarMensaje("Disponibilidad Horaria", "Aquí podrá configurar o ver su disponibilidad.");
    }

    private void mostrarMensaje(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(titulo);
        alert.setContentText(contenido);
        alert.show();
    }
}
