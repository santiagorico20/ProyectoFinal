package co.edu.uniquindio.poo.academiamusicajfx.model;

public class ReporteAsistencia {
    private int fallas;
    private double porcentajeAsistencias;

    public ReporteAsistencia(int fallas, double porcentajeAsistencias) {
        this.fallas = fallas;
        this.porcentajeAsistencias = porcentajeAsistencias;
    }

    public int getFallas() {
        return fallas;
    }

    public void setFallas(int fallas) {
        this.fallas = fallas;
    }

    public double getPorcentajeAsistencias() {
        return porcentajeAsistencias;
    }

    public void setPorcentajeAsistencias(double porcentajeAsistencias) {
        this.porcentajeAsistencias = porcentajeAsistencias;
    }

    @Override
    public String toString() {
        return "ReporteAsistencia{" +
                "fallas=" + fallas +
                ", porcentajeAsistencias=" + porcentajeAsistencias +
                '}';
    }
}
