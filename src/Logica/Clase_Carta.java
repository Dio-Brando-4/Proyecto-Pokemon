package Logica;

public abstract class Clase_Carta {
    private String nombre;

    protected Clase_Carta (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
