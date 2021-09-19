FROM gcr.io/distroless/java-debian10:11

COPY build/libs/grpc-http-0.0.1-SNAPSHOT.jar server.jar
EXPOSE 8080
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "server.jar"]