#Using the latest version of openjdk
FROM openjdk:latest
COPY ./target/sem-coursework-0.1.0.3-jar-with-dependencies.jar /tmp
WORKDIR /tmp
#Run the main application
ENTRYPOINT ["java", "-jar", "sem-coursework-0.1.0.3-jar-with-dependencies.jar"]