# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory to the container
COPY target/PhoneValidation-1.0-SNAPSHOT.jar /app/PhoneValidation.jar

# Expose port 8080 for the Spring Boot application
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/PhoneValidation.jar"]

