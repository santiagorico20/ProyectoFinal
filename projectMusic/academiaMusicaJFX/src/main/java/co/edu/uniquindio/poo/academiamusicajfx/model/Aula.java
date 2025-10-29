package co.edu.uniquindio.poo.academiamusicajfx.model;

public class Aula {
    private String codigo;
    private int capacidad;
    private boolean disponible;

    public Aula(String codigo, int capacidad, boolean disponible) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "codigo='" + codigo + '\'' +
                ", capacidad=" + capacidad +
                ", disponible=" + disponible +
                '}';
    }
}
