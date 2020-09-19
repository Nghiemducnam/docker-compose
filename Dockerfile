FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-compose.jar
ENTRYPOINT ["java","-jar","/docker-compose.jar"]

#ENV JDBC_DATABASE_URL=jdbc:'mysql://localhost:3306/compose-data?createDatabaseIfNotExist=true'
#ENV JDBC_DATABASE_USERNAME=root
#ENV JDBC_DATABASE_PASSWORD=123456
#ENV JDBC_DATABASE_DRIVER=com.mysql.cj.jdbc.Driver
#ENV SPRING_JPA_HIBERNATE_DIALECT=org.hibernate.dialect.MySQL8Dialect
