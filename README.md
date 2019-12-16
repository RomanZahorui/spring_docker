# Spring/Docker/Heroku:
Required: Heroku CLI, Docker


## Dockerfile
  ```bash 
  FROM openjdk:8-jdk-alpine
  MAINTAINER zahoruiroman@gmail.com
  VOLUME /tmp
  COPY target/taco-cloud-*-SNAPSHOT.jar tacocloud.jar
  CMD [ "sh", "-c", "java -Dserver.port=$PORT -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /tacocloud.jar"]
```
#### Create an image
```bash
1. docker build -t taco .
```
#### Create a new heroku project
```bash
2. heroku create taco-service
```

#### Set container to the project stack
```bash
3. heroku stack:set container --app taco-service
```

#### Login container to heroku
```bash
4. heroku container:login
```

#### Create a new image based on taco
```bash
5. docker tag taco registry.heroku.com/taco-service/web
```

#### Push to the heroku project
```bash
6. docker push registry.heroku.com/taco-service/web
```

#### Run the application on heroku
```bash
7. heroku container:release web -a taco-service
```

#Links

https://devcenter.heroku.com/articles/container-registry-and-runtime

https://blog.codecentric.de/en/2019/08/spring-boot-heroku-docker-jdk11/

https://medium.com/@urbanswati/deploying-spring-boot-restapi-using-docker-maven-heroku-and-accessing-it-using-your-custom-aa04798c0112