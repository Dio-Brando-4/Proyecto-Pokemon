package Logica;

public class Clase_Carta {
    private String nombre;

    public void Carta (String nombre) {
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
