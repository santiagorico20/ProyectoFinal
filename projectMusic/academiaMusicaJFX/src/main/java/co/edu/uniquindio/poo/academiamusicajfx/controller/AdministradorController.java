package co.edu.uniquindio.poo.academiamusicajfx.controller;

import co.edu.uniquindio.poo.academiamusicajfx.model.AdministradorAcademico;
import co.edu.uniquindio.poo.academiamusicajfx.model.ClaseGrupal;
import co.edu.uniquindio.poo.academiamusicajfx.model.Curso;
import co.edu.uniquindio.poo.academiamusicajfx.model.Profesor;

public class AdministradorController {
    private AdministradorAcademico admin;

    public AdministradorController(AdministradorAcademico admin) {
        this.admin = admin;
    }

    public Curso crearCurso(String codigo, String instrumento, int nivel, int capacidad) {
        return admin.crearCurso(codigo, instrumento, nivel, capacidad);
    }

    public void asignarProfesor(Curso curso, Profesor profesor) {
        profesor.getClasesAsignadas().add(new ClaseGrupal(
                "CG-" + curso.getCodigo(),
                curso,
                profesor,
                null,
                curso.getCapacidad()
        ));
    }

    public void generarReportes() {
        admin.generarReportes();
    }

    public AdministradorAcademico getAdmin() {
        return admin;
    }
}
