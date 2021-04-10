# Student Crud App Service


The Application is deployed on Heroku free Tier

[Server-Link](https://student-crud-cogoport.herokuapp.com/) access the server from here.


[UI-Link](https://ui-student-crud.herokuapp.com/) access the server from here.
## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Gradle](https://gradle.org/install/)

## Running the application locally

There are several ways to build a Spring Boot application on your local machine. One way is to use the import gradle build in your IDE.

Alternatively you can use the Gradle to build:

```shell
gradlew clean build
```

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method class from your IDE.

Alternatively you can use the Gradle to Run:

```shell
gradlew bootRun
```

## API Documentation

For building and running the application you need:

- `https://student-crud-cogoport.herokuapp.com/api/addUser` to add new the Student.
- `https://student-crud-cogoport.herokuapp.com/api/deleteUser/{id}` to delete the Student details.
- `https://student-crud-cogoport.herokuapp.com/api/getAll` to get the list of all Students.
- `https://student-crud-cogoport.herokuapp.com/api/updateUser` to add update Student details.
- `https://student-crud-cogoport.herokuapp.com/api/getByID/{id}` to get the Student details by Id.