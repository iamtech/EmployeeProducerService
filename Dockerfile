FROM java:8
VOLUME /tmp
ADD target/EmployeeProducerService-0.0.1-SNAPSHOT.jar EmployeeProducerService.jar
RUN bash -c 'touch /EmployeeProducerService.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /EmployeeProducerService.jar"]