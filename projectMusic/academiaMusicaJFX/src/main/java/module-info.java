module co.edu.uniquindio.poo.academiamusicajfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.academiamusicajfx to javafx.fxml;
    exports co.edu.uniquindio.poo.academiamusicajfx;
}