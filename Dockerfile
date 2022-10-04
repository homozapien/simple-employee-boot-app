FROM openjdk:11
COPY ./target/employeebootapp.jar  .
CMD ["java", "-jar", "employeebootapp.jar"]
