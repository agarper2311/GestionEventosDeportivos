import proyectoEventoDeportivo.impl.*;

import java.time.LocalDateTime;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Crear participantes
        ParticipanteCarrera corredor1 = new ParticipanteCarrera("12387654A", "Juan", "Pérez", 25, 360.0);
        ParticipanteCarrera corredor2 = new ParticipanteCarrera("12345678X", "Ana", "López", 23, 340.0); // Este será el ganador por menor tiempo

        // Crear equipos de fútbol y sus jugadores
        Equipo equipo1 = new Equipo("Equipo A");
        equipo1.aniadirJugador(new Participante("14564324D", "Carlos", "Martínez", 30));
        equipo1.aniadirJugador(new Participante("27856439S", "Luisa", "Fernández", 27));
        equipo1.setPuntos(10); // Puntos de ejemplo

        Equipo equipo2 = new Equipo("Equipo B");
        equipo2.aniadirJugador(new Participante("90675437R", "Marco", "García", 22));
        equipo2.aniadirJugador(new Participante("89564739F", "Sofía", "Ramírez", 24));
        equipo2.setPuntos(12); // Este equipo tiene más puntos

        // Instanciar eventos deportivos
        Carrera carrera1 = new Carrera("Carrera Montaña", LocalDateTime.now(), "Sierra Alta", 5.0);
        TorneoDeFutbol torneo1 = new TorneoDeFutbol("Torneo Interescolar", LocalDateTime.now(), "Estadio Central");

        // Añadir participantes a la carrera
        carrera1.inscribirParticipante(corredor1);
        carrera1.inscribirParticipante(corredor2);

        // Inscribir equipos en el torneo
        torneo1.inscribirEquipo(equipo1);
        torneo1.inscribirEquipo(equipo2);

        // Mostrar información de los eventos, participantes y equipos
        System.out.println("Información de la carrera:");
        System.out.println(carrera1.toString());

        System.out.println("Información del torneo:");
        System.out.println(torneo1.toString());

        // Determinar y mostrar el ganador de cada evento
        System.out.println("Ganador de la carrera: " + carrera1.obtenerGanador().get(0));
        System.out.println("Ganador del torneo: " + torneo1.obtenerGanador().get(0)); // Suponiendo que queremos mostrar solo un ganador

        // Mostrar la lista de equipos de mayor a menor puntuación
        Collections.sort(torneo1.equipos, Collections.reverseOrder());
        System.out.println("Equipos ordenados por puntuación:");
        for (Equipo equipo : torneo1.equipos) {
            System.out.println(equipo.getNombre() + " - Puntos: " + equipo.getPuntos());
        }
    }
}
