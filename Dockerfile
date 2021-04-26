FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/app.jar /app/app.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar","./app.jar"]