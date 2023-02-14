FROM tomcat:9.0-alpine
MAINTAINER SAGAR KUMAR
EXPOSE 8080

ADD FoodApp.war /usr/local/tomcat/webapps

CMD["catalina.sh","run"]
