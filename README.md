# Spring Boot Security CRUD Application

Простое CRUD-приложение на Spring Boot с авторизацией и ролями, с использованием:

- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Thymeleaf
- Maven

##  📌 Описание

Приложение реализует CRUD-операции для сущности `User` с системой ролей:

- создание пользователя
- просмотр списка пользователей
- обновление данных
- удаление пользователя
- авторизация и разграничение доступа

##  ⚙️ Технологии

- Java 24
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Thymeleaf

## 🚀 Запуск проекта

### 1. Клонировать репозиторий
git clone https://github.com/Riss2121/3_1_3_Zadacha.git

### 2. Настроить базу данных

Создай БД в MySQL:

CREATE DATABASE security_db;
### 3. Настроить application.properties
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/security_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
### 4. Запуск

Через IntelliJ IDEA или:

mvn spring-boot:run

Приложение будет доступно:

http://localhost:8080

## 📁 Структура проекта
- controller/   → контроллеры (MVC)
- service/      → бизнес-логика
- repository/   → работа с БД
- model/        → сущности (Entity)
- configs/      → конфигурация Security
- templates/    → HTML страницы

## 📌 Основные эндпоинты
- Метод	URL	Описание
- GET	/login	страница входа
- GET	/admin	админ панель
- POST	/admin	создать пользователя
- POST	/admin/edit	обновить пользователя
- POST	/admin/delete	удалить пользователя
- GET	/user	страница пользователя
## 🔒 Доступ

/admin/** → только ADMIN
/user/** → USER и ADMIN

После логина происходит редирект по роли.

## 🧪 Тестовые пользователи
ADMIN:
username: admin
password: admin

USER:
username: user
password: user
## 📝 Особенности

реализация UserDetails и GrantedAuthority

кастомный SuccessUserHandler

шифрование паролей через BCrypt

Bootstrap UI: navbar, sidebar, tabs, modal windows

## 👤 Автор Roman Bashilov
