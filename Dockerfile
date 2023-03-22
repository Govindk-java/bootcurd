FROM openjdk:19
COPY target/bootcurd-0.0.1-SNAPSHOT.jar /user/app
WORKDIR user/app
ENTRYPOINT ["java", "jar", "bootcurd-0.0.1-SNAPSHOT.jar"]