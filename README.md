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

## - Clase PartocoànteCarrera:

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

## Resumen del funcionamiento general del proyecto:

1.Clase Participante: Esta clase representa a un participante en un evento deportivo y almacena su información personal como DNI, nombre, apellidos y edad. También incluye métodos para inicializar los atributos, obtener y establecer los valores de los atributos, convertir la información del participante en una cadena de texto y verificar si dos participantes son iguales basándose en su DNI.

2.Clase ParticipanteCarrera: Esta clase hereda de la clase Participante y agrega un atributo adicional llamado tiempo, que representa el tiempo que el participante tomó en completar una carrera. Los métodos incluyen inicializar los atributos, obtener y establecer los valores del tiempo y convertir la información del participante en una cadena de texto.

3.Interfaz Ganador: Declara un método obtenerGanador() que debe ser implementado por las clases que la utilicen. Este método devuelve al ganador del evento.

4.Clase abstracta EventoDeportivo: Implementa la interfaz Ganador e incluye atributos comunes a todos los eventos deportivos como nombre, fecha, lugar y una lista de participantes. También contiene métodos para inicializar los atributos, agregar participantes al evento y un método abstracto para obtener al ganador del evento.

5.Clases Carrera y TorneoDeFutbol: Estas clases heredan de EventoDeportivo y proporcionan implementaciones específicas para los eventos de carrera y torneo de fútbol. Cada una tiene sus propios atributos y métodos para manejar las características específicas de esos eventos, así como para determinar al ganador.

6.Clase Equipo: Representa a un equipo en un torneo de fútbol, con atributos como nombre, lista de jugadores y puntos acumulados. Incluye métodos para agregar y eliminar jugadores, así como para convertir la información del equipo en una cadena de texto.

7.Clase Main: La clase principal del proyecto que realiza las operaciones principales, como instanciar eventos deportivos, agregar participantes y equipos, mostrar información de eventos, participantes, equipos y jugadores, determinar y mostrar los ganadores de los eventos y mostrar la lista de equipos clasificados por puntos.