package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona implements IGestionHorario {
    private String instrumentoPrincipal;
    private List<Horario> horariosDisponibles;
    private List<Clase> clasesAsignadas;

    public Profesor(String nombre, String identificacion, String email, String telefono, String instrumentoPrincipal) {
        super(nombre, identificacion, email, telefono);
        this.instrumentoPrincipal = instrumentoPrincipal;
        this.horariosDisponibles = new ArrayList<>();
        this.clasesAsignadas = new ArrayList<>();
    }

    public String getInstrumentoPrincipal() {
        return instrumentoPrincipal;
    }

    public void setInstrumentoPrincipal(String instrumentoPrincipal) {
        this.instrumentoPrincipal = instrumentoPrincipal;
    }

    public List<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(List<Horario> horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }

    public List<Clase> getClasesAsignadas() {
        return clasesAsignadas;
    }

    public void setClasesAsignadas(List<Clase> clasesAsignadas) {
        this.clasesAsignadas = clasesAsignadas;
    }

    @Override
    public void agregarHorario(Horario horario) {
        horariosDisponibles.add(horario);
    }

    @Override
    public void eliminarHorario(Horario horario) {
        horariosDisponibles.remove(horario);
    }

    @Override
    public List<Horario> consultarHorarios() {
        return horariosDisponibles;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "instrumentoPrincipal='" + instrumentoPrincipal + '\'' +
                ", horariosDisponibles=" + horariosDisponibles +
                ", clasesAsignadas=" + clasesAsignadas +
                '}';
    }
}
