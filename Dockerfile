FROM openjdk:8-jdk-alpine
MAINTAINER zahoruiroman@gmail.com
VOLUME /tmp
COPY target/taco-cloud-*-SNAPSHOT.jar tacocloud.jar
CMD [ "sh", "-c", "java -Dserver.port=$PORT -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /tacocloud.jar"]