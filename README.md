# SpringbootCustomLogWriter
A simple springboot custom logwriter based on log4j2 and spring boot default logging which provides descriptive logging for development and debugging logs

## Features
- Simple & Easy to use, improves productivity.
- No need to create Logger instances seperatly in every class.
- Custom log format to log all the necessary infomation of log which helps in debugging.<br>
![alt text](https://github.com/manojnanjundaswamy/Docs/blob/main/CustomLogWriter/Console_logs.PNG?raw=true)
-- Informations like Timestamp, Hostname, Application name, Module name, Qualified class name, Log level, message or error. 
- Environment specific logging (Dev, Test, Production).<br>
![alt text](https://github.com/manojnanjundaswamy/Docs/blob/main/CustomLogWriter/envSpecificConfiguration.PNG?raw=true)
- Option to log in .log/.json files.<br>
![alt text](https://github.com/manojnanjundaswamy/Docs/blob/main/CustomLogWriter/FileLogs.PNG?raw=true)
- Option to log in Kafka topic if required.

## Prerequisites
- Java - JDK 1.8 or above
- STS/Eclipse
- Tomcat in case of Eclipse

## Running the application
- Check out the source code
- Open STS or Eclipse
- Import as existing maven project
- Run as spring-boot application or run on tomcat server
- Use Browser or Postman to hit "localhost:8080/CustomLogWriter/testLogger" request to test the logging
- Experiment by changing app environment in application.properties and do update "APP_LOG_ROOT_DIR" in respected .xml to log using file in specified directory 

