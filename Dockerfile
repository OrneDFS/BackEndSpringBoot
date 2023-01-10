


FROM FROM openjdk:8-jdk-alpine
MAINTAINER OrneDesFS
COPY target/OrneDesFS-0.0.1-SNAPSHOT.jar OrneDesFS-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/OrneDesFS-0.0.1-SNAPSHOT.jar"]


#CMD ["/bin/sh"]

#COPY . /usr/src/myapp
#ORKDIR /usr/src/myapp
#RUN javac Main.java
#CMD ["java", "Main"]