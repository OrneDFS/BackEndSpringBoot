
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM FROM openjdk:1.8
MAINTAINER OrneDesFS
COPY target/OrneDesFS-0.0.1-SNAPSHOT.jar OrneDesFS-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/OrneDesFS-0.0.1-SNAPSHOT.jar"]


#CMD ["/bin/sh"]

#COPY . /usr/src/myapp
#ORKDIR /usr/src/myapp
#RUN javac Main.java
#CMD ["java", "Main"]