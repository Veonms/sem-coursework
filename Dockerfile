FROM openjdk:latest
COPY ./target/classes/coursework/Main.class
WORKDIR /tmp
ENTRYPOINT ["java", "coursework.Main"]
