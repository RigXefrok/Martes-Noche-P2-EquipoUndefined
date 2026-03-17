## Descripcion del sistema

Sistema de gestión de turnos médicos que permite a los usuarios
de un establecimiento medico guardar, eliminar y consultar Turnos medicos.

## Contratos de Pilas vs Colas (Bajo nivel)

### Pila

| Nombre de Contrato | Descripcion                                                 |
| :----------------- | :---------------------------------------------------------- |
| InicializarPila    | Inicializo ArregloDatos = []                                |
| Apilar             | Inserto Dato en ArregloDatos en la ultima posicion          |
| Desapilar          | Extraigo Dato ubicado en la ultima posición de ArregloDatos |
| Tope               | Consulto Dato ubicado en la ultima posición de ArregloDatos |
| PilaVacia          | Chequeo que ArreglosDatos este vacio                        |

### Cola

| Nombre de Contrato | Descripcion                                                  |
| :----------------- | :----------------------------------------------------------- |
| InicializarCola    | Inicializo ArregloDatos = []                                 |
| Acolar             | Inserto Dato en ArregloDatos en la ultima posicion           |
| Desacolar          | Extraigo Dato ubicado en la primera posición de ArregloDatos |
| Primero            | Consulto Dato ubicado en la primera posición de ArregloDatos |
| ColaVacia          | Chequeo que ArreglosDatos este vacio                         |

## Eleccion sobre Pila y Cola

Elegimos el tipo de estructura "cola" porque, al tratarse de turnos medicos, por ejemplo para una guardia medica, nuestro sistema debe priorizar a los pacientes por orden de llegada

## Contratos de Alto nivel

| Nombre de Contrato   | Descripcion                                                                                                                                       |
| :------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------ |
| InicializarSistema   | Llama la funcion InicializarCola                                                                                                                  |
| GuardarTurno         | 1. Recibe el Turno a almacenar <br> 2. Llama al metodo Acolar con el Turno como argumento <br> 3. Informa si la operación fue exitosa o no        |
| ConsultarTurnoActual | 1. Valida con ColaVacia que existan datos guardados <br> 2. Consulta el turno mediante Primero <br> 3. Se lo envia al usuario                     |
| ObtenerTurno         | 1. Valida con ColaVacia que existan Turnos guardados <br> 2. Obtiene el Turno mediante Desacolar <br> 3. Se lo envia al usuario                   |
| EliminarTurno        | 1. Valida con ColaVacia que existan Turnos guardados <br> 2. Remueve el Turno mediante Desacolar <br> 3. Informa si la operación fue exitosa o no |
