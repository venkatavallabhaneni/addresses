FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} address.jar
ENTRYPOINT ["java","-jar","/address.jar"]