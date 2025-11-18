package co.edu.uniquindio.poo.academiamusicajfx.model;

public abstract class Clase {
    protected String identificacion;
    protected Curso curso;
    protected Profesor profesor;
    protected Horario horario;

    public Clase(String identificacion, Curso curso, Profesor profesor, Horario horario) {
        this.identificacion = identificacion;
        this.curso = curso;
        this.profesor = profesor;
        this.horario = horario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public Curso getCurso() {
        return curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Horario getHorario() {
        return horario;
    }
    public abstract void mostrarInformacion();
}
