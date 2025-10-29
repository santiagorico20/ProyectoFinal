package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.time.LocalDate;

public class ReporteProgreso {
    private double nota;
    private String comentarios;
    private LocalDate fechaEvaluacion;

    public ReporteProgreso(double nota, String comentarios, LocalDate fechaEvaluacion) {
        this.nota = nota;
        this.comentarios = comentarios;
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public LocalDate getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(LocalDate fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    @Override
    public String toString() {
        return "ReporteProgreso{" +
                "nota=" + nota +
                ", comentarios='" + comentarios + '\'' +
                ", fechaEvaluacion=" + fechaEvaluacion +
                '}';
    }
}
