FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} addresses.jar
ENTRYPOINT ["java","-jar","/addresses.jar"]