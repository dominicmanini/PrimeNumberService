

# Prime Number Calculator

## Description
This RESTful service calculates and returns, with a valid JSON, all prime numbers up to and including a provided number.  

## Features
- Calculate all prime numbers up to a given input.
- Has an option to choose via which method the numbers are generated, either via a brute force or a more efficient recursive algorithm.
- Built with Spring Boot, and uses Maven to build, test and run the application.

## Installation
1. Ensure you have Java JDK 17 or higher and Maven installed
2. Clone this repository and open it in your IDE of choice, this project was created in IntelliJ.
3. <p>From the IDE terminal, verify Maven is installed with the command " mvn --version". <br> This should return something similar to the following: "Apache Maven 3.9.8 (36645f6c9b5079805ea5009217e36f2cffd34256) </br>
    <br>Maven home: C:\Program Files\apache-maven-3.9.8</br>
    <br>Java version: 17.0.12, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-17</br>
    <br>Default locale: en_GB, platform encoding: Cp1252</br>
    <br>OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"</br></p>
4. Once verified, enter the command "mvn clean compile"
5. Run the application
6. To test, visit the following link in your browser of choice: http://localhost:8080/primes/197/BRUTE_FORCE
7. <p>By adjusting the paramters in the format http://localhost:8080/primes/ <b>{NUMBER}/{ALGORITHM} </b>, you are able to generate the desired outcome. <br><b>N.B. The options for algorithm are either BRUTE_FORCE OR RECURSIVE</b><br></p>
8. <p>Further Examples:  <br>http://localhost:8080/primes/19/BRUTE_FORCE</br><br>http://localhost:8080/primes/301/RECURSIVE</br></p>
   
