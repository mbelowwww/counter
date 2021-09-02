FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=build/libs/counter-application.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "app.jar"]