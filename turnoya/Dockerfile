FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia todos los archivos del proyecto dentro de la imagen
COPY . .

# Da permisos al wrapper de Maven para poder compilar
RUN chmod +x mvnw

# Compila el proyecto y genera el jar
RUN ./mvnw -q -DskipTests=true package

# Expone el puerto usado por la app
EXPOSE 8080

# Ejecuta el jar generado
CMD ["java", "-jar", "target/turnoya-0.0.1-SNAPSHOT.jar"]
