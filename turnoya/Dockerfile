# Usa una versión válida de JDK 17
FROM eclipse-temurin:17-jdk

# Directorio de la app
WORKDIR /app

# Copia el jar generado por Maven
COPY target/turnoya-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080
EXPOSE 8080

# Comando para correr la app
ENTRYPOINT ["java","-jar","app.jar"]
