#FROM hotswapagent/hotswap-vm
FROM oracle/graalvm-ce:1.0.0-rc14
#FROM adoptopenjdk/openjdk9-openj9:latest
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
