# spring-boot-301-restaurant-project
This project contains configuration and microservices for restaurant project case study for spring boot 301.

## config-server
Spring cloud config server based microservice which provides provision to fetch configuration stored in github for all other microservices.

## restaurantsearchservice
Microservice which provides provision to search restaurants by name, cuisine, location, budget, rating, by item in the menu of restaurant or by restaurant ID.

## orderingservice
Microservice which provides provision to place order for a customer, update the order, get order details by ID, or cancel the order.

## Eureka Discovery
When a new server is provisioned it will communicate with the discovery server and register its address so that others can communicate with it.

## Gateway
A gateway server is an excellent application in microservice architecture as it allows all responses to originate from a single host. This will eliminate the need for CORS and give us a convenient place to handle common problems like authentication.

## kafka
Kafka is a distributed publish-subscribe messaging .Here we have used this for publishing and consuming messages.

## Resource Server
store user's data and http services which can return user data to authenticated clients. 

## Authorization Server
responsible for authenticating user's identity and gives an authorization token. This token is accepted by resource server and validate your identity.







**For more information on each of these components, please refer to README.md files of these component folders.**
