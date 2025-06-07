# 🧪 Laboratorio 9 - Desarrollo de Aplicaciones Web con Spring Boot

## 📚 Descripción

En este laboratorio se desarrolló una aplicación web con **Spring Boot** para gestionar las entidades **Curso** y **Alumno**, implementando operaciones **CRUD completas**. Se conectó una base de datos **MySQL**, y se aplicaron conceptos como **inyección de dependencias**, uso de **repositorios JPA**, y vistas dinámicas con **Thymeleaf**.

---

## 🛠️ Tecnologías Usadas

- ☕ Java 17+
- ⚙️ Spring Boot
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🐬 MySQL
- 🎨 Thymeleaf
- 🖥️ IntelliJ IDEA o Spring Tool Suite

---

## 📦 Estructura del Proyecto

📦 src
┣ 📂 main
┃ ┣ 📂 java
┃ ┃ ┣ 📂 com
┃ ┃ ┃ ┗ 📂 tu_usuario
┃ ┃ ┃ ┃ ┗ 📂 proyecto
┃ ┃ ┃ ┃ ┣ 📂 controller
┃ ┃ ┃ ┃ ┃ ┣ CursoController.java
┃ ┃ ┃ ┃ ┃ ┗ AlumnoController.java
┃ ┃ ┃ ┃ ┣ 📂 model
┃ ┃ ┃ ┃ ┃ ┣ Curso.java
┃ ┃ ┃ ┃ ┃ ┗ Alumno.java
┃ ┃ ┃ ┃ ┣ 📂 repository
┃ ┃ ┃ ┃ ┃ ┣ CursoRepository.java
┃ ┃ ┃ ┃ ┃ ┗ AlumnoRepository.java
┃ ┃ ┃ ┃ ┣ 📂 service
┃ ┃ ┃ ┃ ┃ ┣ CursoService.java
┃ ┃ ┃ ┃ ┃ ┣ CursoServiceImpl.java
┃ ┃ ┃ ┃ ┃ ┣ AlumnoService.java
┃ ┃ ┃ ┃ ┃ ┗ AlumnoServiceImpl.java
┃ ┃ ┃ ┃ ┗ Application.java
┃ ┗ 📂 resources
┃ ┃ ┣ 📂 templates
┃ ┃ ┃ ┣ listarCursoView.html
┃ ┃ ┃ ┣ formCursoView.html
┃ ┃ ┃ ┣ listarAlumnoView.html
┃ ┃ ┃ ┗ formAlumnoView.html
┃ ┃ ┗ application.properties

yaml
Copiar código

---

## ⚙️ Configuración – `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/escuela
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
📌 Nota: Asegúrate de crear la base de datos escuela en MySQL antes de ejecutar la aplicación.

🔗 Funcionalidades Implementadas
✅ CRUD completo para Curso: crear, listar, editar, eliminar.

✅ CRUD completo para Alumno: crear, listar, editar, eliminar.

🔄 Uso de interfaces y servicios con inyección de dependencias.

🧠 Separación de lógica en capas: Controlador, Servicio, Repositorio.

👁️ Interfaz HTML dinámica con Thymeleaf para formularios y tablas.

▶️ Ejecución
Ejecuta la aplicación Spring Boot desde tu IDE o terminal.

Accede desde el navegador a:

http://localhost:8080/cursos

http://localhost:8080/alumnos

Verifica los datos en la base de datos MySQL.

👨‍🎓 Autor
Nombre: Anjeli Verastigue Tejeda

Curso: Desarrollo de Aplicaciones Web Avanzado

Sección: 5 - C24 - A - B

✅ Conclusiones
Comprendí cómo organizar correctamente carpetas y clases en un proyecto Spring Boot.

Aprendí a conectar la aplicación con MySQL usando application.properties.

Reforcé el uso de interfaces, servicios y repositorios para manejar la lógica del sistema.

Implementar el CRUD para Curso y Alumno me ayudó a practicar el desarrollo completo de una app web.

Usar Thymeleaf facilitó la creación de vistas dinámicas y amigables.

📌 Recomendaciones
Verifica que el servidor MySQL esté encendido antes de ejecutar.

Usa nombres claros y coherentes para las clases y vistas.

Prueba todas las operaciones CRUD para asegurarte de que funcionen bien.

Mantén actualizado tu proyecto con las versiones estables de Spring y dependencias.

yaml
Copiar código
