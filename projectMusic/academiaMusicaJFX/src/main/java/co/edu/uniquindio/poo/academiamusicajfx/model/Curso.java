package co.edu.uniquindio.poo.academiamusicajfx.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String instrumento;
    private int nivel;
    private int capacidad;
    private List<Clase> clases;

    public Curso(String codigo, String instrumento, int nivel, int capacidad) {
        this.codigo = codigo;
        this.instrumento = instrumento;
        this.nivel = nivel;
        this.capacidad = capacidad;
        this.clases = new ArrayList<>();
    }

    public void agregarClase(Clase clase) {
        clases.add(clase);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", instrumento='" + instrumento + '\'' +
                ", nivel=" + nivel +
                ", capacidad=" + capacidad +
                ", clases=" + clases +
                '}';
    }
}
