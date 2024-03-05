package proyectoEventoDeportivo.impl;

import java.util.ArrayList;

public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    // Getters y setters
    public boolean aniadirJugador(Participante jugador) {
        if (!jugadores.contains(jugador)) {
            jugadores.add(jugador);
            return true;
        }
        return false;
    }

    public boolean eliminarJugador(Participante jugador) {
        return jugadores.remove(jugador);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", jugadores=" + jugadores +
                ", puntos=" + puntos +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Equipo equipo = (Equipo) obj;
        return nombre.equals(equipo.nombre);
    }

    @Override
    public int compareTo(Equipo o) {
        return Integer.compare(this.puntos, o.puntos);
    }

    // Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
