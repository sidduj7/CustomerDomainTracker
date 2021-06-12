# CustomerDomainTracker
Springboot application
1.Save three kinds of products 
   Domian
   Hosting
  Pdomain
2)Taken save interface for saving data
     DomainService
  HostingService
   Pdomainervice
3)Created Save servicefactory for getting save service based on domain
4)Taken h2 in memory db for saving data
5)Used JPA for persistence
6)validating data for not null
7)Saving data as per logic
8)Added id column for customer entity for saving as no unique identity is provided for retrieving data.
9)Save api service will return all entries from db after saving data.
10) findByEmailSchedule api will retrieve all data with sort on emaildate.
  
http://localhost:8080/customer/save
{
	"customerId":"Cust1234",
	"productName":"hosting",
	"domain":"ccc.com",
	"duration":"12",
	"startDate":"2020-01-01"
	
}

output:
[
    {
        "id": 1,
        "customerId": "Cust1234",
        "productName": "hosting",
        "domain": "ccc.com",
        "duration": "12",
        "startDate": "2020-01-01",
        "emailDate": "2020-12-29"
    },
    {
        "id": 2,
        "customerId": "Cust1234",
        "productName": "hosting",
        "domain": "ccc.com",
        "duration": "12",
        "startDate": "2020-01-01",
        "emailDate": "2020-01-02"
    }
]

http://localhost:8080/customer/findByEmailSchedule

[
    {
        "id": 4,
        "customerId": "Cust1234",
        "productName": "hosting",
        "domain": "ccc.com",
        "duration": "12",
        "startDate": "2020-01-01",
        "emailDate": "2020-01-02"
    },
    {
        "id": 1,
        "customerId": "Cust2345",
        "productName": "pdomain",
        "domain": "xxx.com",
        "duration": "12",
        "startDate": "2020-01-01",
        "emailDate": "2020-12-23"
    },
    {
        "id": 3,
        "customerId": "Cust1234",
        "productName": "hosting",
        "domain": "ccc.com",
        "duration": "12",
        "startDate": "2020-01-01",
        "emailDate": "2020-12-29"
    },
    {
        "id": 2,
        "customerId": "Cust2345",
        "productName": "pdomain",
        "domain": "xxx.com",
        "duration": "12",
        "startDate": "2020-01-01",
        "emailDate": "2020-12-30"
    }
]