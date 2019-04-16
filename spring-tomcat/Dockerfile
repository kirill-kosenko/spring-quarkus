FROM oracle/graalvm-ce:1.0.0-rc14
WORKDIR /
ADD /target/spring-tomcat-test-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]