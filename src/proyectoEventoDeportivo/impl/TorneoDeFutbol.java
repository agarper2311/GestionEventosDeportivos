package proyectoEventoDeportivo.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {
    public ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public boolean inscribirEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        if (equipos.isEmpty()) return new ArrayList<>();

        Equipo ganador = equipos.get(0);
        for (Equipo e : equipos) {
            if (e.getPuntos() > ganador.getPuntos()) {
                ganador = e;
            }
        }

        return new ArrayList<>(ganador.getJugadores());
    }
}

