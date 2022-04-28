FROM openjdk:11
ADD target/KafkaProducer.jar KafkaProducer.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/KafkaProducer.jar"]