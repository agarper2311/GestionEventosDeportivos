## Gestión de eventos deportivos

## Nombre:: Ángel García
## Nombre:: David Sánchez
## Prueba 1

### **Descripción del proyecto**

Descripción del proyecto dada por Ángel y David
prueba 02/03/2024

## Composición de las clases:

Dentro de src comenzamos creando una carpeta proyectoEventoDeportivo, en la que dentro diferenciamos dos
carpetas, la carpeta api , y la carpeta impl, en ellas se encuentran las clases siguientes:

## Carpeta api:

Dentro de ellas se encuentra la clase "Ganador" que es una interface que declara los siguientes metodos:

+ obtenerGanador(): ArrayList<Participante>

  Método que devuelve un objeto de tipo “Participante” que representa al
  ganador del evento.

## Carpeta impl:

En ella meteremos las siguientes clases EventoDeportivo, Participante, ParticipanteCarrera.

## - Clase Participante:

Atributos:
− dni: String
− nombre: String
− apellidos: String
− edad: int
Métodos:
+ Constructor que reciba todos los atributos e inicialice los valores
+ Getters y setters para cada atributo
+ toString(): String
  Que devuelva una cadena con la información del participante.
+ equals(): boolean
  Que devuelve true si dos participantes son iguales o false en caso de
  que no lo sean. Dos participantes son iguales cuando tienen el mismo
  dni.

## - Clase ParticipanteCarrera:

− tiempo: double (Investigar otros posibles formatos)
Métodos:
+ Constructor que reciba todos los atributos e inicialice los valores
+ Getters y setters para cada atributo
  PROGRAMACIÓN
  2
+ toString(): String
  Que devuelva una cadena con la información del participante de la
  carrera.

## - Clase EventoDeportivo:

Atributos:
- nombre: String
- fecha: LocalDateTime
- lugar: String
- participantes: ArrayList<Participante>
  Métodos:
+ Constructor que reciba los atributos e inicialice los valores
+ Getters y setters para cada atributo
+ inscribirParticipante(Participante participante): boolean
  Que reciba un objeto de tipo “Participante” (cabe señalar que recibirá
  objetos de tipo Participante o de tipo ParticipanteCarrera) y lo añada a la
  lista de participantes. Devuelve true si ha podido insertar
  correctamente al participante.
+ <<abstract>> obtenerGanador(): ArrayList<Participante>
  Que devuelva una lista con los ganadores del evento deportivo. Este
  método debe ser implementado en las subclases.

## Clases del Sistema de Gestión de Eventos Deportivos:

1. Participante: Representa a cualquier persona que participa en un evento deportivo. Contiene información básica como DNI, nombre, apellidos y edad.

2. ParticipanteCarrera: Hereda de Participante y añade un atributo específico para carreras, el tiempo registrado en la competencia.

3. Ganador (Interfaz): Declara el método obtenerGanador(), que debe ser implementado por las clases que representen eventos deportivos para determinar el ganador del evento.

4. EventoDeportivo (Clase Abstracta): Representa un evento deportivo general y define la estructura básica que deben tener todos los eventos deportivos, incluyendo nombre, fecha, lugar y una lista de participantes. Implementa la interfaz Ganador y declara el método abstracto obtenerGanador().

5. Carrera: Específica para eventos de carreras. Hereda de EventoDeportivo e implementa el método obtenerGanador() para determinar el ganador de la carrera basándose en el menor tiempo registrado.

6. TorneoDeFutbol: Específico para torneos de fútbol. Hereda de EventoDeportivo y añade una lista de equipos. Implementa el método obtenerGanador() para determinar el equipo ganador basándose en la mayor cantidad de puntos acumulados. También incluye un método para inscribir equipos en el torneo.

7. Equipo: Representa un equipo deportivo. Implementa la interfaz Comparable para permitir comparar equipos basándose en sus puntos acumulados. Contiene información sobre el nombre del equipo, una lista de jugadores y los puntos que ha acumulado.

8. Main: Clase principal que demuestra cómo instanciar y manipular las clases anteriores para crear un sistema funcional de gestión de eventos deportivos. Incluye ejemplos de cómo añadir participantes y equipos a eventos, determinar y mostrar ganadores, y ordenar equipos por puntuación.