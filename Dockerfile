FROM openjdk:17-alpine
COPY ./target/sabah-state-library-0.0.1-SNAPSHOT.jar sabah-state-library-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/sabah-state-library-0.0.1-SNAPSHOT.jar"]