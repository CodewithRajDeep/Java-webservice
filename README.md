## Title: Java webservice 

## <a name="description">Description</a>
This project is a simple, scalable, and efficient Java-based RESTful web service built using Spring Boot and Spring.io frameworks. The primary objective of this service is to handle HTTP requests, process business logic, and return appropriate responses using REST API endpoints. The project is designed to demonstrate the best practices of RESTful service architecture and can be extended for a wide range of use cases, such as user management, e-commerce services, or microservice architecture.

  <div>
    <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white" alt="eclipse" />
    <img src="	https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="java" />
    <img src="https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white" alt="markdown" />
    <img src="https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white" alt="mongodb" />
  </div>



## 📋 <a name="table">Table of Contents</a>

1. 🤖 [Introduction](#description)
2. ⚙️ [Tech Stack](#tech-stack)
3. 🔋 [Features](#features)
4. 🤸 [Quick Start](#quick-start)
5. 🕸️ [Setup .env variables](#snippet)
6. ❄️ [Deployment](#deployment)



## <a name="tech-stack">⚙️ Tech Stack</a>

- SpringBoot
- Spring Web
- MySQL
- Maven
- Postman
- Java
- Pom.xml validation


## <a name="features">🔋 Features</a>

👉 **RESTful Endpoints** : Implements GET, POST, PUT, DELETE operations with standard REST conventions.

👉 **Service Layer** : Business logic is separated from controllers using the service layer.
👉 **Dependency Injection** : Utilizes Spring’s dependency injection to manage application components.
👉 **Exception Handling** : Global exception handling using @ControllerAdvice to manage error responses.
👉 **Database Integration**  (optional): Can interact with a relational database using Spring Data JPA and Hibernate ORM for persistence.
👉 **Modular and Scalable** : Can easily integrate additional Spring components like Spring Security, Spring Cloud, Spring Batch, or third-party services for more advanced functionality.


## <a name="quick-start">🤸 Getting Started </a>

1. **Clone the repository:**
   ```
   git clone [https://github.com/CodewithRajDeep/Java-webservice.git]
   ```
2. **Install all dependcies**
    ```
    cd your-project
    mvn clean install
    mvn spring-boot:run
    
    ```
3. **plugins installation**
     ```
      sprinboot.io
      apache tomact server v10.0
      springweb
      maven dependencies 
     ```
 4. By default, the service runs at[http://localhost:8080) with your  browser to see the result.

## Prerequisites:
 
   Make sure you have the following installed on your machine:

   - [Git](https://git-scm.com/)
   - [SpringBoot](https://spring.io/projects/spring-boot)
   - [Apache Tomcat server](https://tomcat.apache.org/tomcat-9.0-doc/config/index.html) (Server Manager)

 ## <a name="snippet"> Setup Environment Variable</a>
 Create a Spring Boot project using Spring Initializr:
1. Set up Spring Boot Project
     You can create a Spring Boot project using Spring Initializr:
   ```
   Visit start.spring.io.
   Choose the following options:
   Project: Maven Project
   Language: Java
   Spring Boot: (select latest stable version)
   Dependencies: Add the following:
    Spring Web
    Spring Boot DevTools (optional, for easier development)
    Lombok (optional, for reducing boilerplate code)
    Spring Data JPA (optional, if you need to use a database)
    H2 Database or MySQL Driver (if database integration is needed)
    Generate and download the project.
   ```
Unzip the downloaded project and open it in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
2. Create a REST Controller
```
<divide>  
 <summary><code>REST Controller</code></summary>
package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name;
      }
    }
</divide>
```

3. Run the Application: Once you have the basic structure in place, you can run the application:
 Using your IDE: Right-click on the main application class (annotated with @SpringBootApplication) and select Run.
 Using Maven: Open a terminal in your project folder and run:
 ```bash
Copy code
mvn spring-boot:run
The application will start up on port 8080 by default.

You can access your REST service by navigating to:

bash
Copy code
http://localhost:8080/hello/{name}
```
4. Create a service layer
```
   <divide>
   <section name="webservice">
     package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return greetingService.getGreeting(name);
    }
}
   </section>
</divide>
```
5. Test your web service
  ```
   <divide>
   <section name="test web service">
   package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void sayHelloTest() throws Exception {
        mockMvc.perform(get("/hello/John"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, John"));
    }
}

   </section>
   </divide>
   ```
6. Dependencies
   ```
   <divide>
   <section>
   <dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
    </dependency>
   </section>
   </divide>
   ```
## Contribution Guidelines: 
Guidelines for contributing to the project.

**Reporting Issues:**

Search for existing issues: Before creating a new issue, search the issue tracker to see if the problem has already been reported.
Provide clear and concise information: When creating a new issue, please include as much detail as possible, such as:
Clear description of the problem
Steps to reproduce the issue
Expected behavior
Actual behavior
Screenshots or logs (if applicable)
Use issue templates: If available, use the provided issue templates to structure your report.

**Submitting Pull Requests:**

Fork the repository: Create a fork of the project on your GitHub account.
Create a new branch: Create a new branch based on the main branch or a feature branch.
Make changes: Implement your changes and commit them with clear commit messages.
Push changes to your fork: Push your changes to your forked repository.
Open a Pull Request: Create a pull request from your branch to the main repository.
Provide details: Clearly describe the changes you've made and the benefits they bring.
Address code review feedback: Be open to feedback and make necessary changes.

**Testing:**

Write unit tests for any new features or bug fixes.
Ensure existing tests  pass after your changes.

## License
Issued : Copyright (c)| 2024 Deep Raj 

## Memes: 
<img src="https://i.gifer.com/origin/ea/ea04580a05ae61739fefe6b70f17a4c3.gif" width="256" height="256"/>
<img src="https://i0.wp.com/www.animefeminist.com/wp-content/uploads/2018/06/type-happy-dog-motivate.gif?fit=309%2C233&ssl=1" width="256" height="256"/>
<img src="https://i0.wp.com/www.animefeminist.com/wp-content/uploads/2018/06/pitch-baseball-explode-nichijou.gif?resize=500%2C281&ssl=1" width="256" height="256"/>

 

