```

docker build -t app .
docker run -itd -p 8080:8080 app
```


```
docker-compose down
docker-compose up -d
```




```

docker run --name mysqldb-container -p 3307:3306 -e MYSQL_ROOT_PASSWORD=123 -d mysql 

```
```
mysql --protocol=tcp -hlocalhost -P3307 -uroot -proot
```



```
version: '3.9'

services:
  web:
    image: "sagarkumar99/foodapp:latest"
    ports:
      - "8081:8080"



```



```
version: '3.9'

services:
  web:
    build: .
    ports:
      - "8081:8080"



```


```

FROM tomcat:9.0.71-jre11-temurin-focal
MAINTAINER SAGAR KUMAR
EXPOSE 8080

ADD FoodApp.war /usr/local/tomcat/webapps

CMD ["catalina.sh","run"]

```
