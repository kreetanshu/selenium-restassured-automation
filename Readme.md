# Selenium & Rest Assured API Sample Projects

This repository contains sample projects demonstrating automated testing using **Selenium** for UI automation and **Rest Assured** for API testing. Each project includes example test cases to help you get started with automation frameworks in Java.

---

## Selenium Sample Project

**Selenium** is a popular tool for automating web browsers. The sample project includes:

- **Setup Instructions:** How to configure Selenium WebDriver.
- **Sample Test Cases:**
    - Launching a browser and navigating to a website.
    - Performing actions like clicking buttons, filling forms, and validating page content.
    - Assertions to verify expected outcomes.

**Technologies Used:**  
- Java  
- Selenium WebDriver  
- TestNG/JUnit (for test management)

---

## Rest Assured API Sample Project

**Rest Assured** is a Java library for testing RESTful APIs. The sample project includes:

- **Setup Instructions:** How to add Rest Assured dependencies.
- **Sample Test Cases:**
    - Sending GET, POST, PUT, DELETE requests.
    - Validating response status codes and response bodies.
    - Using JSON path for response assertions.
    - Chaining API requests (e.g., create, update, delete a resource).
    - Grouping and prioritizing tests using TestNG.

**Technologies Used:**  
- Java  
- Rest Assured  
- TestNG/JUnit

---

## Getting Started

1. Clone the repository.
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Install dependencies using Maven or Gradle.
4. Run the test cases using your test runner (TestNG or JUnit).

---

## Folder Structure

```
/selenium-sample/
    └── src/test/java/...
/restassured-sample/
    └── src/test/java/...
/api-sample/
    └── src/test/java/api/sampleDev/APITests.java
```

---

## Dockerize your project

Refer the [Dockerfile](/Dockerfile) for steps to containerize this project for CI/CD runs

```bash
docker build -t selenium-restassured-automation .
```


> **Important:**  
>In the below command passing docker bind mount `-v $PWD/docker-results:/app/target` flag is optional and should be used for local docker run, not for CI/CD. 

>The Docker bind mount volume approach is used for debugging. Passing the bind mount path with the `-v` flag copies the test results from the Docker container to your local machine.


```bash
docker run -v $PWD/docker-results:/app/target --rm selenium-restassured-automation
```

## Contribution

Feel free to fork the repository and submit pull requests for improvements or additional test cases.

---

## License

This project is licensed under the MIT License.
