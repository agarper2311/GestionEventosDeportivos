package proyectoEventoDeportivo.impl;

public class ParticipanteCarrera extends Participante {
    private double tiempo;

    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo = tiempo;
    }

    // Getters y setters
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return super.toString() + " Tiempo: " + tiempo + "s";
    }
}