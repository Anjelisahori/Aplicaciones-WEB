# 🧪 Laboratorio 11 - Aplicaciones Web con Spring Data JPA

## 📚 Descripción

Este proyecto consiste en el desarrollo de una aplicación web con **Spring Boot**, utilizando **Spring Data JPA** para la persistencia de datos. Se implementa un CRUD completo para dos entidades relacionadas: **Laboratorio** y **OrdenCompra**, almacenadas en una base de datos **MySQL**.

---

## 🛠️ Tecnologías Usadas

- ☕ Java 17+
- ⚙️ Spring Boot
- 🌐 Spring Web
- 🗃️ Spring Data JPA
- 🐬 MySQL
- 📮 Postman (para pruebas de API)
- 🖥️ IntelliJ IDEA o Spring Tool Suite
- 🧑‍💻 Git y GitHub

---

## 📦 Estructura del Proyecto

📦 src
┣ 📂 main
┃ ┣ 📂 java
┃ ┃ ┗ 📂 com
┃ ┃ ┃ ┗ 📂 tecsup
┃ ┃ ┃ ┃ ┗ 📂 demo
┃ ┃ ┃ ┃ ┣ 📂 controller
┃ ┃ ┃ ┃ ┃ ┣ LaboratorioController.java
┃ ┃ ┃ ┃ ┃ ┗ OrdenCompraController.java
┃ ┃ ┃ ┃ ┣ 📂 model
┃ ┃ ┃ ┃ ┃ ┣ Laboratorio.java
┃ ┃ ┃ ┃ ┃ ┗ OrdenCompra.java
┃ ┃ ┃ ┃ ┣ 📂 repository
┃ ┃ ┃ ┃ ┃ ┣ LaboratorioRepository.java
┃ ┃ ┃ ┃ ┃ ┗ OrdenCompraRepository.java
┃ ┃ ┃ ┃ ┗ DemoApplication.java
┃ ┗ 📂 resources
┃ ┃ ┗ application.properties

yaml
Copiar código

---

## ⚙️ Configuración – `application.properties`

```properties
spring.application.name=Laboratorio-11

spring.datasource.url=jdbc:mysql://localhost:3306/bd_farmacia?useSSL=false
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
💡 Importante: Asegúrate de crear la base de datos bd_farmacia en MySQL antes de ejecutar la aplicación.

🔗 Endpoints Disponibles
🧪 Laboratorio
POST /laboratorios → Crear laboratorio

GET /laboratorios → Listar todos los laboratorios

PUT /laboratorios/{id} → Actualizar laboratorio

DELETE /laboratorios/{id} → Eliminar laboratorio

📄 Orden de Compra
POST /ordenescompra → Crear orden de compra

GET /ordenescompra → Listar todas las órdenes de compra

PUT /ordenescompra/{id} → Actualizar orden de compra

DELETE /ordenescompra/{id} → Eliminar orden de compra

🧪 Pruebas con Postman
✅ Crear Laboratorio
h
Copiar código
POST http://localhost:8080/laboratorios
json
Copiar código
{
  "razonSocial": "LabTec",
  "direccion": "Av. Ciencia 123",
  "telefono": "987654321",
  "email": "labtec@correo.com",
  "contacto": "Luis Torres"
}
✅ Crear Orden de Compra
http
Copiar código
POST http://localhost:8080/ordenescompra
json
Copiar código
{
  "fechaEmision": "2024-05-30",
  "situacion": "Pendiente",
  "total": 1200.50,
  "nroFacturaProv": "F001-456",
  "laboratorio": {
    "codLab": 1
  }
}
👨‍🎓 Autor
Nombre: Anjeli Verastigue Tejeda

Curso: Desarrollo de Aplicaciones Web Avanzado

Sección: 5 - C24 - A - B

✅ Conclusiones
Comprendí cómo desarrollar una aplicación web usando Spring Boot y Spring Data JPA.

Aprendí a crear y relacionar entidades para ser persistidas en una base de datos MySQL.

Fortalecí mis habilidades construyendo endpoints REST y realizando pruebas con Postman.

Apliqué buenas prácticas separando responsabilidades en controladores, modelos y repositorios.

Reconocí la importancia de las anotaciones JPA como @ManyToOne y @JoinColumn para manejar relaciones entre tablas.

📌 Recomendaciones
Verificar que el servicio de MySQL esté activo antes de ejecutar.

Usar nombres claros y descriptivos en clases, rutas y variables.

Realizar pruebas CRUD con diferentes datos para validar el comportamiento.

Mantener application.properties actualizado y seguro.

Documentar bien los endpoints y la estructura para facilitar mantenimiento futuro.