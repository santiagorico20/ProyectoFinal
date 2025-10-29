package co.edu.uniquindio.poo.academiamusicajfx.controller;

import co.edu.uniquindio.poo.academiamusicajfx.model.Academia;
import co.edu.uniquindio.poo.academiamusicajfx.model.Curso;
import co.edu.uniquindio.poo.academiamusicajfx.model.Estudiante;
import co.edu.uniquindio.poo.academiamusicajfx.model.Profesor;

import java.util.ArrayList;
import java.util.List;

public class AcademiaController {
    private Academia academia;

    public AcademiaController(String nombre, String ubicacion, String postalCode) {
        this.academia = new Academia(nombre, ubicacion, postalCode);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        academia.agregarEstudiante(estudiante);
    }

    public void agregarProfesor(Profesor profesor) {
        academia.agregarProfesor(profesor);
    }

    public void agregarCurso(Curso curso) {
        academia.agregarCurso(curso);
    }

    public Academia getAcademia() {
        return academia;
    }

    public List<Curso> getCursos() {
        return new ArrayList<>(academia.getCursos());
    }
}
