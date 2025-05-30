# 🧪 Laboratorio 11 - Aplicaciones Web con Spring Data JPA

## 📚 Descripción

Este proyecto consiste en el desarrollo de una aplicación web con **Spring Boot**, utilizando **Spring Data JPA** para la persistencia de datos. Se implementa un CRUD completo para dos entidades relacionadas: **Laboratorio** y **OrdenCompra**, almacenadas en una base de datos MySQL.

## 🛠️ Tecnologías usadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Postman (para pruebas)
- IntelliJ IDEA o Spring Tool Suite
- Git y GitHub

## 🗃️ Estructura del proyecto

src/
├── main/
│ ├── java/com/tecsup/demo/
│ │ ├── controller/
│ │ │ ├── LaboratorioController.java
│ │ │ └── OrdenCompraController.java
│ │ ├── model/
│ │ │ ├── Laboratorio.java
│ │ │ └── OrdenCompra.java
│ │ ├── repository/
│ │ │ ├── LaboratorioRepository.java
│ │ │ └── OrdenCompraRepository.java
│ │ └── DemoApplication.java
│ └── resources/
│ └── application.properties

pgsql
Copiar
Editar

## ⚙️ Configuración - `application.properties`

```properties
spring.application.name=Laboratorio-11

spring.datasource.url=jdbc:mysql://localhost:3306/bd_farmacia?useSSL=false
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
💡 Asegúrate de crear la base de datos bd_farmacia en MySQL antes de ejecutar la aplicación.

🔗 Endpoints disponibles
Laboratorio
POST /laboratorios → Crear laboratorio

GET /laboratorios → Listar todos los laboratorios

PUT /laboratorios/{id} → Actualizar laboratorio

DELETE /laboratorios/{id} → Eliminar laboratorio

OrdenCompra
POST /ordenescompra → Crear orden de compra

GET /ordenescompra → Listar todas las órdenes de compra

PUT /ordenescompra/{id} → Actualizar orden de compra

DELETE /ordenescompra/{id} → Eliminar orden de compra

🧪 Pruebas con Postman
Crear laboratorio
json
Copiar
Editar
POST http://localhost:8080/laboratorios

{
  "razonSocial": "LabTec",
  "direccion": "Av. Ciencia 123",
  "telefono": "987654321",
  "email": "labtec@correo.com",
  "contacto": "Luis Torres"
}
Crear orden de compra
json
Copiar
Editar
POST http://localhost:8080/ordenescompra

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
Ricardo Coello Palomino
Curso: Desarrollo de Aplicaciones Web Avanzado
Sección: 5 - C24 - A - B

✅ Conclusiones
Comprendí cómo desarrollar una aplicación web utilizando el framework Spring Boot y la herramienta Spring Data JPA.

Aprendí a crear y configurar entidades relacionadas para su persistencia en una base de datos MySQL.

Fortalecí mis habilidades para construir endpoints REST y realizar pruebas utilizando Postman.

Pude aplicar buenas prácticas de estructuración del proyecto utilizando controladores, repositorios y modelos.

Reconocí la importancia del uso de anotaciones de JPA como @ManyToOne y @JoinColumn para manejar relaciones entre tablas.

📌 Recomendaciones
Verificar que MySQL esté activo antes de ejecutar la aplicación.

Utilizar nombres descriptivos para clases y rutas REST.

Hacer pruebas con datos variados para asegurar el correcto funcionamiento del CRUD.

Mantener actualizado el archivo application.properties con credenciales válidas.

Subir el proyecto a GitHub con una buena documentación (como este README).

yaml
Copiar
Editar

---

Puedes copiar todo el bloque de arriba y pegarlo directamente en tu archivo `README.md` en tu repositorio de GitHub. Si necesitas incluir imágenes, instrucciones adicionales o el link del repositorio, también puedo ayudarte a agregarlos.






