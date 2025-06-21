#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="2kaushik7"

# Add the application's jar to the image
COPY target/accounts-1.0.jar accounts-1.0.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-1.0.jar"]