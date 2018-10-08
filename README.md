# Simple CRUD application with Springboot
This application allows user to perform CRUD operation to create, update and remove dishes from database. Amazon RDS was used as a database.

<h2> How to run </h2>
<li> Run SpringBootApplication Main class from IDE or run jar from terminal </li>
<li> Go to browser and type localhost:8080/dishes

<h2> REST Endpoint </h2>
<li> <code> curl localhost:8080/dishes </code> => to get all dishes </li>
<li> <code> curl localhost:8080/dishes/1 </code> => to get dish with id = 1 </li>
<li> <code> curl -X PUT -H "Content-Type: application/json" -d '{"id":"1", "name":"Fried chicken"}' "localhost:8080/dishes </code> => to update dish </li>
<li> <code> curl -X POST -H "Content-Type: application/json" -d '{"id":"2", "name":"Kimchi fried rice"}' "localhost:8080/dishes </code> => to insert new dish </li>
<li> <code> curl -X DELETE localhost:8080/dishes/1 </code> => to delete dish with id = 1 </li>

