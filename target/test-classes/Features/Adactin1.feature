Feature: Verifying the Adactin Hotel Booking Application

Scenario Outline: Checking the functionalities of the Adactin application

Given User is in the Adactin login page
When User enter the "<username>" and "<password>"
Then User can click the Login button
Given User is in the Search hotel page and user should select the location, hotel, room type and number of rooms
When User enter the "<checkin>" and "<checkOut>" date
And User select the Adult and Children per room
Then User can click the Search button
Given User is in select hotel page and user should select the hotel and click Continue button
Given User is in Book hotel page and user should enter the "<firstName>", "<lastName>", "<address>" and "creditCardNo"
And User should select credit card type and expiry date
When User should enter the "<cvvNo>"
Then User can click the Book Now button
When User is in booking confirmation page, User should get the orderId
Then User should click the search hotel option

Examples: 

|username|password|checkin|chekOut|firstName|lastName|address|creditCardNo|cvvNo|
|SridharGs|zxcvbnm|25/08/2020|26/08/2020|Sri|Seenu|Chennai|1234567891234567|123| 

@Sanity
Scenario Outline: Booking 8 more hotels

Given User is in the Search hotel page and user should select the location, hotel, room type and number of rooms
When User enter the "<checkin>" and "<checkOut>" date
And User select the Adult and Children per room
Then User can click the Search button
Given User is in select hotel page and user should select the hotel and click Continue button
Given User is in Book hotel page and user should enter the "<firstName>", "<lastName>", "<address>" and "creditCardNo"
And User should select credit card type and expiry date
When User should enter the "<cvvNo>"
Then User can click the Book Now button
When User is in booking confirmation page, User should get the orderId
Then User should click the search hotel option

Examples:  

|checkin|chekOut|firstName|lastName|address|creditCardNo|cvvNo|
|25/08/2020|26/08/2020|Ram|S|Chennai|1234567891234567|123| 
|25/08/2020|26/08/2020|Sam|Q|Erode|1234567891234567|123|
|25/08/2020|26/08/2020|Ren|W|Coimbtore|1234567891234567|123|
|25/08/2020|26/08/2020|Ken|E|Gobi|1234567891234567|123|
|25/08/2020|26/08/2020|Zoi|T|Adayar|1234567891234567|123|
|25/08/2020|26/08/2020|Qin|Y|Salem|1234567891234567|123|
|25/08/2020|26/08/2020|Siv|E|Sathy|1234567891234567|123|
|25/08/2020|26/08/2020|Fin|U|Ooty|1234567891234567|123|

@Smoke
Scenario Outline: Booking 1 more hotel

Given User is in the Search hotel page and user should select the location, hotel, room type and number of rooms
When User enter the "<checkin>" and "<checkOut>" date
And User select the Adult and Children per room
Then User can click the Search button
Given User is in select hotel page and user should select the hotel and click Continue button
Given User is in Book hotel page and user should enter the "<firstName>", "<lastName>", "<address>" and "creditCardNo"
And User should select credit card type and expiry date
When User should enter the "<cvvNo>"
Then User can click the Book Now button
When User is in booking confirmation page, User should get the orderId
Then User should logout the application

Examples:
 
|checkin|chekOut|firstName|lastName|address|creditCardNo|cvvNo|
|25/08/2020|26/08/2020|Lis|K|Tirupur|1234567891234567|123|


