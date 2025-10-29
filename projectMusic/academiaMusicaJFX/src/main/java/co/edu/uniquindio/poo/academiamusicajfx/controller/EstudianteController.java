package co.edu.uniquindio.poo.academiamusicajfx.controller;

import co.edu.uniquindio.poo.academiamusicajfx.model.Curso;
import co.edu.uniquindio.poo.academiamusicajfx.model.Estudiante;

import java.util.List;

public class EstudianteController {
    private Estudiante estudiante;

    public EstudianteController(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public boolean inscribirCurso(Curso curso) {
        return estudiante.inscribirseCurso(curso);
    }

    public void generarReporteProgreso() {
        estudiante.generarReporte();
    }

    public List<Curso> getCursosInscritos() {
        return estudiante.getCursosInscritos();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
}
