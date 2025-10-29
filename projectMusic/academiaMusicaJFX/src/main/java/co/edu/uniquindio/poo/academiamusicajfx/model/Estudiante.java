package co.edu.uniquindio.poo.academiamusicajfx.model;


import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona implements IReporte{
    private String matricula;
    private int nivelActual;
    private List<Curso> cursosInscritos;
    private List<ReporteProgreso> reportesProgreso;
    private List<ReporteAsistencia> reportesAsistencia;

    public Estudiante(String nombre, String identificacion, String email, String telefono, String matricula, int nivelActual) {
        super(nombre, identificacion, email, telefono);
        this.matricula = matricula;
        this.nivelActual = nivelActual;
        this.cursosInscritos = new ArrayList<>();
        this.reportesProgreso = new ArrayList<>();
        this.reportesAsistencia = new ArrayList<>();
    }

    public boolean inscribirseCurso(Curso curso) {
        if (!cursosInscritos.contains(curso)) {
            cursosInscritos.add(curso);
            return true;
        }
        return false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public List<ReporteProgreso> getReportesProgreso() {
        return reportesProgreso;
    }

    public void setReportesProgreso(List<ReporteProgreso> reportesProgreso) {
        this.reportesProgreso = reportesProgreso;
    }

    public List<ReporteAsistencia> getReportesAsistencia() {
        return reportesAsistencia;
    }

    public void setReportesAsistencia(List<ReporteAsistencia> reportesAsistencia) {
        this.reportesAsistencia = reportesAsistencia;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula='" + matricula + '\'' +
                ", nivelActual=" + nivelActual +
                ", cursosInscritos=" + cursosInscritos +
                ", reportesProgreso=" + reportesProgreso +
                ", reportesAsistencia=" + reportesAsistencia +
                '}';
    }

    @Override
    public void generarReporte() {

    }
}
