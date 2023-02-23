FROM openjdk

MAINTAINER Berk Ozmen <berkozmen94@hotmail.com>
EXPOSE 8085
ADD target/ProductService-0.0.1-SNAPSHOT.jar ProductService.jar

ENTRYPOINT ["java","-jar","ProductService.jar"]

## Dockerizing the app
#
# Create a Spring Boot Application
# Create Dockerfile
# Build executable jar file - mvn clean package
# Build Docker image - docker build -t airport-reservation-app:v1 .
# Run Docker container using the image built - docker run --name airport-reservation-system -p 8080:8080 airport-reservation-applicaiton:v1
# Test

