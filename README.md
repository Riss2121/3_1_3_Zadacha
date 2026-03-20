🔐 Spring Boot Security CRUD

Web-приложение с аутентификацией и ролями (ADMIN / USER) на Spring Boot.

🚀 Tech Stack

Java, Spring Boot, Spring Security, Spring Data JPA (Hibernate), MySQL, Thymeleaf, Bootstrap 5

⚙️ Features

Authentication: кастомный login, BCrypt
Roles: ROLE_ADMIN, ROLE_USER

Admin (/admin):

просмотр всех пользователей

создание

редактирование (modal)

удаление (modal)

User (/user):

просмотр своих данных

🔒 Security
/admin/** → ROLE_ADMIN
/user/**  → ROLE_USER, ROLE_ADMIN
🗄 Structure
controller/
service/
repository/
model/
configs/
templates/
⚙️ Config
spring.datasource.url=jdbc:mysql://localhost:3306/security_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
▶️ Run
mvn spring-boot:run
🌐 URL
http://localhost:8080
🧪 Test Users
admin / admin
user / user

✍️ Author

Roman — Java / Spring Developer 🚀
