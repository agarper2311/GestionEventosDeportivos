package com.es.programacion.Tema6.proyectoGestionEventoDeportivo.api;

import com.es.programacion.Tema6.proyectoGestionEventoDeportivo.impl.Participante;

import java.util.ArrayList;

public interface Ganador {
    // Interfaz Ganador
        // Método para obtener al ganador del evento
        Participante obtenerGanador(ArrayList<Participante> participantes);
}


