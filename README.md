🌦️ WeatherNow – Java Console Weather Application
Developer: Mahipal Mali
Internship: CodeClause – Java Development Intern
Project Duration: 01 Dec 2025 – 31 Dec 2025
Project Type: Console-Based Weather Application
📌 Project Overview

WeatherNow is a Java-based console weather application that retrieves real-time weather information for any given location using a public weather API.
The goal of this project is to demonstrate:

Java programming skills

API integration

JSON data processing

Console-based user interaction

This fully satisfies the requirements outlined by CodeClause Internship Program – Weather App Project.

🎯 Aim

To build a weather application that retrieves and displays weather information for a user-entered city.

📝 Description

This is a console-based Java application where:

The user inputs a city name.

The application calls the OpenWeatherMap API.

Real-time weather information is displayed clearly in the terminal (temperature, humidity, wind, condition, etc.).

The app continues running until the user chooses to exit.

🛠️ Technologies Used

Java 17+

Maven (for dependency management)

OpenWeatherMap API

Jackson Databind (for JSON parsing)

ANSI Formatting (for colored CLI UI)

✨ Key Features

Fetches real-time weather data using API calls.

Clean, professional CLI interface.

Error handling for invalid inputs or API issues.

UTF-8 compatible header/banner in the terminal.

Shaded JAR build for easy execution (no manual dependency setup).

User can repeatedly check multiple cities.

🧩 Project Structure
WeatherNow/
├─ pom.xml
├─ README.md
├─ src/
│  └─ main/
│     └─ java/
│        └─ com/
│           └─ weathernow/
│              └─ cli/
│                 ├─ Main.java
│                 ├─ Ui.java
│                 ├─ Config.java
│                 ├─ WeatherService.java
│                 └─ WeatherApiResponse.java
└─ target/
   └─ weather-cli-1.0.jar (or weather-cli-1.0-shaded.jar)

🔑 Requirements Before Running

Install Java 17 or later

Install Maven

Create an OpenWeatherMap API key
https://openweathermap.org/

Set the API key as an environment variable

Windows (PowerShell)
setx OPENWEATHER_API_KEY "YOUR_API_KEY"


Then restart your terminal.

🚀 How to Build

Run this inside the project folder:

mvn clean package


A runnable JAR will be generated inside the target/ folder.

▶️ How to Run

Because the banner uses UTF-8 characters, set the terminal to UTF-8:

chcp 65001


Then run the application:

java -jar target\weather-cli-1.0.jar


or shaded version:

java -jar target\weather-cli-1.0-shaded.jar

🖥️ Example Output

<img width="1408" height="1067" alt="image" src="https://github.com/user-attachments/assets/3decd1ec-d185-447b-9a96-acffd451c647" />

📚 Learning Outcomes

Throughout this project, the following skills were demonstrated:

How to call external REST APIs from Java

Handling HTTP requests & responses

Parsing JSON into Java objects

Building applications using Maven

Managing JAR files

Designing a terminal-based UI

Debugging and error-handling for API failures

These match the expected outcomes of the CodeClause Java Development Internship.

📦 Submission Package Includes

Source code

Executable JAR file

README documentation

Screenshots of application output

👨‍💻 Developer

Mahipal Mali
Java Development Intern
CodeClause Internship – December 2025
