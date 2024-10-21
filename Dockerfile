
FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
# Use the official Java image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/banking-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080 22

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

