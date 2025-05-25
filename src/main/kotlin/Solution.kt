package solution

import java.util.*

/**
 * Core class that manages student performance tracking operations
 */
class Solution
{
    private val studentScores = mutableMapOf<String, Int>()
    private val rand = Random()

    /**
     * Main execution method
     */
    fun run()
    {
        try
        {
            // Add sample students
            addStudent("Haruki")
            addStudent("Ren")
            addStudent("Sakura")
            addStudent("Takashi")
            addStudent("Yumi")

            // Display all students
            printStudentScores()

            // Find top performer
            findTopStudent()

            // Interactive lookup
            println("\nEnter a student name to check if they exist:")
            val input = readLine() ?: ""
            checkIfStudentExists(input)
        }
        catch (ex: Exception)
        {
            println("[ERROR]: ${ex.message}")
        }
    }

    private fun addStudent(name: String)
    {
        try
        {
            val score = 85 + rand.nextInt(15) // 85-99
            studentScores[name] = score
        }
        catch (ex: IllegalArgumentException)
        {
            println("[WARNING]: Student $name already exists")
        }
    }

    private fun printStudentScores()
    {
        println("\nStudent Scores")
        println("*********************")
        studentScores.forEach { (name, score) ->
            println("$name: $score")
        }
        println("*********************")
    }

    private fun findTopStudent()
    {
        if (studentScores.isEmpty())
        {
            println("No students available")
            return
        }

        val topStudent = studentScores.maxBy { it.value }
        println("\nTop Student: ${topStudent.key} with score ${topStudent.value}")
    }

    private fun checkIfStudentExists(name: String)
    {
        when (val score = studentScores[name])
        {
            null -> println("$name not found in records")
            else -> println("$name exists with score $score")
        }
    }
}
