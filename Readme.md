# Trello API Automation Testing Project

## Project Overview
This project aims to test Trello's REST APIs using RestAssured. 
Trello is a team management web application where teams can collaborate, manage projects, and reach new productivity peaks.
This project includes testing various functionalities such as
* creating and deleting boards
* creating and retrieving lists within a board
* archiving, and un-archiving lists.


## Features
##### Modular Design: 
The project is structured to have a clear separation between setup and test execution, 
promoting code reuse and maintainability.

##### Dynamic Credential Management:
The CredentialManager class loads API keys and tokens from a properties file,
ensuring secure and dynamic handling of credentials.

##### Automated Reporting: The test results include the status of features, execution time, and individual test step statuses,
aiding in comprehensive reporting and analysis.


## How to Use
##### Setup: 
Ensure the creds.Properties file is correctly configured with your Trello API key and token.

##### Run Tests: 
Execute the test suite using TestNG. The tests will automatically initialize specifications,
perform API operations, and validate responses.

##### Review Results: 
Check the generated test reports for a detailed overview of test execution and results.

## Conclusion:
This project demonstrates a robust approach to API automation testing for Trello's REST APIs using RestAssured.
By following best practices in test design and implementation, it ensures thorough validation of Trello functionalities, 
contributing to reliable and maintainable automated testing.