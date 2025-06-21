#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="2kaushik7"

# Add the application's jar to the image
COPY target/cards-1.0.jar cards-1.0.jar

EXPOSE 9000

# execute the application
ENTRYPOINT ["java", "-jar", "cards-1.0.jar"]