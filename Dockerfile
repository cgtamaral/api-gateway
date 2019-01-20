FROM openjdk:8
ADD target/APIGateway.jar APIGateway.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar", "APIGateway.jar"]
