FROM openjdk:17-jre
COPY *.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]