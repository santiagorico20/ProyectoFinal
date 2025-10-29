package co.edu.uniquindio.poo.academiamusicajfx.controller;

import co.edu.uniquindio.poo.academiamusicajfx.model.Clase;
import co.edu.uniquindio.poo.academiamusicajfx.model.Curso;

import java.util.List;

public class CursoController {
    private Curso curso;

    public CursoController(Curso curso) {
        this.curso = curso;
    }

    public void agregarClase(Clase clase) {
        curso.agregarClase(clase);
    }

    public List<Clase> getClases() {
        return curso.getClases();
    }

    public String getInstrumento() {
        return curso.getInstrumento();
    }

    public int getNivel() {
        return curso.getNivel();
    }

    public Curso getCurso() {
        return curso;
    }
}
