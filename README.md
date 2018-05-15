# spring-cloud-config-server-issue

### In one terminal
```
cd configserver
./mvnw spring-boot:run
```

### In another terminal
```
cd democlient
./mvnw spring-boot:run
```

The client will print:
```
2018-05-15 13:28:45.460  INFO 23725 --- [           main] c.e.democlient.DemoclientApplication     : prop.cipher: Overriden, Hooray!!!
2018-05-15 13:28:45.460  INFO 23725 --- [           main] c.e.democlient.DemoclientApplication     : prop.plain: I still exist but should have been overriden :(
```
