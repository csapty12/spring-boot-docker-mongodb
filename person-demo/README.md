# Person Demo
## Purpose
This project should be used as a boilerplate project, which contains the following features:

* A controller class to perform create operations on the Person Objects
    * Save a new person to the database

## Database
This boilerplate makes use of a dockerised `mongo` instance at port `27017`.
This boilerplate also make use of a dockerised `mongo-express` instance at port `8081`. TLDR; Mongo-express provides a UI
for MongoDB.

#### *Credentials*
As this is a boilerplate application, credentials are as follows:
`docker-compose.yml`
```
MONGO_INITDB_ROOT_USERNAME = root
MONGO_INITDB_ROOT_PASSWORD = password

ME_CONFIG_MONGODB_ADMINUSERNAME= root
ME_CONFIG_MONGODB_ADMINPASSWORD= example
```
`application.properties`
```
spring.data.mongodb.authentication-database=admin
spring.data.mongodb.username=root
spring.data.mongodb.password=example
```
*NOTE*: if you make change the credentials to the `docker-compose.yml` credentials, you need to also update the `application.properties`
mongodb username and password. 

  
    