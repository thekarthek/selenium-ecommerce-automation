# Selenium Ecommerce Automation Framework

## 📌 Project Overview

This project is a Selenium-based automation framework developed using Java, TestNG, and Maven.  
It automates the login functionality of a demo ecommerce application using the Page Object Model (POM) design pattern.

The framework is designed with clean architecture, scalability, and maintainability in mind.

---

## 🛠 Tech Stack

- Java 11
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Git & GitHub

---

## 🏗 Framework Design

The project follows the Page Object Model (POM) design pattern.

### Folder Structure

```

selenium-ecommerce-automation
│
├── src
│   └── test
│       └── java
│           ├── base
│           │   └── BaseTest.java
│           ├── pages
│           │   ├── LoginPage.java
│           │   └── HomePage.java
│           └── tests
│               └── LoginTest.java
│
├── pom.xml
├── testng.xml
└── README.md

```

---

## 🚀 Features Implemented

- Page Object Model structure
- Explicit Wait implementation
- TestNG Assertions
- Maven build management
- Git version control
- Clean project architecture

---

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

```

git clone [https://github.com/thekarthek/selenium-ecommerce-automation.git](https://github.com/thekarthek/selenium-ecommerce-automation.git)

```

### 2️⃣ Navigate to project folder

```

cd selenium-ecommerce-automation

```

### 3️⃣ Run tests using Maven

```

mvn clean test

```

---

## 🧪 Test Scenario Automated

- Valid login test
- Verifies successful navigation to Products page
- Assertion-based validation

---

## 📈 Future Enhancements

- Screenshot capture on failure
- Extent Reports integration
- Data-driven testing (Excel)
- Parallel execution
- CI/CD using GitHub Actions

---

## 👤 Author

**Bangaru Karthik Reddy**  
Automation Test Engineer | Software Engineer Aspirant
```

---

# ✅ After Creating README

Run:

```
git add README.md
git commit -m "Added professional README"
git push
