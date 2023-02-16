FROM tomcat:9.0.71-jre11-temurin-focal
MAINTAINER SAGAR KUMAR
#EXPOSE 8080
#ENV url=jdbc:mysql://mysqldb-container:3306/food userName=root password=root

ADD FoodApp.war /usr/local/tomcat/webapps

CMD ["catalina.sh","run"]

