package proyectoEventoDeportivo.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Carrera extends EventoDeportivo {
    private double distancia;

    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        if (participantes.isEmpty()) return new ArrayList<>();

        ParticipanteCarrera ganador = (ParticipanteCarrera) participantes.get(0);
        for (Participante p : participantes) {
            ParticipanteCarrera pc = (ParticipanteCarrera) p;
            if (pc.getTiempo() < ganador.getTiempo()) {
                ganador = pc;
            }
        }

        ArrayList<Participante> resultado = new ArrayList<>();
        resultado.add(ganador);
        return resultado;
    }
}