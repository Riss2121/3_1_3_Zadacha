🔐 Spring Boot Security CRUD

Web-приложение с аутентификацией и ролевой авторизацией (ADMIN / USER) на Spring Boot.

🚀 Tech Stack

Java

Spring Boot

Spring Security

Spring Data JPA (Hibernate)

MySQL

Thymeleaf

Bootstrap 5

⚙️ Features
🔑 Authentication

Кастомная форма логина

BCrypt шифрование паролей

👥 Authorization

ROLE_ADMIN

ROLE_USER

🛠 Admin (/admin)

Просмотр всех пользователей

Добавление пользователей

Редактирование (modal)

Удаление (modal)

👤 User (/user)

Просмотр своих данных

Доступ только к своей странице

🔒 Security Rules
/admin/**  → ROLE_ADMIN
/user/**   → ROLE_USER, ROLE_ADMIN

После логина пользователь перенаправляется по роли.

🗄 Project Structure
src/main/java/...
├── controller
├── service
├── repository
├── model
└── configs

src/main/resources/
└── templates
⚙️ Configuration

application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/security_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
▶️ Run
mvn spring-boot:run

или через IDE

🌐 Access
http://localhost:8080
🧪 Test Users
ADMIN
username: admin
password: admin

USER
username: user
password: user
📦 Clone
git clone https://github.com/your-repo.git
✍️ Author

Roman
Java / Spring Developer 🚀

Если хочешь ещё круче (как у топовых реп):

добавлю бейджи (build, version)

скрины UI

или полностью на английском стиле OSS
