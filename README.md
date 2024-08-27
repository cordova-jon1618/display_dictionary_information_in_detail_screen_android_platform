# ESL Master
--------------
The project is to use for adult English learners to improve their knowledge of English. It uses a contextual approach to language learning and also uses documents as entry parameters to help establish the context in which to learn. The project is in the very beginning.
This repository contains the source code for the Android application. For the backend, please refer to https://gitlab.com/mxm_yrmnk/wordfrequency.
This project was done as the frontend for California State University, Northridge (CSUN) - Spring 2023 Semester - COMP 680: Advanced Software Engineering - Part of the Software Engineering and Computer Science Graduate Program.


# Authors and Acknowledgment
--------------

### Team Members and Github/Gitlab:
--------------
●	Jonathan Cordova          @cordova-jon1618          https://github.com/cordova-jon1618

●	Sergio Ramirez 	          @SergioRamirez1001        https://github.com/F2Binary

●	Shant Arslanian 	        @Shant.arslanian.472

●	Robin Yousefi 	          @robinYousefi

●	Ricardo Lopez-Aparicio    @imricardolopez

--------------

# Project structure
--------------

```

esl_master_android/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
│
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
│
├── .gitignore
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
├── LICENSE
├── CONTRIBUTING.md
└── README.md



```
## Table of Contents

- [Features](#features)
- [Screenshots](#screenshots)
- [Requirements](#requirements)
- [Installation](#installation)

## Features

Feature: Dictionary Information Display
Overview
This feature caters to language learners who seek to improve their understanding of words. The application offers detailed information about selected words, such as meaning, pronunciation, and other relevant data. It is compatible with the Android platform and uses a free online dictionary API for word information retrieval.

Included UI Features
Dictionary information display: The user interface presents the retrieved dictionary data for selected words in a clear and organized manner, allowing users to easily access information such as definition, pronunciation, syllabication, and part of speech.
Multiple definitions: If multiple definitions are available for a word, the UI effectively displays all of them in a comprehensible format.
Responsive design: The UI is designed to swiftly display the requested dictionary information within 5 seconds, ensuring a smooth user experience.
Non-intrusive presentation: The user interface showcases the dictionary information in a separate section or window, allowing users to continue their interaction with the contextual example without any disruption.

Example Use Case
A user selects a word within the contextual example and taps the dictionary button. The system promptly retrieves and exhibits the word's dictionary information, including aspects like definition, pronunciation, and part of speech, in a separate section or window. This enables users to effortlessly access and comprehend the meaning and usage of the chosen word without interrupting their current engagement with the application.

## Screenshots
--------------

![android_dict_screenshot4](https://github.com/user-attachments/assets/3ae14633-5aa4-44a1-987a-99552c604a20)

![android_dict_screenshot3](https://github.com/user-attachments/assets/629554b4-7b4c-4894-8c77-db57b04c2314)

![android_dict_screenshot2](https://github.com/user-attachments/assets/1d652eaf-0503-41bb-9959-607842f3c74e)

![android_dict_screenshot1](https://github.com/user-attachments/assets/d503d8bd-bb36-49fd-917c-2b01757998e9)

--------------

## Requirements

- Android Studio 2022.2.1.19 [https://developer.android.com/docs]
- Java 17.0.1 [https://devdocs.io/openjdk~17/]
- Gradle Groovy 4.0.11 [https://groovy-lang.org/documentation.html]
- Android SDK 12(API level 31, 32), 13(API level 33) [https://developer.android.com/tools/releases/platforms]
- Emulator - Google Pixel 7 Pro, Google Pixel 6a [https://developer.android.com/guide]
- Target Android Version 12, 13

## Installation

1. Clone this repository: `git clone https://gitlab.com/esl_master/esl_master_android.git`
2. Open the project in Android Studio.
3. Set up emulator

--------------
