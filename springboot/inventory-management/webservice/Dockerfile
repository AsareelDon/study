FROM maven AS build
COPY . .
RUN mvn clean install -Dmaven.test.skip=true -q

FROM alpine
WORKDIR /app
RUN apk add --no-cache openjdk17-jdk
COPY --from=build /target/*.jar testapp.jar
EXPOSE 5000
ENTRYPOINT [ "java", "-jar", "/app/testapp.jar" ]