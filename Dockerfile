FROM openjdk:latest
COPY ./target/classes/coursework /Main
WORKDIR /tmp
ENTRYPOINT ["java", "coursework.Main"]