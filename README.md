# Martes-Noche-P2-EquipoUndefined

## Integrantes equipo undefined

| Nombre                 | Legajo  |
| :--------------------- | :------ |
| Acevedo Agustin        | 1219466 |
| de la Fuente Sebastián | 1220681 |
| Garcia Leonel          | 1223947 |
| Herrera Manuel Alvaro  | 1164449 |
| Ruiz Diaz Luka         | 1197562 |
| You Hernan             | 1222528 |

## Actividad pilas - colas 17-03-2026

### actividad 1:

[Ir a la actividad](actividadPilasColas17032026/actividad1.md) | [Ver](actividadPilasColas17032026/activadadPilaColas17032026.svg)

### actividad 2:

#### Estrategia 1:

Es buena por su rapidez al momento de obtener el elemento tope, pero agrega un costo al momento de tener la variable de control actualizada apuntando al elemento libre.

#### Estrategia 2:

Es buena tambien por su rapidez para acceder al tope, pero el orden de crecimiento espacial para procesar el ingreso de nuevos datos es mucho mayor a la anterior, ya que hay que ir actualizando todos los datos ingresados previamente.

_SI tuvieramos otro tipo de estructura de datos que almacena los valores por referencia (ej: **nodos**) prodia ser una solucion mas interesante._

#### Estrategia 3:

Al reservar la primera posicion del array para almacenar la cantidad de elementos, hace que se reduzca mucho el costo poder calcular el tope del array.
Tiene la desventaja de tener que mantener actualizada la primera posicion del array con el tamaño del mismo pero escala bien a mayor cantidad de datos ya que el costo es el mismo para cualquier tamaño.

_La desventaja es que estas utilizando un espacio del array para almacenar metadata del mismo y no unicamente datos._

---

## Actividad Colas 31-03-2026

En el directorio [clase3](clase3/) se puede encontrar el proyecto de java creado para resolver las actividades "Bloque 1: Pilas (LIFO - Last In, First Out)" de la guia de trabajos practivos
Se modifico la Interfaz PilaTDA.java para poder aceptar tipos de datos genericos, de modo que puedan almacenarse cualquier tipo de dato dentro de las pilas que utilicemos.

### Historial de Navegación

Para este caso no podemos utilizar la estrategia 3 ya que el tipo de dato a almacenar en la pila es de tipo String, y no podemos usar el primer elemento del array como indice si el array contiene elementos de tipo String.
Utilizamos la estrategia 1.

### Editor de Código (Undo/Deshacer)

Idem caso anterior.

### Balanceo de Paréntesis

Idem caso anterior.

### Reversión de Strings

Idem caso anterior.

### Pila de Llamadas (Call Stack)

Idem caso anterior.

### Navegación de Directorios

Idem caso anterior.

---

## Actividad Colas 07-04-2026

En el directorio [ActividadesColas](ActividadesColas/) se puede encontrar el proyecto de java creado para resolver las actividades "Bloque 2: Colas y Colas con Prioridad (FIFO + Ranking)" de la guia de trabajos practivos

### Fila del Cajero

Se trata de una cola estatica sin prioridad ya que a medida que los clientes van llegando van usando el cajero en orden de llegada. No hay un criterio donde uno que llega tenga prioridad sobre otros.

### Impresora del Laboratorio

Al tratarse de fifo sin prioridad el orden de salida va a ser quien primero entre primero sale:

```java
impresoraLaboratorio.acolar("c:/Documents/materias.pdf");
impresoraLaboratorio.acolar("c:/Documents/cronograma.pdf");
impresoraLaboratorio.acolar("c:/Documents/foto.jpg");
impresoraLaboratorio.acolar("c:/Documents/archivo.txt");
impresoraLaboratorio.acolar("c:/Documents/expensasMarzo2025.pdf");
impresoraLaboratorio.desacolar(); // primero: c:/Documents/materias.pdf
impresoraLaboratorio.desacolar(); // segundo: c:/Documents/cronograma.pdf
impresoraLaboratorio.desacolar(); // tercero: c:/Documents/foto.jpg
impresoraLaboratorio.desacolar(); // cuarto: c:/Documents/archivo.txt
impresoraLaboratorio.desacolar(); // quinto: c:/Documents/expensasMarzo2025.pdf
```

### Guardia del Hospital de Clínicas (Triage)

```java
guardiaHospital.acolarPrioridad(5987349, 100); // jubilado con bobazo
guardiaHospital.acolarPrioridad(5984350, 1); // esposa del jubilado con bobazo
guardiaHospital.acolarPrioridad(39209540, 1); // hombre con dolor de panza
guardiaHospital.acolarPrioridad(47871349, 15); // mujer con fiebre
```

En este caso la mujer con fiebre va a ser la segunda en salir de la cola ya que tiene prioridad sobre la esposa y el hombre con dolor de panza, pero no sobre el jubilado con bobazo.

La esposa va a salir antes que el hombre con dolor de panza ya que aunque tengan la misma prioridad entro primero, y en este criterio de cola a misma prioridad va por orden de llegada.

### Examen Final (Promocionados vs Regulares)

si un regular llega a las 8.00h pm pero un promocionado llega a las 8.30h pm el promocionado va a salir antes que el regular.

### Buffet de la Facultad

Utilizamos una cola sin prioridad para que nadie se adelante a la fila bajo ningun concepto.

### Procesador de Tareas (OS Scheduler)

Si el sistema se sobrecarga al utilizar una cola con prioridad los primeros procesos en procesarse
Son los de prioridad 50 (procesos del sistema) y despues de que se hayan procesado los procesos del sistema se procesarán los procesos de aplicaciones como spotify con prioridad 10

### Embarque de Aerolíneas

### Distribución de Tickets IT
