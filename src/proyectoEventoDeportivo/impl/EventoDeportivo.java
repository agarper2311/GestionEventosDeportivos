package proyectoEventoDeportivo.impl;


import proyectoEventoDeportivo.api.Ganador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventoDeportivo implements Ganador {

    // Atributos
    private String nombre;
    private LocalDateTime fecha;
    private String lugar;
    protected ArrayList<Participante> participantes; // Usamos protected para que las subclases puedan acceder a esta lista

    // Constructor
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // Método abstracto para obtener al ganador
    public ArrayList<Participante> obtenerGanador() {
        return null;
    }

    // Método para inscribir un participante
    public boolean inscribirParticipante(Participante participante) {
        // Añadimos al participante a la lista de participantes
        // Devolvemos true si se ha podido añadir correctamente, false en caso contrario
        return participantes.add(participante);
    }

    @Override
    public Participante obtenerGanador(ArrayList<Participante> participantes) {
        return null;
    }

    public static class Carrera extends proyectoEventoDeportivo.impl.EventoDeportivo {
        // Constructor
        public Carrera(String nombre, LocalDateTime fecha, String lugar) {
            super(nombre, fecha, lugar); // Llamamos al constructor de la clase padre
        }

        // Implementación del método abstracto obtenerGanador() para Carrera
        @Override
        public ArrayList<Participante> obtenerGanador() {
            // Implementación específica para obtener al ganador de una carrera
            // Código para determinar al ganador aquí
            return null; // Devolvemos null por ahora
        }
    }

    // Definimos la clase TorneoDeFutbol que extiende de EventoDeportivo
    static class TorneoDeFutbol extends proyectoEventoDeportivo.impl.EventoDeportivo {
        // Constructor
        public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
            super(nombre, fecha, lugar); // Llamamos al constructor de la clase padre
        }

        // Implementación del método abstracto obtenerGanador() para TorneoDeFutbol
        @Override
        public ArrayList<Participante> obtenerGanador() {
            // Implementación específica para obtener al ganador de un torneo de fútbol
            // Código para determinar al ganador aquí
            return null; // Devolvemos null por ahora
        }
    }
}
