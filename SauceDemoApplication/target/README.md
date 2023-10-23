# SAUCE DEMO APPLICATION

This project contains automated UI test scripts for the SauceDemo website.

## Project Structure

The project structure is organized as follows:

- **Features/**: Gherkin feature files with test scenarios.
- **Runners/**: Cucumber test runners.
- **PageObj/**: Page object classes.
- **StepDefinitions/**: Step definition classes.

## Dependencies

### Required

- **IntelliJ IDE - Community Edition**
- **Java 10+**
- **JDK**

### Supported Operating Systems

Since this is a Java project, it is compatible with most major operating systems, including:

- **Mac OS X**
- **Windows**

## Test Runners/Libraries

This framework includes various libraries and test runners to execute automated tests:

**Cucumber**: A Behavior-Driven Development (BDD) framework using Gherkin syntax for readable tests.


## Reports

Cucumber reports are generated in `cucumber.html` under the `target` folder.

## Getting Started

1. Clone this repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Install the required dependencies and tools mentioned in the "Dependencies" section.

## Running Tests

You can run tests using Cucumber or other test runners implemented in the project. Each test runner is independent and located in the `test` package.

### Cucumber

To run tests using Cucumber, follow these steps:

1. Open the test runner class in your IDE.
2. Right-click on the runner class and select "Run."
