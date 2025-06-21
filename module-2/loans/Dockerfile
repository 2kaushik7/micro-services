#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="2kaushik7"

# Add the application's jar to the image
COPY target/loans-1.0.jar loans-1.0.jar

EXPOSE 8090

# execute the application
ENTRYPOINT ["java", "-jar", "loans-1.0.jar"]