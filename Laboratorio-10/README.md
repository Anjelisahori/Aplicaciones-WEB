# Laboratorio 10 - CRUD con Spring Boot y MongoDB

## Descripción

Este laboratorio consiste en la creación de un proyecto Spring Boot que implementa operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para dos entidades principales: **Curso** y **Alumno**. Utilizamos MongoDB como base de datos NoSQL para almacenar la información y Thymeleaf para la presentación web.

---

## Estructura del proyecto

PRJ_CRUD_SPRING_BOOT_MONGODB
│
├── src
│ └── main
│ ├── java
│ │ └── com.tecsup.demo
│ │ ├── controladores
│ │ │ ├── CursoController.java
│ │ │ └── AlumnoController.java
│ │ ├── modelo
│ │ │ ├── documents
│ │ │ │ ├── Curso.java
│ │ │ │ └── Alumno.java
│ │ │ └── daos
│ │ │ ├── CursoRepository.java
│ │ │ └── AlumnoRepository.java
│ │ └── servicios
│ │ ├── CursoService.java
│ │ ├── CursoServiceImpl.java
│ │ ├── AlumnoService.java
│ │ └── AlumnoServiceImpl.java
│ └── resources
│ ├── templates
│ │ ├── listarView.html
│ │ ├── formView.html
│ │ ├── listarAlumnos.html
│ │ ├── formAlumno.html
│ │ └── index.html
│ └── application.properties
---

## Funcionalidades

- Listar, crear, editar y eliminar cursos.
- Listar, crear, editar y eliminar alumnos.
- Validación de formularios usando anotaciones `@Valid` en las entidades.
- Navegación amigable entre vistas con Thymeleaf.
- Página principal (index.html) para elegir entre gestión de cursos o alumnos.

---

## Tecnologías usadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Thymeleaf
- Bootstrap 4 (para estilos rápidos y responsivos)
- Maven

---

## Cómo ejecutar el proyecto

1. Asegúrate de tener MongoDB instalado y corriendo en tu máquina local.
2. Clona o descarga este repositorio.
3. Configura la conexión a MongoDB en `application.properties` (por defecto localhost y puerto 27017).
4. Ejecuta el proyecto desde tu IDE favorito o usando Maven:

   ```bash
   mvn spring-boot:run
Accede a la aplicación vía navegador web:

Página principal: http://localhost:8080/

Gestión de cursos: http://localhost:8080/listar

Gestión de alumnos: http://localhost:8080/alumnos

Consideraciones
La validación en los formularios garantiza que los datos ingresados cumplan con los requisitos mínimos antes de ser almacenados.

La estructura del proyecto sigue una arquitectura en capas para facilitar la escalabilidad y mantenimiento.

Se utilizaron las mejores prácticas de Spring Boot para inyección de dependencias y manejo de sesiones.

Conclusiones
La práctica me permitió consolidar conocimientos sobre CRUD en aplicaciones Spring Boot con bases NoSQL.

Entendí la importancia de la separación de responsabilidades en la arquitectura de software.

Aprendí a integrar Thymeleaf con validaciones y formularios para crear interfaces dinámicas y amigables.

Comprendí cómo gestionar múltiples entidades con funcionalidades similares reutilizando código y patrones.

Mejoré mi manejo de rutas y navegación web para una mejor experiencia del usuario.