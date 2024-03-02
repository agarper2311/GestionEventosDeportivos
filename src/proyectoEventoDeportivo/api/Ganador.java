package proyectoEventoDeportivo.api;

import proyectoEventoDeportivo.impl.Participante;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Ganador {
    // Interfaz Ganador
        // Método para obtener al ganador del evento
        Participante obtenerGanador(ArrayList<Participante> participantes);

    abstract class EventoDeportivo implements Ganador {
        private String nombre;
        private LocalDateTime fecha;
        private String lugar;
        private ArrayList<Participante> participantes;

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

        // Método para inscribir participantes
        public boolean inscribirParticipante(Participante participante) {
            return participantes.add(participante);
        }

        // Método abstracto para obtener ganadores
        public abstract ArrayList<Participante> obtenerGanador();
    }
}


