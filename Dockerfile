FROM eclipse-temurin:25-jre-alpine-3.23
LABEL authors="Porado"
WORKDIR /app
COPY build/libs/*.jar /app/server.jar
ENTRYPOINT ["java", "-jar", "/app/server.jar"]
EXPOSE 8080