FROM tomcat:9.0.71-jre11-temurin-focal
MAINTAINER SAGAR KUMAR
EXPOSE 8080

ADD FoodApp.war /usr/local/tomcat/webapps

CMD ["catalina.sh","run"]
