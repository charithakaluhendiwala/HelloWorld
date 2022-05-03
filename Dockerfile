FROM openjdk:latest
VOLUME /tmp
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8081 