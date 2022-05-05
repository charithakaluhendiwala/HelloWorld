FROM openjdk:latest
VOLUME /tmp
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar target/app.jar
ENTRYPOINT ["java","-jar","/HelloWorld-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
