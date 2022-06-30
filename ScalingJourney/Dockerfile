FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} firstdockerapp.jar
ENTRYPOINT ["java","-jar","/firstdockerapp.jar"]