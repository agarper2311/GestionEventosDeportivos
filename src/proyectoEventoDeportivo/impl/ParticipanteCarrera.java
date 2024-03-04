package proyectoEventoDeportivo.impl;

public class ParticipanteCarrera extends Participante {

    //Atributos
    private double tiempo;

    // Constructor
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo = tiempo;
    }

    // Getter y setter para el tiempo
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // Método toString
    @Override
    public String toString() {
        return "ParticipanteCarrera{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", tiempo=" + tiempo +
                '}';
    }
}
