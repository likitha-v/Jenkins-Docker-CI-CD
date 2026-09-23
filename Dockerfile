
FROM jenkins-java21-base:local
WORKDIR /app
COPY target/maven-webapp-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
