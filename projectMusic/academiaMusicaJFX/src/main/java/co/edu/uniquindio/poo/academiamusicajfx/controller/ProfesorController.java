package co.edu.uniquindio.poo.academiamusicajfx.controller;

import co.edu.uniquindio.poo.academiamusicajfx.model.Horario;
import co.edu.uniquindio.poo.academiamusicajfx.model.Profesor;

import java.util.List;

public class ProfesorController {
    private Profesor profesor;

    public ProfesorController(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarHorario(Horario horario) {
        profesor.agregarHorario(horario);
    }

    public void eliminarHorario(Horario horario) {
        profesor.eliminarHorario(horario);
    }

    public List<Horario> consultarHorarios() {
        return profesor.consultarHorarios();
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
