FROM openjdk:8-jdk-alpine
COPY target/DevoopsJenkinsDocker-0.0.1-SNAPSHOT.jar DevoopsJenkinsDocker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
CMD ["java","-jar","DevoopsJenkinsDocker-0.0.1-SNAPSHOT.jar"]
