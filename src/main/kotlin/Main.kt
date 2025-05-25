package solution

/**
 * Entry point for the Student Performance Tracker application
 */
class Main
{
    companion object
    {
        /**
         * Main method to start the application
         */
        @JvmStatic
        fun main(args: Array<String>)
        {
            try
            {
                val solution = Solution()
                solution.run()
            }
            catch (issue: Exception)
            {
                println("[ISSUE]: ${issue.message}")
            }
        }
    }
}