
```
docker run --rm --name db -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root mysql
```

```
docker build -t food . 
```

```
docker run --rm --name linkcontainer -d -p 8080:8080 --link db food
```


```
docker-compose down
docker-compose up -d
```
