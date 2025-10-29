package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.time.LocalDate;

public class Horario {
    private String diaSemana;
    private LocalDate horaInicio;
    private LocalDate horaFin;

    public Horario(String diaSemana, LocalDate horaInicio, LocalDate horaFin) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalDate getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDate getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDate horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "diaSemana='" + diaSemana + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                '}';
    }
}
