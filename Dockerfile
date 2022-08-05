FROM openjdk:11
ADD target/demo3-0.0.1-snapshot.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

#ARG JAR_FILE=demo3-0.0.1-snapshot.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","app.jar"]
