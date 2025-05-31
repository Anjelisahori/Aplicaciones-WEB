🧪 Laboratorio 10 - Aplicaciones Web con Spring Boot: CRUD para Curso y Alumno

📚 Descripción  
Este proyecto consiste en el desarrollo de una aplicación web con Spring Boot para gestionar dos entidades principales: Curso y Alumno. Se implementaron operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para ambas tablas, permitiendo la administración básica de datos en una base de datos relacional.

🛠️ Tecnologías usadas  
- Java 17+  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Thymeleaf  
- Bootstrap  
- Base de datos H2 (en memoria) o MySQL  
- IntelliJ IDEA o Spring Tool Suite  

🗃️ Estructura del proyecto  
src/
├── main/
│ ├── java/com/tecsup/demo/
│ │ ├── controller/
│ │ │ ├── CursoController.java
│ │ │ └── AlumnoController.java
│ │ ├── model/
│ │ │ ├── Curso.java
│ │ │ └── Alumno.java
│ │ ├── repository/
│ │ │ ├── CursoRepository.java
│ │ │ └── AlumnoRepository.java
│ │ └── DemoApplication.java
│ └── resources/
│ ├── templates/
│ │ ├── listarCurso.html
│ │ ├── listarAlumno.html
│ │ ├── formCurso.html
│ │ └── formAlumno.html
│ └── application.properties

⚙️ Configuración - application.properties  
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
Puedes cambiar a MySQL configurando las propiedades correspondientes.

🔗 Endpoints disponibles

Cursos

GET /cursos → Listar todos los cursos

GET /cursos/form → Formulario para crear curso

POST /cursos → Guardar curso

GET /cursos/form/{id} → Formulario para editar curso

GET /cursos/eliminar/{id} → Eliminar curso

Alumnos

GET /alumnos → Listar todos los alumnos

GET /alumnos/form → Formulario para crear alumno

POST /alumnos → Guardar alumno

GET /alumnos/form/{id} → Formulario para editar alumno

GET /alumnos/eliminar/{id} → Eliminar alumno

🧪 Pruebas en navegador

Accede a http://localhost:8080 para ver la página principal con opciones para cursos y alumnos.

Navega a /cursos o /alumnos para listar y administrar cada entidad.

Utiliza los formularios para crear o editar registros.

👨‍🎓 Autor
Anjeli Verastigue Tejeda
Curso: Desarrollo de Aplicaciones Web Avanzado
Sección: 5 - C24 - A - B

✅ Conclusiones

Comprendí cómo crear una aplicación Spring Boot con dos entidades relacionadas.

Aprendí a implementar CRUDs completos usando Spring Data JPA y Thymeleaf para la interfaz.

Mejoré mi manejo de rutas y controladores para la gestión de cursos y alumnos.

Pude integrar Bootstrap para mejorar la apariencia visual de las páginas web.

Reconocí la importancia de separar responsabilidades en capas (modelo, repositorio, controlador, vista).

📌 Recomendaciones

Verificar que el servidor de base de datos esté activo antes de ejecutar la app (si usas MySQL).

Probar cada función del CRUD para asegurar su correcto funcionamiento.

Mantener las dependencias y versiones de Spring Boot actualizadas.

Usar nombres claros y consistentes para controladores, rutas y vistas.

Documentar el proyecto para facilitar futuras mejoras o mantenimiento.