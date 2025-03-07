# Proxify.gg Testing Suite

## Project Overview
This repository contains test artifacts and automation scripts for testing the Proxify.gg platform. The project includes test cases, bug reports, and automated test scripts to ensure platform stability and functionality.

## Directory Structure
```
vikashh01-proxify/
├── README.md                        # Project documentation
├── Bug Report For Proxify.gg.xlsx    # Bug reports for Proxify.gg
├── Test Cases For Proxify.gg.xlsx    # Detailed test cases
├── Test Plan For Proxify.gg.docx     # Test planning document
├── Test Scenario For Proxify.xlsx    # Test scenarios document
├── pom.xml                           # Maven configuration file
├── recording.conf                    # Configuration file for test recording
├── src/
│   └── test/
│       └── java/
│           ├── Pages/                # Page Object Model (POM) classes
│           │   ├── BuyNowPage.java
│           │   ├── LoginPage.java
│           │   └── PaymentPage.java
│           └── tests/                # Automated test cases
│               ├── BuyNowTest.java
│               └── LoginTest.java
└── test-output/
    ├── emailable-report.html          # TestNG report (emailable)
    ├── index.html                      # Main test report
    ├── testng-results.xml              # TestNG results
    ├── testng-reports.css              # CSS for test reports
    ├── testng-reports.js               # JS for test reports
    ├── Default suite/
    │   ├── Default test.html
    │   ├── Default test.xml
    │   └── testng-failed.xml
    └── junitreports/
        ├── TEST-Assignment.LoginTest.xml
        ├── TEST-tests.BuyNowTest.xml
        └── TEST-tests.LoginTest.xml
```

## Setup and Execution
### Prerequisites
- Java (JDK 8 or later)
- Maven
- TestNG
- Selenium WebDriver

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/vikashh01-proxify.git
   cd vikashh01-proxify
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```

### Running Tests
- Run all test cases:
  ```sh
  mvn test
  ```
- Run specific test classes:
  ```sh
  mvn -Dtest=LoginTest test
  ```

### Test Reports
After execution, reports are generated in the `test-output/` directory. Open `test-output/index.html` to view the detailed TestNG report.

