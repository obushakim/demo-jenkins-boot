FROM java:8-jdk-alpine
LABEL maintainer="yourname@youremail.com"
COPY target/demo-0.0.1-SNAPSHOT.jar /demo.jar
EXPOSE 8080
CMD ["java", "-jar", "demo.jar"]