package co.edu.uniquindio.poo.academiamusicajfx.model;

public class AdministradorAcademico extends Persona {

    public AdministradorAcademico(String nombre, String identificacion, String email, String telefono) {
        super(nombre, identificacion, email, telefono);
    }

    public Curso crearCurso(String codigo, String instrumento, int nivel, int capacidad) {
        return new Curso(codigo, instrumento, nivel, capacidad);
    }

    public void generarReportes() {
        System.out.println("Generando reportes académicos...");
    }

    @Override
    public String toString() {
        return "AdministradorAcademico{}";
    }
}
