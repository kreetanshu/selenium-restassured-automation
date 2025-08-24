FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Install Chrome
RUN apt-get update && \
    apt-get install -y wget gnupg2 && \
    wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list && \
    apt-get update && \
    apt-get install -y google-chrome-stable && \
    rm -rf /var/lib/apt/lists/*

COPY . .

#RUN mvn clean package -DskipTests

# If you want a smaller runtime image, you can use a multi-stage build:
#FROM openjdk:17-jdk-slim

#WORKDIR /app

#COPY --from=build /app/target/*.jar app.jar

CMD ["mvn", "test"]