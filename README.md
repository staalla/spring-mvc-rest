# Spring MVC Rest 

Sample Spring MVC Rest api application. Creates a WAR file of the sample application. It can be used as a starter application for testing any spring MVC rest features, add on security or any other frameworks to play with.
 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

```sh
$ mkdir ~/spring && cd ~/spring
$ mkdir -p ~/spring/workspace
$ git clone https://github.com/staalla/spring-mvc-rest.git && cd spring-mvc-rest
```
Import the project into Eclipse to review and make any changes
```sh
$ mvn eclipse:eclipse
```

Deploy the war and note host:port (localhost:8380) and context root (rest) to test
```sh
$ mvn clean package
$ curl -X GET -H "Cache-Control: no-cache" "http://localhost:8380/rest/api/message
```

### Prerequisities

JDK1.7, Git, Maven, Eclipse

