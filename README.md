# Martes-Noche-P2-EquipoUndefined

## Integrantes equipo undefined

| Nombre                 | Legajo  |
| :--------------------- | :------ |
| Acevedo Agustin        | 1219466 |
| de la Fuente Sebastián | 1220681 |
| Garcia Leonel          | 1223947 |
| Herrera Manuel Alvaro  | 1164449 |
| Ruiz Diaz Luka         |         |
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

### Impresora del Laboratorio

### Guardia del Hospital de Clínicas (Triage)

### Examen Final (Promocionados vs Regulares)

### Buffet de la Facultad

### Procesador de Tareas (OS Scheduler)

### Embarque de Aerolíneas

### Distribución de Tickets IT


