package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nombre;
    private String ubicacion;
    private String postalCode;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Academia(String nombre, String ubicacion, String postalCode) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.postalCode = postalCode;
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarEstudiante(Estudiante e) { estudiantes.add(e); }
    public void agregarProfesor(Profesor p) { profesores.add(p); }
    public void agregarCurso(Curso c) { cursos.add(c); }

}
