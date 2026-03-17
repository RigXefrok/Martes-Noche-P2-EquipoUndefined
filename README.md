# Martes-Noche-P2-EquipoUndefined

## Integrantes equipo undefined

| Nombre                 | Legajo  |
| :--------------------- | :------ |
| Acevedo Agustin        |         |
| de la Fuente Sebastián | 1220681 |
| Garcia Leonel          |         |
| Herrera manuel alvaro  |         |
| Ruiz Diaz Luka         |         |
| Yoe Hernan             |         |

## Actividad pilas - colas 17-03-2026

### actividad 1:

[Ir a la actividad](actividadPilasColas17032026/actividad1.md) | [Ver](actividadPilasColas17032026/activadadPilaColas17032026.svg)

### actividad 2:

#### Estrategia 1:

Es buena por su rapidez al momento de obtener el elemento tope, pero agrega un costo al momento de tener la variable de control actualizada apuntando al elemento libre.

---

#### Estrategia 2:

Es buena tambien por su rapidez para acceder al tope, pero el orden de crecimiento espacial para procesar el ingreso de nuevos datos es mucho mayor a la anterior, ya que hay que ir actualizando todos los datos ingresados previamente.

_SI tuvieramos otro tipo de estructura de datos que almacena los valores por referencia (ej: **nodos**) prodia ser una solucion mas interesante._

---

#### Estrategia 3:

Al reservar la primera posicion del array para almacenar la cantidad de elementos, hace que se reduzca mucho el costo poder calcular el tope del array.
Tiene la desventaja de tener que mantener actualizada la primera posicion del array con el tamaño del mismo pero escala bien a mayor cantidad de datos ya que el costo es el mismo para cualquier tamaño.

_La desventaja es que estas utilizando un espacio del array para almacenar metadata del mismo y no unicamente datos._
