# mi-proyecto

# Estructura del Proyecto

```
mi-proyecto/
|-- src/
|   |-- main/
|       |-- java/
|       |   |-- com/
|       |       |-- miempresa/
|       |           |-- aplicacion/
|       |               |-- configuraciones/
|       |               |   |-- AppConfig.java
|       |               |
|       |               |-- controladores/
|       |               |   |-- MiControlador.java
|       |               |
|       |               |-- modelos/
|       |               |   |-- MiEntidad.java
|       |               |
|       |               |-- repositorios/
|       |               |   |-- implementacion/
|       |               |       |-- MiRepositorioImpl.java
|       |               |   |-- MiRepositorio.java
|       |               |
|       |               |-- servicios/
|       |               |   |-- implementacion/
|       |               |       |-- MiServicioImpl.java
|       |               |   |-- MiServicio.java
|       |
|       |-- resources/
|           |-- application.properties
|
|-- test/
|   |-- java/
|       |-- com/
|           |-- miempresa/
|               |-- aplicacion/
|                   |-- MiControladorTest.java
|                   |-- MiServicioTest.java
|
|-- pom.xml
```

## 1. Capa de Controladores (Presentación):
### Responsabilidad:

Gestiona las solicitudes HTTP y las respuestas correspondientes.
* Interactúa con el usuario a través de la interfaz de usuario.
* Convierte los datos de entrada y salida entre el formato de la interfaz de usuario y el formato interno de la aplicación.
* Maneja la navegación entre páginas o vistas.

### Ejemplo en Spring Boot:

* Clases anotadas con `@Controller` o `@RestController`.
* Métodos que manejan las solicitudes HTTP, llamando a servicios para realizar operaciones específicas.

## 2. Capa de Servicios (Lógica de Negocio):
### Responsabilidad:

* Contiene la lógica de negocio de la aplicación.
* Coordinar y orquestar las operaciones entre varios repositorios.
* Realiza validaciones de negocio.
* Transforma datos según sea necesario antes de pasarlos a la capa de persistencia o presentación.

### Ejemplo en Spring Boot:

* Clases anotadas con `@Service`.
* Contienen métodos que encapsulan la lógica de negocio.
* Pueden interactuar con uno o más repositorios para realizar operaciones de persistencia.

## 3. Capa de Persistencia (Acceso a Datos):
### Responsabilidad:

* Gestiona el acceso a la base de datos.
* Realiza operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.
* Convierte objetos de la aplicación a estructuras de datos compatibles con la base de datos y viceversa.

### Ejemplo en Spring Boot:

* Clases anotadas con `@Repository`.
* Utiliza Spring Data JPA para interactuar con la base de datos.
* Define interfaces de repositorio que extienden JpaRepository u otras interfaces proporcionadas por Spring Data.

Esta estructura ayuda a mantener una clara separación de responsabilidades y facilita la escalabilidad y mantenimiento del código.

## Microservicio de Usuarios:
* Nombre: usuario-service
* Recurso: /v1/usuarios

| Descripcion | Verbo Http | Endpoint | Status Code |
| - | - | - | - |
| Crear un usuario | POST | /v1/usuarios | 201 |

* Ejemplos:
  * 
  * Obtener todos los usuarios: GET /v1/usuarios
  * Obtener un usuario por ID: GET /v1/usuarios/{id}
  * Actualizar un usuario: PUT /v1/usuarios/{id}
  * Eliminar un usuario: DELETE /v1/usuarios/{id}
