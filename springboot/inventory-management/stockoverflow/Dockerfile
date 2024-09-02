FROM maven:3.9.8-eclipse-temurin-21-alpine AS build
COPY . .
RUN mvn clean install -DskipTests=true

FROM openjdk:21-jdk-oracle
WORKDIR /test_build
COPY --from=build /target/*.jar webservice.jar
EXPOSE 3943
ENTRYPOINT [ "java", "-jar", "/test_build/webservice.jar" ]