# 🧪 Laboratorio 10 - Aplicaciones Web con Spring Boot: CRUD para Curso y Alumno

## 📚 Descripción

Este proyecto consiste en el desarrollo de una aplicación web con **Spring Boot** para gestionar dos entidades principales: **Curso** y **Alumno**. Se implementaron operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para ambas tablas, permitiendo la administración básica de datos en una base de datos relacional.

---

## 🛠️ Tecnologías Usadas

- ☕ Java 17+
- ⚙️ Spring Boot
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🎨 Thymeleaf
- 🎯 Bootstrap
- 🐬 MySQL o 🧪 H2 (base de datos en memoria)
- 🖥️ IntelliJ IDEA o Spring Tool Suite

---

## 📦 Estructura del Proyecto

📦 src
┣ 📂 main
┃ ┣ 📂 java
┃ ┃ ┗ 📂 com
┃ ┃ ┃ ┗ 📂 tecsup
┃ ┃ ┃ ┃ ┗ 📂 demo
┃ ┃ ┃ ┃ ┣ 📂 controller
┃ ┃ ┃ ┃ ┃ ┣ CursoController.java
┃ ┃ ┃ ┃ ┃ ┗ AlumnoController.java
┃ ┃ ┃ ┃ ┣ 📂 model
┃ ┃ ┃ ┃ ┃ ┣ Curso.java
┃ ┃ ┃ ┃ ┃ ┗ Alumno.java
┃ ┃ ┃ ┃ ┣ 📂 repository
┃ ┃ ┃ ┃ ┃ ┣ CursoRepository.java
┃ ┃ ┃ ┃ ┃ ┗ AlumnoRepository.java
┃ ┃ ┃ ┃ ┗ DemoApplication.java
┃ ┣ 📂 resources
┃ ┃ ┣ 📂 templates
┃ ┃ ┃ ┣ listarCurso.html
┃ ┃ ┃ ┣ listarAlumno.html
┃ ┃ ┃ ┣ formCurso.html
┃ ┃ ┃ ┗ formAlumno.html
┃ ┃ ┗ application.properties

yaml
Copiar código

---

## ⚙️ Configuración – `application.properties`

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
🔁 Puedes cambiar la configuración para usar MySQL si lo deseas.

🔗 Endpoints Disponibles
📘 Cursos
GET /cursos → Listar todos los cursos

GET /cursos/form → Formulario para crear curso

POST /cursos → Guardar curso

GET /cursos/form/{id} → Formulario para editar curso

GET /cursos/eliminar/{id} → Eliminar curso

🧑‍🎓 Alumnos
GET /alumnos → Listar todos los alumnos

GET /alumnos/form → Formulario para crear alumno

POST /alumnos → Guardar alumno

GET /alumnos/form/{id} → Formulario para editar alumno

GET /alumnos/eliminar/{id} → Eliminar alumno

🧪 Pruebas en Navegador
Accede a: http://localhost:8080

Navega a: /cursos o /alumnos para gestionar cada entidad

Usa los formularios para crear o editar registros

Visualiza los cambios directamente en la base de datos H2 o MySQL

👨‍🎓 Autor
Nombre: Anjeli Verastigue Tejeda

Curso: Desarrollo de Aplicaciones Web Avanzado

Sección: 5 - C24 - A - B

✅ Conclusiones
Comprendí cómo crear una aplicación Spring Boot con dos entidades relacionadas.

Aprendí a implementar CRUDs completos usando Spring Data JPA y Thymeleaf.

Mejoré mi manejo de rutas y controladores en la web.

Apliqué Bootstrap para mejorar la apariencia visual.

Valoré la importancia de separar las responsabilidades en capas (modelo, repositorio, controlador, vista).

📌 Recomendaciones
Asegurarse de que el servidor de base de datos esté activo (si usas MySQL).

Probar cada función del CRUD para verificar su correcto funcionamiento.

Mantener actualizadas las dependencias del proyecto.

Usar nombres claros y coherentes en controladores, rutas y vistas.

Documentar el proyecto para facilitar futuras mejoras o mantenimiento.