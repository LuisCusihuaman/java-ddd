# ☕🚀 Java DDD

[![Workflow Status](https://github.com/LuisCusihuaman/java-ddd/workflows/Main%20Workflow/badge.svg)](https://github.com/LuisCusihuaman/java-ddd/actions)

## ℹ️ Introduction

This is a project for a company that sells courses and wants a mono-repo following DDD (Domain-Driven Design), Hexagonal
Architecture, and Event-Driven Design. It uses Java with JUnit and Gradle.

## 🏁 How To Start

1. Install Java 21 using `sdkman`:
    ```sh
    curl -s "https://get.sdkman.io" | bash
    source "$HOME/.sdkman/bin/sdkman-init.sh"
    sdk install java 21.0.2-open
    ```
2. Set it as your default JVM:
    ```sh
    sdk default java 21.0.2-open
    ```
3. Clone this repository:
    ```sh
    git clone https://github.com/LuisCusihuaman/java-ddd
    cd java-ddd
    ```
4. Bring up the Docker environment (if applicable):
    ```sh
    make up
    ```
5. Execute some [Gradle lifecycle tasks](https://docs.gradle.org/current/userguide/java_plugin.html#lifecycle_tasks) to
   check everything is OK:
    1. Create [the project JAR](https://docs.gradle.org/current/userguide/java_plugin.html#sec:jar):
        ```sh
        make build
        ```
    2. Run the tests and plugins verification tasks:
        ```sh
        make test
        ```
6. Start developing!

## ☝️ How to update dependencies

* Gradle (current version: 5.6 - [releases](https://gradle.org/releases/)):
    ```sh
    ./gradlew wrapper --gradle-version=5.6 --distribution-type=bin
    ```
  or modify the [gradle-wrapper.properties](gradle/wrapper/gradle-wrapper.properties)
* JUnit (current version: 5.5.1 - [releases](https://junit.org/junit5/docs/snapshot/release-notes/index.html)):
  [`build.gradle:11`](build.gradle)
