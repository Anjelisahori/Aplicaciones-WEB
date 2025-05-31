🧪 Laboratorio 9 - Desarrollo de Aplicaciones Web con Spring Boot

📚 Descripción  
En este laboratorio se desarrolló una aplicación web con Spring Boot para gestionar la entidad Curso y posteriormente Alumno, implementando operaciones CRUD completas. Se configuró una base de datos MySQL para almacenar la información y se trabajó con los principios de inyección de dependencias y manejo de repositorios en Spring.

🛠️ Tecnologías usadas  
- Java 17+  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Thymeleaf  
- IntelliJ IDEA o Spring Tool Suite  

🗃️ Estructura del proyecto  
src/
├── main/
│ ├── java/com/tu_usuario/proyecto/
│ │ ├── controller/
│ │ │ ├── CursoController.java
│ │ │ └── AlumnoController.java
│ │ ├── model/
│ │ │ ├── Curso.java
│ │ │ └── Alumno.java
│ │ ├── repository/
│ │ │ ├── CursoRepository.java
│ │ │ └── AlumnoRepository.java
│ │ ├── service/
│ │ │ ├── CursoService.java
│ │ │ ├── CursoServiceImpl.java
│ │ │ ├── AlumnoService.java
│ │ │ └── AlumnoServiceImpl.java
│ │ └── Application.java
│ └── resources/
│ ├── templates/
│ │ ├── listarCursoView.html
│ │ ├── formCursoView.html
│ │ ├── listarAlumnoView.html
│ │ └── formAlumnoView.html
│ └── application.properties


⚙️ Configuración - application.properties  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/escuela
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
Asegúrate de crear la base de datos escuela en MySQL antes de ejecutar la aplicación.

🔗 Funcionalidades implementadas

CRUD para la entidad Curso: creación, listado, edición y eliminación de cursos.

CRUD para la entidad Alumno: creación, listado, edición y eliminación de alumnos.

Configuración e inyección de dependencias usando Spring Boot.

Uso de Thymeleaf para las vistas de formularios y listados.

🧪 Ejecución

Ejecutar la aplicación Spring Boot desde el IDE o línea de comandos.

Acceder a las rutas /cursos y /alumnos para gestionar las entidades desde el navegador.

Verificar los datos en la base de datos MySQL para confirmar las operaciones CRUD.

👨‍🎓 Autor
Anjeli Verastigue Tejeda
Curso: Desarrollo de Aplicaciones Web Avanzado
Sección: 5 - C24 - A - B

✅ Conclusiones

Entendí la importancia de una buena estructura de carpetas y clases para organizar proyectos Spring Boot.

Configurar correctamente application.properties facilita la conexión con MySQL y la gestión de la base de datos.

Comprendí mejor el uso de interfaces y la inyección de dependencias para manejar repositorios y servicios en Spring Boot.

Practicar el CRUD para las entidades Curso y Alumno reforzó mis conocimientos en desarrollo web con Spring Boot.

La práctica constante con proyectos me dio más seguridad y entendimiento en la implementación de aplicaciones web con Spring Boot.

📌 Recomendaciones

Revisar que el servidor MySQL esté activo antes de iniciar la aplicación.

Usar nombres claros y coherentes para controladores, servicios, repositorios y vistas.

Probar todas las operaciones CRUD para validar el correcto funcionamiento.

Mantener el proyecto actualizado con las versiones recomendadas de Spring Boot y dependencias.