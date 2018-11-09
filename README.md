# Example of Screenplay-rest
## Consuming a SOAP and Rest web service with Screenplay-rest
Project where the used of the serenity screenplay pattern with cucumber and gradle for testing rest API and SOAP API. 

For this automation the services exposed by <https://www.reqres.in/> (Rest) and <http://www.thomas-bayer.com/axis2/services/BLZService?wsdl/> (SOAP) are used.

The application was built with the following tools and languages:

* Java 8
* Gradle 4.5.1

To clone the repository:
```
git clone https://github.com/cedaniel200/rest-api-screenplay.git
```

To compile
```
gradle clean build -x test
```

To run the tests and generate the report of serenity bdd
```
gradle test aggregate
```