# Use the official maven/Java 11 image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.6.3-openjdk-11-slim AS build

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src


# Build a release artifact.
RUN mvn package -DskipTests

# Use OpenJDK to run the application
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar /app.jar

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]