FROM openjdk:21

ENV FI_ISTECH_FILES_LOCAL_ROOT-FOLDER=/tmp

EXPOSE 8080

COPY target/ishtech-spring-boot-root-0.1.0-SNAPSHOT.jar ishtech-spring-boot-root.jar

ENTRYPOINT ["java","-jar","/ishtech-spring-boot-root.jar"]
