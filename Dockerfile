#Using the latest version of openjdk
FROM openjdk:latest
COPY ./target/sem-coursework.jar /tmp
WORKDIR /tmp
#Run the main application
ENTRYPOINT ["java", "-jar", "sem-coursework-.jar"]