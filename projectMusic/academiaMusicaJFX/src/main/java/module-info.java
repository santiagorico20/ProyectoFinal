module co.edu.uniquindio.poo.academiamusicajfx {
    requires javafx.controls;
    requires javafx.fxml;

    // Necesario para que FXMLLoader pueda acceder a los controladores
    opens co.edu.uniquindio.poo.academiamusicajfx.viewController to javafx.fxml;

    // Opcional (si cargas App desde FXML)
    opens co.edu.uniquindio.poo.academiamusicajfx to javafx.fxml;

    // Para permitir lectura del modelo en TableView
    opens co.edu.uniquindio.poo.academiamusicajfx.model to javafx.base;

    exports co.edu.uniquindio.poo.academiamusicajfx;
    exports co.edu.uniquindio.poo.academiamusicajfx.viewController;
}
