package co.edu.uniquindio.poo.academiamusicajfx.controller;

import co.edu.uniquindio.poo.academiamusicajfx.model.Clase;
import co.edu.uniquindio.poo.academiamusicajfx.model.ClaseGrupal;
import co.edu.uniquindio.poo.academiamusicajfx.model.Estudiante;
import co.edu.uniquindio.poo.academiamusicajfx.model.ReporteAsistencia;

public class ClaseController {
    public boolean agregarEstudianteAClaseGrupal(ClaseGrupal clase, Estudiante estudiante) {
        return clase.agregarEstudiante(estudiante);
    }

    public void mostrarInformacion(Clase clase) {
        clase.mostrarInformacion();
    }

    public boolean verificarCupo(ClaseGrupal clase) {
        return clase.getEstudiantes().size() < clase.getCapacidad();
    }

    public void registrarAsistencia(ReporteAsistencia reporte, int fallas, double porcentaje) {
        reporte = new ReporteAsistencia(fallas, porcentaje);
    }
}
