# 🧪 Laboratorio 12 – Aplicación Web con Spring Boot y Thymeleaf

Este proyecto es parte del **Laboratorio 12** del curso, donde se desarrollaron dos módulos funcionales: `Estudiantes` y `Personas`, aplicando el patrón MVC en Java con **Spring Boot**, vistas con **Thymeleaf**, y estilos modernos con **Bootstrap (Bootswatch)**.

## 📁 Estructura del Proyecto

📦src
┣ 📂main
┃ ┣ 📂java
┃ ┃ ┣ 📂controlador
┃ ┃ ┃ ┗ PersonaControlador.java
┃ ┃ ┣ 📂modelo
┃ ┃ ┃ ┣ Persona.java
┃ ┃ ┃ ┗ Estudiante.java (si se usa)
┃ ┃ ┗ 📂Aplicacion.java (main)
┃ ┣ 📂resources
┃ ┃ ┣ 📂templates
┃ ┃ ┃ ┣ personas.html
┃ ┃ ┃ ┣ estudiantes.html
┃ ┃ ┣ application.properties

markdown
Copiar código

## 🚀 Funcionalidades

### ✔️ Módulo Personas
- Se crea una clase `Persona` con atributos `nombre` y `edad`.
- Un controlador (`PersonaControlador`) carga una lista de personas.
- Se visualiza la lista usando una tabla en `personas.html` con Thymeleaf.

### ✔️ Módulo Estudiantes
- Formulario para registrar/editar estudiantes (nombre, apellido, correo, carrera).
- Vista `lista.html` con una tabla de estudiantes.
- Acciones: **Editar**, **Eliminar** y **Agregar nuevo**.
- Formularios responsivos y diseño moderno con Bootstrap (tema Flatly).

## 🛠️ Tecnologías Usadas

- **Java 17+**
- **Spring Boot 3**
- **Thymeleaf**
- **Bootstrap 5**
- **Bootswatch (tema Flatly)**
- **Maven**

## 🌐 Interfaz

Se usaron plantillas responsivas con Bootstrap para que las vistas sean:
- Adaptables a móviles
- Visualmente modernas
- Funcionales para CRUD simple

## 📚 Aprendizajes

- Uso del patrón MVC con Spring Boot.
- Envío de datos del backend al frontend con `Model`.
- Generación dinámica de tablas con Thymeleaf (`th:each`, `th:text`).
- Mejora de interfaz con Bootswatch sin escribir CSS manual.

## ✅ Ejecución

1. Clona el repositorio o descarga el proyecto.
2. Ejecuta con tu IDE (IntelliJ, Eclipse o Spring Tool Suite).
3. Accede a las rutas:
   - `http://localhost:8080/personas`
   - `http://localhost:8080/estudiantes`

---

**Autor:** [Anjeli Verastigue Tejeda]  
**Curso:** Desarrollo de Aplicaciones Web 