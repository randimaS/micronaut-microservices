# Micronaut Hello Service

Contains two HTTP methods for Hello Service

### REST services

- GET - hello/get/{name}
##### Request
```sh
$ curl -X GET http://localhost:8080/hello/get/John
```
##### Response
```sh
$ { "response" : "Hello John "}
```
- GET - hello/post/ with payload
##### Request
```sh
$ curl -X POST http://localhost:8080/hello/post -H "Content-Type:application/json" -d "{\"name\":\"John\"}"
```
##### Response
```sh
$ { "response" : "Hello John "}
```

### Local Setup

- Build
```sh
$ ./gradlew build
```
- Run
```sh
$ ./gradlew run
```

### Docker Setup

- Docker Build
```sh
$ docker build -t hello-service .
```
- Docker Run
```sh
$ docker run -p 8080:8080 hello-service
```
