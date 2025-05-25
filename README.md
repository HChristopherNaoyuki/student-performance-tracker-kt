# Student Performance Tracker

## Overview

The **Student Performance Tracker** is a simple Kotlin application designed to track the performance of students. It allows for:

* Adding students with random scores.
* Displaying all students with their respective scores.
* Finding the top-performing student based on their score.
* Checking if a student exists in the records by entering their name.

The app simulates a real-world scenario where student performance (in the form of scores) is tracked and used for further analysis.

---

## Features

* **Add Students**: Adds students to the system with random scores between 85 and 99.
* **Display Scores**: Displays a list of all students with their corresponding scores.
* **Top Performer**: Finds and displays the student with the highest score.
* **Student Lookup**: Allows the user to check if a student exists in the records by name.

---

## Prerequisites

Before you begin, make sure you have the following installed:

* **Kotlin**: Make sure you have Kotlin installed on your system. You can download it from [here](https://kotlinlang.org/).
* **JDK**: The application uses Java, so ensure you have the Java Development Kit (JDK) installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

---

## Code Walkthrough

### `Main.kt`

This file serves as the entry point for the application. The `main()` function is responsible for initiating the program's execution:

```kotlin
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            try {
                val solution = Solution()
                solution.run()  // Calls the main execution method in the Solution class
            } catch (issue: Exception) {
                println("[ISSUE]: ${issue.message}")  // Handles any errors that might occur
            }
        }
    }
}
```

### `Solution.kt`

The `Solution` class handles all the main functionality for managing student scores. It includes methods for adding students, displaying scores, finding the top student, and checking if a student exists.

1. **Properties**:

   * `studentScores`: A mutable map that stores student names and their scores.
   * `rand`: An instance of `Random` used to generate random scores for students between 85 and 99.

2. **Methods**:

   * `run()`: Main execution method where the core logic of the program is executed.
   * `addStudent(name: String)`: Adds a student to the `studentScores` map with a random score between 85 and 99.
   * `printStudentScores()`: Prints the list of all students and their scores.
   * `findTopStudent()`: Finds and prints the student with the highest score.
   * `checkIfStudentExists(name: String)`: Checks if a student exists in the records and prints their score if they do.

---

## Usage

Once the program is running, you can interact with it in the following ways:

1. **Add Students**: The program will automatically add a few students (e.g., Haruki, Ren, Sakura, etc.) with random scores when it starts.
2. **Display Scores**: The scores of all the students will be printed to the console.
3. **Top Performer**: The program will display the top student with the highest score.
4. **Student Lookup**: After displaying the top performer, the program will prompt you to enter a student name to check if they exist in the system. If the student exists, their score will be shown.

Example of interaction:

```
Student Scores
*********************
Haruki: 92
Ren: 88
Sakura: 95
Takashi: 89
Yumi: 86
*********************

Top Student: Sakura with score 95

Enter a student name to check if they exist:
Ren
Ren exists with score 88
```

---

## Error Handling

* **Student Already Exists**: If an attempt is made to add a student that already exists, a warning message will be printed.
* **Empty Student Records**: If there are no students in the records, a message will inform the user that no students are available.
* **Invalid Input**: If the user enters a name that does not exist in the records, a message will indicate that the student is not found.

---

## Example Code

Here’s a simplified example of how the main logic works:

```kotlin
fun run() {
    // Adding students
    addStudent("Haruki")
    addStudent("Ren")
    addStudent("Sakura")
    
    // Display all students and scores
    printStudentScores()

    // Find top student
    findTopStudent()

    // Check if a student exists
    println("\nEnter a student name to check if they exist:")
    val input = readLine() ?: ""
    checkIfStudentExists(input)
}
```

---

## Contributing

If you’d like to contribute to this project, you can:

1. Fork the repository.
2. Create a new branch for your changes.
3. Commit your changes.
4. Push your changes and create a pull request.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

* Kotlin for providing an elegant and powerful language to build this application.
* JetBrains for their excellent Kotlin development tools and IDE (IntelliJ IDEA).

---
