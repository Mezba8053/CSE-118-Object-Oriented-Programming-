# CSE-118 Object-Oriented Programming
Restaurant Apps
This repository contains a set of Java and JavaFX coursework projects for CSE-118. The code is organized as separate practice applications covering scenes, controls, animation, event handling, and a simple login/server example.

## Projects Included

- `JAVA FX/Animation` - JavaFX animation and event demos such as `BallSim`, `FrameRate`, `JFXHelloWorld`, `JFXKeyEvent`, `JFXSquare`, and `JFXTransform`
- `JAVA FX/Controls` - JavaFX controls, list view, and table view examples
- `JAVA FX/SingleScene` - A simple single-scene JavaFX application
- `JAVA FX/MultipleScene` - A JavaFX application that switches between multiple scenes
- `JAVA FX/LoginServer` - A JavaFX login example with client/server communication
- `JAVA FX/TestJavaFX` - A small JavaFX practice project
- `java_project` - Console-style object-oriented programming exercises and file-based restaurant/student examples

## Requirements

Before running the projects, install the following:

- Java Development Kit (JDK) 11 or newer
- JavaFX SDK compatible with your JDK if your IDE or runtime does not bundle JavaFX
- IntelliJ IDEA, VS Code, or another IDE that supports Java projects
- Maven for the sample project under `JAVA FX/Animation/src/sample/demo`

Suggested setup:

- JDK 17 is recommended for the JavaFX module-based projects
- Use the same Java version for compiling and running each project

## Repository Structure

```text
CSE-118-Object-Oriented-Programming-
├── JAVA FX
│   ├── Animation
│   ├── Controls
│   ├── LoginServer
│   ├── MultipleScene
│   ├── SingleScene
│   └── TestJavaFX
└── java_project
```

## How to Run

The projects in this repository are mostly independent. Open the folder for the project you want to run in your IDE and launch the main class for that module.

## Run Guide By Project

### `JAVA FX/SingleScene`

- Open `JAVA FX/SingleScene` in your IDE
- Run `sample.Main`

### `JAVA FX/MultipleScene`

- Open `JAVA FX/MultipleScene` in your IDE
- Run `sample.Main`

### `JAVA FX/Controls`

- Open `JAVA FX/Controls` in your IDE
- Run `sample.Main`

### `JAVA FX/TestJavaFX`

- Open `JAVA FX/TestJavaFX` in your IDE
- Run `sample.Main`

### `JAVA FX/Animation`

This folder contains several separate demo programs. Run one of these classes depending on what you want to test:

- `sample.BallSim`
- `sample.FrameRate`
- `sample.JFXHelloWorld`
- `sample.JFXKeyEvent`
- `sample.JFXSquare`
- `sample.JFXTransform`
- `sample.JFXEventTransform`

### `JAVA FX/Animation/src/sample/demo`

- Open the Maven project at `JAVA FX/Animation/src/sample/demo`
- Refresh Maven dependencies
- Run `javafx.Main`

### `JAVA FX/LoginServer`

- Open `JAVA FX/LoginServer` in your IDE
- Start `server.Server` first
- Then run `sample.Main` for the client side

### `java_project`

- Open `java_project` in your IDE
- Run `RestaurantApps`
- If you want the file-processing examples, you can also run `FileOperations` or `StudentList`

Typical entry points include:

- `sample.Main` in the JavaFX examples
- `server.Server` in `JAVA FX/LoginServer`
- `RestaurantApps` in `java_project`

If you are using IntelliJ IDEA:

1. Open the specific project folder, not the repository root.
2. Make sure the correct JDK is selected in Project Structure.
3. Add the JavaFX libraries to the module path if your IDE does not configure them automatically.
4. Run the `main` method of the desired class.

For the Maven sample in `JAVA FX/Animation/src/sample/demo`:

1. Open the Maven project.
2. Import dependencies and refresh the Maven project.
3. Run `javafx.Main` from `src/main/java`.

## Notes

- Some folders were created as standalone IDE projects, so there is no single top-level build file for the whole repository.
- If you plan to publish this repository publicly, consider adding a short screenshot or demo GIF for each project folder.