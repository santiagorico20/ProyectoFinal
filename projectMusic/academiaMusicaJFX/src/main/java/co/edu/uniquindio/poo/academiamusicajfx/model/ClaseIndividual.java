package co.edu.uniquindio.poo.academiamusicajfx.model;

public class ClaseIndividual extends Clase {
    private String tema;
    private int duracion;

    public ClaseIndividual(String identificacion, Curso curso, Profesor profesor, Horario horario, String tema, int duracion) {
        super(identificacion, curso, profesor, horario);
        this.tema = tema;
        this.duracion = duracion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "ClaseIndividual{" +
                "tema='" + tema + '\'' +
                ", duracion=" + duracion +
                '}';
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Clase Individual:");
        System.out.println("Tema: " + getTema());
        System.out.println("Duración: " + getDuracion());
        System.out.println("Identificación: " + getIdentificacion());
    }
}
