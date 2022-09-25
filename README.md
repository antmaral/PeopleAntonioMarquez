# PeopleAntonioMarquez

REST Web Service with the following CRUD functionality to administer User
Accounts for an online service:
1. Create User Account
2. Retrieve User Account (By Id and by name)
3. Update User Account
4. Delete User Account

Users have an Id, a full name, an email and a password.

It makes use of Spring Boot, Spring MVC, Java 8, Swagger-ui (in order to interact with the API) and an in-memory database H2.

In order to connect to the database, it is necessary to modify the username and password in the applications.properties file.

For visualizing the full JSON enter http://localhost:8080/usuario

For retrieving an employee by Id enter http://localhost:8080/usuario/id (where id should be replaced by a numerical value)

For retrieving an employee by name enter http://localhost:8080/usuario/query?nombre=Name (where Name should be replaced by the employee's name)

For posting, updating, and deleting employees either Postman or Swagger-ui can be use. 

To access the Swagger-ui interface visit http://localhost:8080/swagger-ui.html
