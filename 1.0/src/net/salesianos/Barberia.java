package net.salesianos;

public class Barberia {
    private String nombre;
    private String ubicacion;
    private String barberos;
    private int puntuacion; 

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getBarberos() {
        return barberos;
    }
    public void setBarberos(String barberos) {
        this.barberos = barberos;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    @Override
    public String toString() {
        return "Barberia [nombre=" + nombre + ", ubicacion=" + ubicacion + ", barberos=" + barberos + ", puntuacion="
                + puntuacion + "]";
    }
}

