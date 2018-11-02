# Simple CRUD application with Springboot
This application allows user to perform CRUD operation to create, update and remove dishes from database. Amazon RDS was used as a database.

## How to run
- Run `SpringBootApplication Main` class from IDE or run `mvn spring-boot:run` from terminal
- Go to browser and type `localhost:8080/dishes`

## REST Endpoint
- `curl localhost:8080/dishes` => to get all dishes 
- `curl localhost:8080/dishes/1` => to get dish with id = 1
- `curl -X PUT -H "Content-Type: application/json" -d '{"id":"1", "name":"Fried chicken"}' "localhost:8080/dishes` => to update dish
- `curl -X POST -H "Content-Type: application/json" -d '{"id":"2", "name":"Kimchi fried rice"}' "localhost:8080/dishes` => to insert new dish
- `curl -X DELETE localhost:8080/dishes/1` => to delete dish with id = 1
