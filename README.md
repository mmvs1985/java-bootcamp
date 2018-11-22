# Welcome to the Java Bootcamp for future Globers!

Please, use this repository as a base for your training. 
The idea is to fork this project so everyone use the same folder structure for the exercises.

# Material
  
## Index

1. [Objective](#objective)

2. [Who Should Attend](#who-should-attend)

3. [Duration](#duration)

4. [Technical Assistance](#technical-assistance)

5. [Performance Measurement](#performance-measurement)

6. [Materials](#materials)

7. [General Guidelines](#general-guidelines)

8. [Proposed Test Application](#proposed-test-application)

9. [Learning Days](#learning-days)

    * [Topic 0: Introduction to Object Oriented Programming Concepts (OOP)](#topic-0-introduction-to-object-oriented-programming-concepts)

    * [Topic 1: Maven](#topic-1-maven)

    * [Topic 2: Services](#topic-2-services)
    
    * [Topic 3: Unit Testing](#topic-3-unit-testing)

    * [Topic 4: SQL - MySql](#topic-4-sql---mysql)
    
    * [Topic 5: Spring (Core, Boot) and Swagger](#topic-5-spring-core-boot-and-swagger)

10. [Your First Project Starts Now!](#your-first-project-starts-now)

## Objective

This course teaches the basics of Java development and the tools and frameworks that surround it.

→ [index](#index)

## Who Should Attend

The training will start at a low level and does not require in depth knowledge of the platform in question. Desirable participant profile: outside Globant candidates with a basic knowledge on OOP and a lot of energy!

→ [index](#index)

## Duration

Four weeks total, where we are going to mix reading, coding practice, chat discussions and on-site talks. The target is, after 4 weeks of all this, each candidate would have a final project up and running. 

→ [index](#index)

## Technical Assistance

You can contact other bootcamp participants or any available tutor if you need technical assistance. We will have a chat room to discuss all together.

→ [index](#index)

## Performance Measurement

When you feel like you are good to go with a practice code, let tutors know and ask for review. This is to avoid getting to the very end of the training with no feedback. The idea is to keep things going dinamically, and being constantly in contact. 

→ [index](#index)


## Materials

1. Install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

2. The IDE to use is [Eclipse for Java Developers](http://www.eclipse.org/downloads/). [
Eclipse IDE for Java EE Developers Recommended](http://www.eclipse.org/downloads/packages/).

3. Slack java-bootcamp-globers account

4. Create your own [GitHub](https://github.com/) account. Follow this [guideline](https://help.github.com/articles/set-up-git) to setup your account. Also you can read further about Git in [Try Git](https://try.github.io/levels/1/challenges/1) or [Learn Git Branching](http://pcottle.github.io/learnGitBranching/)

5. Fork this repo https://github.com/marcelorosas/java-bootcamp/ to use as a base to host the project code. Read [this](https://help.github.com/articles/fork-a-repo/) for instructions.

→ [index](#index)

 

## General Guidelines

The bootcamp is organized in the following way:

each bootcamper needs to read about the topics and jump into the coding excercises. Slack channel will be used to discuss with tutors and co-bootcampers about both theory and practice, and each on-site talk we are going to go through the outcome of Slack channel discussions, emphasizing about those topics that are causing more pain for all.

This slack account would be used for technical assistance: https://java-bootcamp-globers.slack.com

    Bootcamp Java Globant Uruguay - #general
Every person participating in the bootcamp is present here (students and tutors). Here is the place to ask for technical assistance!

[Team play](http://www.dummies.com/how-to/content/ten-qualities-of-an-effective-team-player.html) is encouraged but the work will be evaluated per person.

The instructions will be vague as they generally are in real life projects. You must look for support and guidance from your tutor and teammates.

All code and documentation must be in English.

Code needs to be clear and indented properly. You can adhere to this [eclipse code formatter](https://github.com//sebastian-garofalo/java-bootcamp/blob/master/formatter.xml). See importing instructions in this [link](http://www.avajava.com/tutorials/lessons/how-do-i-share-my-code-formatting-settings-with-another-user.html?page=2).

→ [index](#index)

## Proposed Test Application

The test application will consist in a REST API for a functional shopping cart. It should include as much as you can on this feature list:

  - List products.
  - Find products by category and name.
  - Save cart before buy.
  - Buy products.


## Learning Days

Each day you will grab the fundamentals of the key building blocks for usual Java applications.

On each learning day you will have to:

1. ####Read:####
We will provide you with documentation so you can have a background reference, guide and examples to complete the following practice.

2. ####Practice:####
You will implement the previously gathered knowledge in simple coding activities. You will do the effort to have the best results and be ready to apply this knowledge in the final project. Each of this steps are not going to be evaluated though, it's the learning mechanism to get the bests results at the end of the training.

3. ####Commit:####
You will commit all your code as soon as you finish your practice. No rush, but ideally enough commits to have questions to discuss through slack and for the next talk.

### Introduction

  - [JVM](http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html#t1s1). See: "Java Technology and the JVM"

# Topic 0: Introduction to Object Oriented Programming Concepts

## Reading:

1. Java Concepts [basic tutorial](http://docs.oracle.com/javase/tutorial/java/concepts/)

2. Have fun with [Introduction to Java Programming](http://www.ibm.com/developerworks/java/tutorials/j-introtojava1/). Do as much as you want.

3. Explore [Design Patterns](http://www.avajava.com/tutorials/categories/design-patterns). Don't go crazy on this reading, the idea is to know they exist, and when we discuss about them, we'll see why they exist. Examples are singleton, factory, abstract factory, strategy, template method, proxy, decorator and builder, but there are zillions, so take it easy.

## Extra documentation:

* [Design Patterns Card](http://www.mcdonaldland.info/files/designpatterns/designpatternscard.pdf)


## Practice:

1. Create a singleton example for a database connection.
2. Create a abstract factory example for diferent type of SQL connections. See [this](http://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm) example 
3. Create a proxy example for database accesor clases.
4. Create a builder example for database connection.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Topic 1: Maven

## Reading:
1. [What is Maven?](http://maven.apache.org/what-is-maven.html)

2. Have fun with [Maven in 5 minutes](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html). 

3. Maven: [best practices](http://books.sonatype.com/mvnref-book/reference/pom-relationships-sect-pom-best-practice.html)

## Practice:

(It is assumed that Maven is already installed and working).

1. Create and build a simple Maven project.
2. Customize the Maven project by adding new dependencies: log4j, junit.
3. Create a simple unit test under src/test/java and run it. Then skip the unit test by property or by adding the skipping test configuration to your pom.xml file.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Topic 2: Services

## Reading:
1. [How to design a good API and why it matters](https://www.youtube.com/watch?v=aAb7hSCtvGw)

2. [Introduction to REST](https://www.youtube.com/watch?v=YCcAE2SCQ6k)

## Practice: create a shopping cart API spec by

 1. Using GET, POST, PUT and DELETE HTTP methods
 2. Defining the URL for each request
 3. Defining the corresponding headers
 4. Defining the corresponding payload for each request and response

## Commit:

Commit your practice results (just a single text file with the design)

→ [index](#index)


# Topic 3: Unit Testing

## Reading:
1. [Benefits of Unit Testing](https://dzone.com/articles/top-8-benefits-of-unit-testing)
2. [JUnit](https://junit.org/junit4/cookbook.html)
3. [Mockito](https://site.mockito.org/)
4. [Difference Between Mocks and Stubs](https://martinfowler.com/articles/mocksArentStubs.html)
5. [Optional, good to know its existence though] [Test Driven Development](http://technologyconversations.com/2013/12/24/test-driven-development-tdd-best-practices-using-java-examples-2/)

## Practice:

1. Implements all unit test cases in JUnit for the services methods implemented in the previous topic.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)


# Topic 4: SQL - MySql

## Reading:
1. [MySql basis](http://www.vogella.com/tutorials/MySQL/article.html)
2. [SQL Joins](https://blog.codinghorror.com/a-visual-explanation-of-sql-joins/)
3. [Jdbc basis](http://www.vogella.com/tutorials/MySQLJava/article.html#jdbc)

## Extra documentation:

1. [Optimizaciones en MySql](http://www.arsys.info/programacion/bases-de-datos/como-optimizar-bases-de-datos-mysql/)


## Practice:
Do not solve the practice using JDBC, please just send us the sql scripts.

1. Create a database named 'high-school' and modelate:
 
   - Student: first name, last name, registration number, date of birth)
   - Teacher: first name, last name, date of birth)
   - Course: name, assigned teacher, hours by week, schedule time (they can be dictated several times during the week)

   Notes:
   - An student can assist several courses during the same year.
   - A teacher can be assigned to several courses.
   - For each course, each student has 3 partial notes and a final note.
   - Create all relationship that you think they are required.

2. Insert information for 3 teachers, 3 courses and 10 students per course.
3. List students and teachers for a given course. The output format should be:

        Course: <course-name>
        Teacher: <last-name>, <first-name>
        Students:
          <last-name>, <first-name> (ordered by alphabetically by last name)

4. Percentage of students that passed/failed a given course.
5. For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name. The format should be:

        Teacher: <last-name>, <first-name>
        Schedule:
          Monday 09:00 - 11:00: <course-name>
          Monday 15:00 - 17:30: <course-name>
          Friday 08:45 - 10:40: <course-name>

6. Identify and Optimize all queries.
7. Connect to MySQL using Java JDBC and perform the query you have developed in excercise 5.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Topic 5: Spring (Core, Boot) and Swagger

## Reading:

1. [Spring Framework Fundamentals](https://www.journaldev.com/2888/spring-tutorial-spring-core-tutorial)

2. [Spring Framework Projects](https://www.baeldung.com/org-springframework)

3. [Spring Boot Introduction](https://www.baeldung.com/spring-boot-start)

4. [Building Rest Services With Spring - Practical Tutorial](http://spring.io/guides/tutorials/bookmarks/)

5. [REST API documentation with Swagger](http://swagger.io/getting-started/)
  
## Practice: 

1. Expose the shopping cart created in the topic 3.
2. Write the swagger file.
3. Create and document with swagger a REST API to register users. The API must provide: add, delete, update, find by name and find by nickname operations. Note that the username must be unique.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Your First Project Starts Now!

# Final Project
Create a functional shopping cart (just REST api). Ideally, features completed are:

  - Find products by category and name.
  - Save Cart.
  - Buy products.

The solution must use MySql as repository as well as Spring Boot and swagger for REST documentation.

Optional: Implement an endpoint that returns products recomendation taking into accuont previous orders.

Thanks for reading!

→ [index](#index)
