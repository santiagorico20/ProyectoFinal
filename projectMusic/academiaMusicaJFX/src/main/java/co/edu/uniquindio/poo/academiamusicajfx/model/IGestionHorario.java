package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.util.List;

public interface IGestionHorario {
    void agregarHorario(Horario horario);
    void eliminarHorario(Horario horario);
    List<Horario> consultarHorarios();
}
