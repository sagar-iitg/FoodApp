FROM tomcat:9.0-alpine
MAINTAINER SAGAR KUMAR
EXPOSE 8080
ADD project.war /usr/local/tomcat/webapps
CMD["catlina.sh","run"]
