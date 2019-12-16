# spring_docker
Required: Heroku CLI, Docker

## Spring/Docker/Heroku:

## Dockerfile
  ```bash FROM openjdk:8-jdk-alpine
  MAINTAINER zahoruiroman@gmail.com
  VOLUME /tmp
  COPY target/taco-cloud-*-SNAPSHOT.jar tacocloud.jar
  CMD [ "sh", "-c", "java -Dserver.port=$PORT -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /tacocloud.jar"]
```
### Create an image
1. docker build -t taco .

### Create a new heroku project
2. heroku create taco-service

### Set container to the project stack
3. heroku stack:set container --app taco-service

### Login container to heroku
4. heroku container:login

### Create a new image based on taco
5. docker tag taco registry.heroku.com/taco-service/web

### Push to the heroku project
6. docker push registry.heroku.com/taco-service/web

### Run the application on heroku
7. heroku container:release web -a taco-service
