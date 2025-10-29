package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.util.ArrayList;
import java.util.List;

public class ClaseGrupal extends Clase{
    private int capacidad;
    private List<Estudiante> estudiantes;

    public ClaseGrupal(String identificacion, Curso curso, Profesor profesor, Horario horario, int capacidad) {
        super(identificacion, curso, profesor, horario);
        this.capacidad = capacidad;
        this.estudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(Estudiante e) {
        if (estudiantes.size() < capacidad) {
            estudiantes.add(e);
            return true;
        }
        return false;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "ClaseGrupal{" +
                "capacidad=" + capacidad +
                ", estudiantes=" + estudiantes +
                '}';
    }

}
