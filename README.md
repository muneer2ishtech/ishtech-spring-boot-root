# ishtch-spring-boot-root

## Versions
- java - 21
- spring-boot - 3.2.3


## APIs

- Here is brief info APIs
- For details you can see swagger documentation
    - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
    - [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)
- If running on different server or port change their values in URL


| Module  | Type                      | Auth | HTTP  | URL                          | Description |
|---------|---------------------------|------|-------|------------------------------|-------------|
| API Doc | OpenAPI                   | None | GET   | /v3/api-docs                 | Spring generated API Documentation  |
| API Doc | Swagger                   | None | GET   | /swagger-ui.html             | Swagger generated API Documentation |


# Build & Run

## Test
### JUnit Test
- If required change values in `src/test/resources/application.properties` 
- or pass as CLI parameters as below
    - You can pass multiple params `-Dprop1=val1 -Dprop2=val2` etc.

```
mvn test -Dprop1=val1
```

- To run single test with CLI params


```
mvn test -Dtest=fi.ishtech.springboot.controller.HomeControllerTest#testHome
```

### Local Build
### Build using Maven
- You can make build with or without running tests

```
mvn clean package -DskipTests=true
```

### Docker build
```
docker build -f Dockerfile . -t muneer2ishtech/ishtech_spring_boot_root:0.1.0-SNAPSHOT
```

## Local Run
### Run using Maven

- You can override AWS config properties using CLI params as below
    - AWS secretKey is must

```
mvn spring-boot:run
```

### Run using Jar
```
java -jar ishtech-spring-boot-root-0.1.0-SNAPSHOT.jar
```

## Docker Run
### Pull image
```
docker pull muneer2ishtech/ishtech_spring_boot_root:0.1.0-SNAPSHOT
```

### Run using already built / pulled Docker image
```
docker run -it \
 -e AWS_S3_REGION=eu-north-1 \
 -e AWS_S3_ACCESSKEY=TODO_PUT_AWS_ACCESS_KEY \
 -e AWS_S3_SECRETKEY=TODO_PUT_AWS_SECRET_KEY \
 -p 8080:8080 \
 muneer2ishtech/ishtech_spring_boot_root:0.1.0-SNAPSHOT
```

## cURL

```
curl --request GET --location 'http://localhost:8080/'
```
