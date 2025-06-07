# 🧪 Laboratorio 12 – Aplicación Web con Spring Boot y Thymeleaf

Este proyecto es parte del **Laboratorio 12** del curso, donde se desarrollaron dos módulos funcionales: `Estudiantes` y `Personas`, aplicando el patrón MVC en Java con **Spring Boot**, vistas con **Thymeleaf**, y estilos modernos con **Bootstrap (Bootswatch)**.

---

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

yaml
Copiar código

---

## 🚀 Funcionalidades

### ✔️ Módulo Personas
- Se crea una clase `Persona` con atributos `nombre` y `edad`.
- Un controlador (`PersonaControlador`) carga una lista de personas.
- Se visualiza la lista usando una tabla en `personas.html` con Thymeleaf.

### ✔️ Módulo Estudiantes
- Formulario para registrar/editar estudiantes (nombre, apellido, correo, carrera).
- Vista `estudiantes.html` con una tabla de estudiantes.
- Acciones: **Editar**, **Eliminar** y **Agregar nuevo**.
- Formularios responsivos y diseño moderno con Bootstrap (tema Flatly).

---

## 🛠️ Tecnologías Usadas

- ☕ **Java 17+**
- ⚙️ **Spring Boot 3**
- 🌐 **Thymeleaf**
- 🎨 **Bootstrap 5**
- 🧩 **Bootswatch (tema Flatly)**
- 🛠️ **Maven**

---

## 🌐 Interfaz

Se usaron plantillas responsivas con Bootstrap para que las vistas sean:

- ✅ Adaptables a móviles
- ✅ Visualmente modernas
- ✅ Funcionales para CRUD simple

---

## 📚 Aprendizajes

- Comprendí cómo aplicar el patrón MVC con Spring Boot.
- Aprendí a enviar datos del backend al frontend usando el objeto `Model`.
- Practiqué la generación de tablas dinámicas con Thymeleaf (`th:each`, `th:text`).
- Mejoré la interfaz de usuario sin necesidad de escribir CSS, gracias a Bootswatch.

---

## ✅ Ejecución

1. Clona el repositorio o descarga el proyecto.
2. Ejecuta con tu IDE (IntelliJ, Eclipse o Spring Tool Suite).
3. Accede a las rutas:
   - `http://localhost:8080/personas`
   - `http://localhost:8080/estudiantes`

---

## ✅ Conclusiones

1. Reforcé el uso de Spring Boot y Thymeleaf para desarrollar aplicaciones web funcionales.
2. Entendí cómo estructurar correctamente un proyecto con controlador, modelo y vista (MVC).
3. Aplicar Bootstrap con temas como Flatly facilita el diseño de interfaces sin usar CSS manual.
4. Pude conectar datos entre el backend y las vistas dinámicamente.
5. Este laboratorio me ayudó a practicar CRUD básico y mejorar la presentación del frontend.

---

## 📌 Recomendaciones

- Mantener nombres claros y coherentes en controladores, rutas y archivos HTML.
- Probar bien cada funcionalidad del CRUD para validar su correcto funcionamiento.
- Aplicar un diseño consistente entre vistas para mejorar la experiencia del usuario.
- Utilizar temas de Bootswatch para modernizar la interfaz sin escribir CSS.
- Comentar el código si se va a escalar o presentar como parte de un proyecto mayor.

---

**Autor:** Anjeli Verastigue Tejeda  
**Curso:** Desarrollo de Aplicaciones Web  
**Sección:** 5 - C24 - A - B