# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/dockerapplogs-0.0.1-SNAPSHOT.jar /app/

# Specify the command to run on container start
CMD ["java", "-jar", "dockerapplogs-0.0.1-SNAPSHOT.jar"]