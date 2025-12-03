# 🌦️ WeatherNow – Java Console Weather Application  
**Developer:** Mahipal Mali  
**Internship:** CodeClause – Java Development Intern  
**Project Duration:** 01 Dec 2025 – 31 Dec 2025  
**Project Type:** Console-Based Weather Application  

---

## 📌 Project Overview
WeatherNow is a Java-based console weather application that retrieves real-time weather information for any given location using a public weather API.  
The goal of this project is to demonstrate:

- Java programming skills  
- API integration  
- JSON data processing  
- Console-based user interaction  

This fully satisfies the requirements outlined by the **CodeClause Internship – Weather App Project**.

---

## 🎯 Aim
To build a weather application that retrieves and displays weather information for a user-entered city.

---

## 📝 Description
This is a console-based Java application where:

- The user inputs a city name.  
- The application calls the **OpenWeatherMap API**.  
- Real-time weather information is displayed (temperature, humidity, wind, condition, etc.).  
- The app continues running until the user chooses to exit.

---

## 🛠️ Technologies Used
- Java 17+  
- Maven (for dependency management)  
- OpenWeatherMap API  
- Jackson Databind (JSON parsing)  
- ANSI formatting (colored CLI UI)

---

## ✨ Key Features
- Fetches real-time weather data using API calls.  
- Clean and professional CLI interface.  
- Handles invalid inputs and API errors.  
- UTF-8 compatible banner/header.  
- Shaded JAR build for easy execution (all dependencies included).  
- User can repeatedly check weather for multiple cities.

---

## 📂 Project Structure

WeatherNow/
│── pom.xml
│── README.md
│── src/
│ └── main/
│ └── java/
│ └── com/
│ └── weathernow/
│ └── cli/
│ ├── Main.java
│ ├── Ui.java
│ ├── Config.java
│ ├── WeatherService.java
│ └── WeatherApiResponse.java
└── target/
└── weather-cli-1.0.jar

---

## 🔑 Requirements Before Running

### ✔ Install Java 17 or higher  
### ✔ Install Maven  
### ✔ Create an OpenWeatherMap API key  
https://openweathermap.org/

### ✔ Set your API key as an environment variable

#### Windows (PowerShell)

setx OPENWEATHER_API_KEY "YOUR_API_KEY"

Restart your terminal afterward.

---

## 🚀 How to Build

Run this inside the project folder:

mvn clean package

A runnable JAR will be generated inside the **target/** folder.

---

## ▶️ How to Run

Set terminal to UTF-8 (important for banner rendering):

chcp 65001

Run the application:

java -jar target/weather-cli-1.0.jar

#EXPECTED OUTPUT
<img width="1472" height="1066" alt="image" src="https://github.com/user-attachments/assets/3081b1ca-3a60-4837-99ad-47e9b2216a56" />

---

## 📚 Learning Outcomes
Throughout this project, the following skills were demonstrated:

- How to call external REST APIs from Java  
- Handling HTTP requests & responses  
- Parsing JSON into Java objects  
- Building applications using Maven  
- Managing JAR files  
- Designing a terminal-based UI  
- Debugging and error-handling for API failures  

These match the expected outcomes of the **CodeClause Java Development Internship**.

---

## 📦 Submission Package Includes
- Source code  
- Executable JAR file  
- README documentation  
- Screenshots of application output  

---

## 👨‍💻 Developer
**Mahipal Mali**  
Java Development Intern  
CodeClause Internship – December 2025

