# Selenium Java Automation Framework

A lightweight **Selenium WebDriver** automation framework built with **Java** and **Gradle 8.10**. This project is designed as a quick-reference, interview-preparation, and hands-on practice repository for core Selenium concepts such as locators, waits, window/alert/frame handling, and the Page Object Model (POM).

**Repository:** https://github.com/i-vrajesh/Selenium_Java

---

## Tech Stack

| Component | Details |
|---|---|
| Language | Java 17+ |
| Automation Library | Selenium WebDriver |
| Build Tool | Gradle 8.10 (wrapper included) |
| BDD Framework | Cucumber (Feature files + Step Definitions) |
| Test Framework | TestNG |
| IDEs Supported | IntelliJ IDEA, Eclipse |
| Browser | Chrome (default) |

---

## Project Objective

This repository is intended to serve as:

- A quick Selenium + Java **syntax reference**
- A practice project for **Selenium interview preparation**
- A demonstration of a clean, sample **automation framework structure**
- A hands-on environment to experiment with WebDriver commands

---

## Project Structure

```text
Selenium_Java
│
├── gradle
│   └── wrapper
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── practice
│   │   │       ├── Main.java
│   │   │       └── ReadFromProp.java
│   │   └── resources
│   │       └── config.properties
│   │
│   └── test
│       ├── java
│       │   ├── Pages
│       │   ├── Selenium
│       │   │   ├── Alerts.java
│       │   │   ├── AuthenticationPopup.java
│       │   │   ├── Base.java
│       │   │   ├── BasicControls.java
│       │   │   ├── BrokenLinks.java
│       │   │   ├── CalenderControls.java
│       │   │   ├── DragAndDrop.java
│       │   │   ├── Dropdowns.java
│       │   │   ├── FileUploads.java
│       │   │   ├── HandleFrames.java
│       │   │   ├── HandleTextBox.java
│       │   │   ├── JavaScriptExecutor.java
│       │   │   ├── Locators.java
│       │   │   ├── MouseActions.java
│       │   │   ├── Navigations.java
│       │   │   ├── Screenshot.java
│       │   │   ├── TimeAndWaits.java
│       │   │   ├── WebElementProperties.java
│       │   │   ├── WindowHandling.java
│       │   │   ├── XPath.txt
│       │   │   └── Xpaths.java
│       │   ├── StepDefs
│       │   |   └── stepsDefs.java
│       │   ├── TestNG
│       │   │   ├── DataProvider.java
│       │   │   ├── TestNG_Notes.txt
│       │   │   ├── TestNG_Parameters.java
│       │   │   ├── TestNG_Practice.java
│       │   │   ├── TestNG_Priority.java
│       │   │   └── TestNG_Annotations.java
│       │   └── TestRunner
│       │       └── CommonRunnerTest.java
│       │
│       └── resources
│           ├── Features
│           │   └── login.feature
│           └── testNG.xml
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── .gitignore
└── README.md
```

---

## Framework Components

**`practice` (main)** — Standalone Java practice classes outside the test scope, e.g. `Main.java` and `ReadFromProp.java` for reading values from `config.properties`.

**`Pages`** — Page Object classes containing element locators and reusable page-interaction methods.

**`Selenium`** — Core Selenium concept practice classes (`Base.java` for driver setup, plus individual classes for alerts, frames, dropdowns, waits, JavaScript executor, mouse actions, window handling, XPath, broken links, file uploads, and more).

**`StepDefs`** — Cucumber step definition classes that implement the steps written in the `.feature` files.

**`TestNG`** — TestNG-specific test classes/listeners.

**`TestRunner`** — Cucumber test runner class(es) that tie feature files to step definitions and execute them via TestNG/JUnit.

**`resources/Features`** — Gherkin `.feature` files (e.g. `login.feature`) describing test scenarios in BDD format.

**`resources/testNG.xml`** — TestNG suite XML for configuring and running test groups.

---

## Prerequisites

Install the following before running the project:

- **JDK 17** or above
- **Git**
- **IntelliJ IDEA** or **Eclipse**
- **Google Chrome** browser

Verify installations:

```bash
java --version
git --version
```

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/i-vrajesh/Selenium_Java.git
cd Selenium_Java
```

### 2. Build the Project (Gradle Wrapper)

```bash
./gradlew build
```

On Windows:

```cmd
gradlew.bat build
```

---

## Importing into IntelliJ IDEA

1. Open **IntelliJ IDEA**
2. Click **Open** and select the `Selenium_Java` project folder
3. IntelliJ auto-detects the `build.gradle` file and begins Gradle sync
4. Allow all dependencies to download
5. Once sync completes, the project is ready to run

To manually refresh dependencies:

```bash
./gradlew build
```

---

## Importing into Eclipse

### Step 1 — Install Buildship Gradle Plugin (if not already installed)

```text
Help → Eclipse Marketplace → Search "Buildship Gradle Integration" → Install
```

### Step 2 — Import the Project

```text
File → Import → Gradle → Existing Gradle Project
```

Browse to the cloned `Selenium_Java` folder and click **Finish**. Wait for Eclipse to resolve and download all Gradle dependencies.

---

## Running the Tests

### Via IntelliJ IDEA
Right-click the desired test class (under `Selenium`, `Pages`, or `TestRunner`) → **Run**

### Via Eclipse
Right-click the desired test class → **Run As** → **TestNG Test** (or **Cucumber Feature** for `.feature` files)

### Via TestNG Suite XML
Right-click `testNG.xml` → **Run As → TestNG Suite**

### Via Gradle CLI

Run all tests:

```bash
./gradlew test
```

Windows:

```cmd
gradlew.bat test
```

Clean build and run:

```bash
./gradlew clean test
```

---

## Selenium Concepts Covered

- Browser launch & configuration
- Locators: ID, Name, XPath, CSS Selector
- Waits: Implicit Wait, Explicit Wait
- Alerts & authentication pop-up handling
- Frames / iFrames
- Window handling (multiple tabs/windows)
- Dropdowns, calendar controls, drag and drop
- Mouse Actions class (mouse/keyboard interactions)
- JavaScript Executor
- File uploads
- Broken link checking
- Web element properties
- Page Object Model (POM)
- BDD with Cucumber (Feature files + Step Definitions)

---

## Future Enhancements

- [ ] Extent Reports
- [ ] Log4j2 logging
- [ ] Excel-based data-driven utilities
- [ ] Jenkins CI/CD pipeline
- [ ] Selenium Grid support
- [ ] Docker-based execution

---

## Author

**Rajesh Vatluri**
GitHub: [@i-vrajesh](https://github.com/i-vrajesh)

---

## License

This project is intended for **educational, learning, and interview preparation** purposes only.
