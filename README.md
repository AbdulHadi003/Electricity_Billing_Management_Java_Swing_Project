# ABSTRACT
Electricity consumers are often faced with the problem of inaccuracy and delay in monthly billing due to some drawbacks. Thus, it is essential to have an efficient system for such purposes via electronic platform with consideration to proximity. The proposed system automates the conventional process of paying electricity bill by visiting the Electricity Board which is tiresome and time consuming. It is also designed to automate the electricity bill calculation and payment for user convenience. The system is developed with Java swings as the base programming language which can be used to develop websites, web applications and web services. The Microsoft Structured Query Language (SQL) server is also used for creating back-end database. The system would be having two logins: the administrative and user login. The administrator can view the user's account details and can add the customer's information of consuming units of energy of the current month in their account. The Admin must feed the system with the electricity usage data into respective user’s account. The system then calculates the electricity bill for every user and updates the information into their account every month. Users can then view their electricity bill and pay before the month end.
# INTRODUCTION 
This project aims at serving the department of electricity by computerizing the billing system.It mainly focuses on the calculation of units consumed during the specified time and the money to be charged by the electricity offices.This computerized system will make the overall billing system easy, accessible, comfortable, and effective for consumers.
<BR>
<BR>
To design the billing system more service oriented and simple, the following features have been implemented in the project:
<BR>
<BR>
o The application has high speed of performance with accuracy and efficiency.
<br>
<br>
o The software provides facility of data sharing, it does not require any staff as in the conventional system. Once it is installed on the system only the meter readings are to be given by the admin where customer can view all details, it has the provision of security restriction.
<br>
<br>
o The electricity billing software calculates the units consumed by the customer and makes bills, it requires small storage for installation and functioning. There is provision for debugging if any problem is encountered in the system.
<br>
<br>
o The system excludes the need of maintaining paper electricity bill, administrator does not have to keep a manual track of the users, users can pay the amount without visiting the office. Thus, it saves human efforts and resources.
# FEATURES/MODULES FOR ADMIN
## Login:
•	This feature will allow the admin to enter the username and password.
<br>
•	If the entered credentials are correct, then the login will be successful otherwise need to be signup.
<br>
•	If admin forgets password, it can be retrieved by giving username and answer for security question.
<br>
•	After successful login the admin will be redirected to admin portal page where he/she can do following activities.

## New Customer:
•	This feature will allow the admin to enter the customer details and automatically generates unique meter number.
<br>
•	If customer name, address, city, state, email and phone number is entered, insert the values into customer

## Customer Details:
•	This feature will allow the admin to view customer details.
<br>
•	If we need to print the particulars that has been viewed click onto print option.

## Deposit Details:
•	This feature will allow the admin to view bill details. If we need to sort the particulars based on meter_no and month.
<br>
•	If we need to search the particulars that has been viewed click onto search option.
<br>
•	If we need to print the particulars that has been viewed click onto print option.

## Tax Details:
•	This feature will allow the admin to add tax details. insert the values into tax
else print error
<br>
• Submit the details of tax that has been entered by clicking onto submit button.
<br>
•	If we need to cancel the particulars that has been entered click onto cancel option.

## Calculate Bill:
•	This feature will allow the admin to calculate total_bill when units consumed are inserted where meter_no and month is selected.
insert the values into bill else print error
<br>
<br>
• Submit the details of tax that has been entered by clicking onto submit button.
<br>
•	If we need to cancel the particulars that has been entered click onto cancel option.

## Delete Bill:
•	This feature will allow the admin to delete the customer info when meter_no is selected.
<br>
•	If we need to delete the particulars that has been saved click onto delete option.
<br>
•	If we need to cancel the particulars that has been entered click onto back option.

## About:
•	This feature will allow the admin to view details of the project in short.

# FEATURES/MODULES FOR CUSTOMER
## Login:
•	This program will allow the customer to enter the username and password. If the entered credentials are correct, then the login will be successful otherwise need to be signup with the meter_no which is given by admin.
<br>
•	If customer forgets password, it can be retrieved by giving username and answer for security question. After successful login the customer will be redirected to customer portal page where he/she can do following activities.

## Update Info:
•	This program will allow the customer to update the customer details. If customer address, city, state, email and phone number is updated,
update the values into customer else print error.
<br>
<br>
• update the details of customer that has been updated by clicking onto update button.
<br>
•	If we need to cancel the particulars that has been updated, click onto back option.

## View Info:
•	This program will allow the customer to view his/her own details.
<br>
•	If we need to go back from the particulars that has been viewed click onto back option.

## Pay Bill:
•	This program will allow the customer to view bill details and redirects to pay
<br>
•	the bill where status will be updated.
<br>
•	If we need to cancel the particulars that has been viewed click onto back option.
<br>
•	If we need to pay the bill amount that has been viewed click onto pay option.

## Bill Details:
•	This program will allow the customer to view bill details.
<br>
•	If we need to print the particulars that has been viewed click onto print option.

## Generate Bill:
•	This program will allow the customer to generate bill when meter_no and month is selected.
<br>
•	Generate the details by clicking on generatebill button.

## About:
•	This program will allow the customer to view details of the project in short.
# HOW TO RUN
Download the project folder then open the database.sql file in any mysql ide (WORKBENCH) run the sql script then in open the Electricity Billing System in NET BEANS or any other IDE that  supports java programming, enter your database credentials (userame,password) in connection file and that's it, you are good to go run login.java file and start benefiting. 
# SNAPSHOTS
<img width="732" height="480" alt="image" src="https://github.com/user-attachments/assets/792bd4b7-03b0-423a-8389-e6a8beba3955" />
<br>
<br>
<img width="778" height="368" alt="image" src="https://github.com/user-attachments/assets/5dd6d150-12d9-4ae5-8c33-6137b3d4324d" />
<br>
<br>
<img width="1207" height="757" alt="image" src="https://github.com/user-attachments/assets/ebaf775a-9958-4cb0-801d-8ea5e7fb3dcc" />
<br>
<br>
<img width="785" height="360" alt="image" src="https://github.com/user-attachments/assets/4a50e0af-2614-4c57-89a6-7d64e29af3a7" />
<br>
<br>
<img width="959" height="720" alt="image" src="https://github.com/user-attachments/assets/94f49f78-fcb3-429f-8b41-b1413c957448" />

