package proyectoEventoDeportivo.impl;


import proyectoEventoDeportivo.api.Ganador;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.time.LocalDateTime;
import java.util.ArrayList;

abstract class EventoDeportivo implements Ganador {
    protected String nombre;
    protected LocalDateTime fecha;
    protected String lugar;
    protected ArrayList<Participante> participantes;

    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    // Getters y setters
    public boolean inscribirParticipante(Participante participante) {
        if (!participantes.contains(participante)) {
            participantes.add(participante);
            return true;
        }
        return false;
    }


    // Método abstracto obtenerGanador() ya declarado en la interfaz Ganador

    @Override
    public ArrayList<Participante> obtenerGanador() {
        return null;
    }
}
