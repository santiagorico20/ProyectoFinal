package co.edu.uniquindio.poo.academiamusicajfx.viewController;

import co.edu.uniquindio.poo.academiamusicajfx.model.Curso;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CursoViewController {

    @FXML private TableView<Curso> tablaCursos;
    @FXML private TableColumn<Curso, String> colNombre;
    @FXML private TableColumn<Curso, String> colProfesor;
    @FXML private TableColumn<Curso, Integer> colDuracion;

    @FXML
    public void initialize() {

        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colProfesor.setCellValueFactory(new PropertyValueFactory<>("profesor"));
        colDuracion.setCellValueFactory(new PropertyValueFactory<>("duracion"));

        tablaCursos.setItems(FXCollections.observableArrayList(

        ));
    }
}
